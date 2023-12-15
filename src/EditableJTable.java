import controlmestizaje.Conexion;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.Vector;
import java.util.ArrayList;
import java.util.List;

public class EditableJTable extends JFrame {

    private JTable tablaProductos;
    private MyTableModel tableModel;
    private Conexion conexion;
   private List<CostoUpdate> cambiosCosto;

   private void cerrarConexion() {
       if (conexion != null) {
           conexion.closeConnection();
       }
    }
    public EditableJTable() {
        conexion = new Conexion();
        cambiosCosto = new ArrayList<>();
        tableModel = new MyTableModel();

        tablaProductos = new JTable(tableModel);
        tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(30);
        tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(80);
        tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(60);
        tablaProductos.getColumnModel().getColumn(4).setPreferredWidth(100);
        tablaProductos.getColumnModel().getColumn(5).setPreferredWidth(100);

        

        // Agregar TableModelListener para detectar los cambios realizados en la tabla
        tableModel.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    int row = e.getFirstRow();
                    int column = e.getColumn();
                    if (column == 3) { // Si el cambio fue en la columna "costo"
                        double nuevoCosto = (double) tableModel.getValueAt(row, column);
                        int idProducto = (int) tableModel.getValueAt(row, 0);

                        // Agregar el cambio a la lista de cambiosCosto
                        cambiosCosto.add(new CostoUpdate(idProducto, nuevoCosto));
                    }
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(tablaProductos);
        scrollPane.setPreferredSize(new Dimension(600, 300));

        add(scrollPane);

        setTitle("Productos App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        // Agregar un WindowListener para cerrar la conexión al cerrar la ventana principal
        addWindowListener(new WindowAdapter() {
            @Override
           public void windowClosing(WindowEvent e) {
                actualizarCambiosCostoEnBD();
                cerrarConexion();
            }
        });
    }
    
    

private void actualizarCambiosCostoEnBD() {
    if (!cambiosCosto.isEmpty()) {
        try (Connection conn = conexion.getConnection()) {
            String sql = "UPDATE Producto SET costo = ? WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                for (CostoUpdate costoUpdate : cambiosCosto) {
                    pstmt.setDouble(1, costoUpdate.getNuevoCosto());
                    pstmt.setInt(2, costoUpdate.getIdProducto());
                    pstmt.executeUpdate();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

   private class CostoUpdate {
        private int idProducto;
        private double nuevoCosto;

        public CostoUpdate(int idProducto, double nuevoCosto) {
            this.idProducto = idProducto;
            this.nuevoCosto = nuevoCosto;
        }

        public int getIdProducto() {
            return idProducto;
        }

        public double getNuevoCosto() {
            return nuevoCosto;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EditableJTable());
    }

    private class MyTableModel extends DefaultTableModel {
        MyTableModel() {
            // Obtener los datos de la base de datos y cargarlos en la tabla
            String[] columnas = {"id", "nombre", "unidad_de_medida", "costo", "tipo_de_insumo", "fecha_de_registro"};
            Vector<Vector<Object>> data = new Vector<>();
            try {
                Connection conn = conexion.getConnection();
                String sql = "SELECT id, nombre, unidad_de_medida, costo, tipo_de_insumo, fecha_de_registro FROM Producto";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {
                    Vector<Object> row = new Vector<>();
                    for (int i = 1; i <= columnas.length; i++) {
                        row.add(rs.getObject(i));
                    }
                    data.add(row);
                }

                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            setDataVector(data, new Vector<>(java.util.Arrays.asList(columnas)));
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return column == 3; // Solo permitir editar la columna "costo"
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (columnIndex == 3) {
                return Double.class; // Indicar que el tipo de datos en la columna "costo" es Double
            } else {
                return super.getColumnClass(columnIndex);
            }
        }
    }
}