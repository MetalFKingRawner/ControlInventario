/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlmestizaje.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rawne
 */
public class Inventario extends javax.swing.JFrame {

    /**
     * Creates new form Inventario
     */
    public Inventario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(660, 410));

        jPanel2.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Unidad medida", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(42, 40, 560, 260);

        jButton2.setBackground(new java.awt.Color(0, 51, 153));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Mostrar productos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(180, 320, 170, 23);

        jButton3.setBackground(new java.awt.Color(0, 51, 153));
        jButton3.setFont(new java.awt.Font("Lucida Sans", 3, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(380, 320, 100, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlmestizaje/fondoblanco.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 20, 610, 340);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlmestizaje/fondomora (1).jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 380);

        jTabbedPane1.addTab("Actualizar inventario", jPanel2);

        jPanel3.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID_producto", "Nombre", "Unidad medida", "Cantidad", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(60, 50, 530, 240);

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ver inventario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(260, 310, 150, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlmestizaje/fondoblanco.jpg"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 20, 610, 340);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlmestizaje/fondomora (1).jpg"))); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(0, 0, 650, 380);

        jTabbedPane1.addTab("Visualizar inventario", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        actualizar(jTable1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        updateTablaProducto(jTable2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modeloTablaIns = (DefaultTableModel) jTable2.getModel();
        try {
            con = new Conexion();
                for (int i = 0; i < modeloTablaIns.getRowCount(); i++) {
                    // Obtener datos de la fila
                    int idProducto = Integer.parseInt(modeloTablaIns.getValueAt(i, 0).toString());
                    String uni =modeloTablaIns.getValueAt(i, 2).toString();
                    try{
                        double cantidad = Double.parseDouble(modeloTablaIns.getValueAt(i, 3).toString()); 
                        String sql = "INSERT INTO inventario(id_producto, unidad_de_medida, cantidad, fecha) VALUES (?, ?, ?, NOW())";
                        PreparedStatement pstmt = con.getConnection().prepareStatement(sql);
                        pstmt.setInt(1, idProducto);
                        pstmt.setString(2, uni);
                        pstmt.setDouble(3, cantidad);
                        int filasAfectadas = pstmt.executeUpdate();
                         if (filasAfectadas > 0) {
                    // Insertar el nuevo registro en la tabla 'recetaxproducto'
                            //JOptionPane.showMessageDialog(null, "Inventario actualizado exitosamente.");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "No se pudo actualizar.");}
                            pstmt.close();
                     }
                     catch(NullPointerException ex){
                        continue;
                    }
                }
                
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");}
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void updateInventario(){
        
    }
    
    private void updateTablaProducto(JTable tabla){             
        String[] columNames = {"id", "nombre", "Unidad medida","Cantidad"};  
        // se utiliza la funcion
        dtPro = getDatosP();
        // se colocan los datos en la tabla
        DefaultTableModel datos = new DefaultTableModel(dtPro,columNames);                           
        tabla.setModel(datos); 
    }
    
    public Object [][] getDatosP(){
        Conexion con = new Conexion();
        int registros = 0;
        try{         
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT count(id) as total FROM producto");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.out.println(e);
        }    
        Object[][] data = new String[registros][6];
        try{    
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
                " id, nombre, unidad_de_medida" +
                " FROM producto" +
                " ORDER BY id");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while(res.next()){
                String idreceta = res.getString("id");
                String nombreceta = res.getString("nombre");
                String med = res.getString("unidad_de_medida");
                data[i][0] = idreceta;            
                data[i][1] = nombreceta;
                data[i][2] = med;
                i++;
            }
            res.close();
        }catch(SQLException e){
         System.out.println(e);
        }
        return data;
    }
    
    Object[][] dtPro;
    private void actualizar(JTable tabla){
        String[] columNames = {"ID", "ID_producto","Nombre", "unidad_de_medida","cantidad","fecha"};  
        // se utiliza la funcion
        dtPro = getdat(tabla);
        // se colocan los datos en la tabla
        DefaultTableModel datos = new DefaultTableModel(dtPro,columNames);                           
        tabla.setModel(datos); 
    }
    public Object [][] getDatos(){
        Conexion con = new Conexion();
        int registros = 0;
        try{         
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT count(id) as total FROM inventario");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.out.println(e);
        }    
        Object[][] data = new String[registros][6];
        try{    
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
                " id, id_producto, unidad_de_medida, cantidad, fecha" +
                " FROM inventario" +
                " ORDER BY id");
            
            
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while(res.next()){
                String id = res.getString("id");
                String idreceta = res.getString("id_producto");
                String nombreceta = res.getString("unidad_de_medida");
                String cantidad = res.getString("cantidad");
                String porcioness = res.getString("fecha");
                data[i][0] = id;
                data[i][1] = idreceta;            
                data[i][2] = nombreceta;
                data[i][3] = cantidad;
                data[i][4] = porcioness;
                i++;
            }
            res.close();
        }catch(SQLException e){
         System.out.println(e);
        }
        return data;
    }
    private Conexion con;
    private Object [][] getdat(JTable tabla){
        Conexion con = new Conexion();
        int registros = 0;
        try{         
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT count(id) as total FROM inventario");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.out.println(e);
        }    
        Object[][] data = new String[registros][6];
        DefaultTableModel modeloJTable4 = (DefaultTableModel) tabla.getModel();
        modeloJTable4.setRowCount(0);

        try {
            con = new Conexion();
            // Consulta SQL para obtener datos de recetaxproducto
            String sql = "SELECT r.id, r.id_producto, r.unidad_de_medida, r.cantidad, r.fecha, p.nombre "
                    + "FROM inventario r "
                    + "JOIN producto p ON r.id_producto = p.id";

            // Prepara la sentencia SQL
            PreparedStatement statement = con.getConnection().prepareStatement(sql);

            // Ejecuta la consulta
            ResultSet resultSet = statement.executeQuery();

            // Llena jTable4 con los resultados
            int i = 0;
            while (resultSet.next()) {
                String ids = resultSet.getString("r.id");
                String idProducto = resultSet.getString("r.id_producto");
                String unidadMedida = resultSet.getString("r.unidad_de_medida");
                String cantidad = resultSet.getString("r.cantidad");
                String fecha = resultSet.getString("r.fecha");
                String nombreProducto = resultSet.getString("p.nombre");
                data[i][0] = ids;            
                data[i][1] = idProducto;
                data[i][2] = nombreProducto;
                data[i][3] = unidadMedida;
                data[i][4] = cantidad;
                data[i][5] = fecha;
                i++;
            }

            // Cierra los recursos
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Maneja la excepción según tus necesidades
        }
        return data;
    }
    
    private void llenarTabla() {
        DefaultTableModel newModel = new DefaultTableModel();
        newModel.addColumn("id_Producto");
        newModel.addColumn("Producto");
        newModel.addColumn("Unidad_de_medida");
        newModel.addColumn("Cantidad");
        try {
            Conexion con = new Conexion();
            PreparedStatement stmt = con.getConnection().prepareStatement("SELECT id, nombre, unidad_de_medida FROM producto");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                newModel.addRow(new Object[]{rs.getInt("id"),rs.getString("nombre"), rs.getString("unidad_de_medida"), ""});
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        jTable2.setModel(newModel);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
