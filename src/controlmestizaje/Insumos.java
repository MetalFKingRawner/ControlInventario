/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlmestizaje;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
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
public class Insumos extends javax.swing.JFrame {

    public String no;
    /**
     * Creates new form Insumos
     */
    public Insumos(String nombr) {
        this.no = nombr;
        //JOptionPane.showMessageDialog(null,no);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Unidad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Costo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TipoInsumo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPro = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insumos");
        setBackground(new java.awt.Color(102, 0, 102));
        setPreferredSize(new java.awt.Dimension(660, 410));

        jTabbedPane1.setBackground(new java.awt.Color(102, 0, 102));

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setText("Nombre del insumo");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 80, 170, 30);

        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        jPanel1.add(nombre);
        nombre.setBounds(280, 80, 260, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel4.setText("Unidad de medida");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 130, 170, 30);

        Unidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pz", "Kg", "Gr", "Ml", "Lt" }));
        jPanel1.add(Unidad);
        Unidad.setBounds(350, 130, 120, 30);

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel5.setText("Costo");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 190, 70, 17);

        Costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CostoKeyTyped(evt);
            }
        });
        jPanel1.add(Costo);
        Costo.setBounds(280, 180, 260, 30);

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel6.setText("Tipo de insumo");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 230, 130, 20);

        TipoInsumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimento", "Bebida", "Lácteo", "Panadería", "Condimento/Especia", "Limpieza/Higiene", "Cocina", "Envase/Empaque", "Licor", "Otro" }));
        jPanel1.add(TipoInsumo);
        TipoInsumo.setBounds(350, 230, 120, 30);

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aceptar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 290, 90, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlmestizaje/fondoblanco.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 50, 520, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlmestizaje/fondomora (1).jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 380);

        if(no.equalsIgnoreCase("isaac")){

            jTabbedPane1.addTab("Agregar insumo", jPanel1);
        }

        jPanel2.setLayout(null);

        tabPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Unidad", "Costo", "TipoInsumo", "Fecha"
            }
        ));
        tabPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabProMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPro);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(240, 40, 390, 300);

        jButton2.setBackground(new java.awt.Color(0, 51, 153));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(120, 310, 110, 23);

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel9.setText("Nombre");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(100, 40, 70, 14);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(40, 60, 180, 30);

        jLabel10.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel10.setText("Unidad de medida");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(70, 100, 140, 17);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(40, 180, 180, 30);

        jLabel11.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel11.setText("Costo");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(110, 160, 40, 17);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pz", "Kg", "Gr", "Ml", "Lt" }));
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(100, 130, 70, 20);

        jLabel12.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel12.setText("Tipo de insumo");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(70, 220, 130, 14);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimento", "Bebida", "Lácteo", "Panadería", "Condimento/Especia", "Limpieza/Higiene", "Cocina", "Envase/Empaque", "Licor", "Otro" }));
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(70, 250, 120, 20);

        jButton3.setBackground(new java.awt.Color(0, 51, 153));
        jButton3.setFont(new java.awt.Font("Lucida Sans", 3, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(30, 310, 80, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlmestizaje/fondoblanco.jpg"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 20, 620, 330);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlmestizaje/fondomora (1).jpg"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 0, 660, 380);

        if(no.equalsIgnoreCase("isaac")){

            jTabbedPane1.addTab("Editar insumo", jPanel2);
        }

        jPanel4.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Unidad", "Costo", "Tipo insumo", "Fecha"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(50, 40, 540, 240);

        jButton5.setBackground(new java.awt.Color(0, 51, 153));
        jButton5.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(190, 310, 100, 29);

        jButton6.setBackground(new java.awt.Color(0, 51, 153));
        jButton6.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Actualizar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6);
        jButton6.setBounds(350, 310, 120, 29);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlmestizaje/fondoblanco.jpg"))); // NOI18N
        jPanel4.add(jLabel16);
        jLabel16.setBounds(20, 20, 610, 340);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlmestizaje/fondomora (1).jpg"))); // NOI18N
        jPanel4.add(jLabel15);
        jLabel15.setBounds(0, 0, 660, 380);

        if(no.equalsIgnoreCase("isaac")){

            jTabbedPane1.addTab("Eliminar insumos", jPanel4);
        }

        jPanel3.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Unidad", "Costo", "Tipo insumo", "Fecha"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(50, 30, 560, 260);

        jButton4.setBackground(new java.awt.Color(0, 51, 153));
        jButton4.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Visualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(270, 310, 130, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlmestizaje/fondoblanco.jpg"))); // NOI18N
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 20, 620, 340);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlmestizaje/fondomora (1).jpg"))); // NOI18N
        jPanel3.add(jLabel13);
        jLabel13.setBounds(0, 0, 660, 400);

        jTabbedPane1.addTab("Visualización de insumos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nom = nombre.getText();
        String unidad = (String) Unidad.getSelectedItem();
        String costoStr = Costo.getText();
        String tipoInsumo = (String) TipoInsumo.getSelectedItem();
        if (nom.isEmpty()|| unidad.isEmpty() || costoStr.isEmpty() || tipoInsumo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.");
            return;}
        double cost = Double.parseDouble(costoStr);
        try {
            con = new Conexion();
            String sql = "INSERT INTO producto(nombre, unidad_de_medida, costo, tipo_de_insumo, fecha_de_registro) VALUES (?, ?, ?, ?, NOW())";
            PreparedStatement pstmt = con.getConnection().prepareStatement(sql);
            pstmt.setString(1, nom);
            pstmt.setString(2, unidad);
            pstmt.setDouble(3, cost);
            pstmt.setString(4, tipoInsumo);
            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Insumo agregado exitosamente.");} 
            else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el insumo.");}
            pstmt.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        updateTablaProducto(tabPro);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nom = jTextField1.getText();
        String unidad = (String) jComboBox1.getSelectedItem();
        String costoStr = jTextField2.getText();
        String tipoInsumo = (String) jComboBox2.getSelectedItem();
        int fila2 = tabPro.getSelectedRow();
        if(fila2 != -1){
            Object idpro = tabPro.getValueAt(fila2,0);
            int id=Integer.parseInt(idpro.toString());
            if (nom.isEmpty()|| unidad.isEmpty() || costoStr.isEmpty() || tipoInsumo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.");
                return;}
            double cost = Double.parseDouble(costoStr);
            try {
                con = new Conexion();
                String sql = "update producto set nombre=?, unidad_de_medida=?, costo=?, tipo_de_insumo=? where id=?";
                PreparedStatement pstmt = con.getConnection().prepareStatement(sql);
                pstmt.setString(1, nom);
                pstmt.setString(2, unidad);
                pstmt.setDouble(3, cost);
                pstmt.setString(4, tipoInsumo);
                pstmt.setInt(5,id);
                int filasAfectadas = pstmt.executeUpdate();
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null,"Insumo actualizador exitosamente","EXITO",JOptionPane.INFORMATION_MESSAGE);} 
                else {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el insumo.");}
                pstmt.close();
                jTextField1.setText("");jTextField2.setText("");updateTablaProducto(tabPro);
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");}
        }
        else{
            JOptionPane.showMessageDialog(null, "Porfavor, selecciona un producto de la tabla.");}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProMouseClicked
        // TODO add your handling code here:
        int fila2 = tabPro.getSelectedRow();
        if (fila2 >= 0) {
            Object nombreprod = tabPro.getValueAt(fila2, 1);
            Object costoprod = tabPro.getValueAt(fila2,3);
            jTextField1.setText(nombreprod.toString());
            jTextField2.setText(costoprod.toString());
        }
    }//GEN-LAST:event_tabProMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        updateTablaProducto(jTable1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int fila2 = jTable2.getSelectedRow();
        if(fila2 != -1){
            String nombre = (jTable2.getValueAt(fila2,1)).toString();
            int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar "+nombre+"?", "¡ALERTA!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(resp==JOptionPane.YES_OPTION){
                Object id_r = jTable2.getValueAt(fila2,0);
                try {
                    String id = id_r.toString();
                    con = new Conexion();
                    String sql = "delete from producto where id=?";
                    PreparedStatement pstmt = con.getConnection().prepareStatement(sql);
                    pstmt.setString(1, id);
                    int filasAfectadas = pstmt.executeUpdate();
                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(null,"Insumo eliminado exitosamente","EXITO",JOptionPane.INFORMATION_MESSAGE);} 
                    else {
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar el insumo.");}
                    pstmt.close();
                } 
                catch(MySQLIntegrityConstraintViolationException n){
                    JOptionPane.showMessageDialog(null, "Imposible eliminar, el insumo está implementado en una receta o en el inventario.");
                }
                catch (SQLException ex) {
                    //ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
                }
                updateTablaProducto(jTable2);
            }
            else if ( resp == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "El insumo "+ nombre+ " no fue eliminado");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Por favor, selecciona un producto","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        updateTablaProducto(jTable2);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        // TODO add your handling code here:
        int limit = 50; // Limitar a 50 caracteres
        char character = evt.getKeyChar();
        if (!(Character.isLetter(character) || character == ' '))  {
            evt.consume(); // Evita que se introduzcan caracteres diferentes a letras
        }
        if (nombre.getText().length() >= limit) {
            evt.consume(); // Evita que se introduzcan más caracteres
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void CostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CostoKeyTyped
        // TODO add your handling code here:
        int limit = 5; // Limitar a 5 caracteres
        char character = evt.getKeyChar();
        if (!Character.isDigit(character) && character != '.' && character != evt.VK_BACK_SPACE) {
            evt.consume(); // Evita que se introduzcan caracteres diferentes a numeros
        }
        if (Costo.getText().length() >= limit) {
            evt.consume(); // Evita que se introduzcan más caracteres
        }
    }//GEN-LAST:event_CostoKeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        int limit = 50; // Limitar a 50 caracteres
        char character = evt.getKeyChar();
        if (!(Character.isLetter(character) || character == ' '))  {
            evt.consume(); // Evita que se introduzcan caracteres diferentes a letras
        }
        if (jTextField1.getText().length() >= limit) {
            evt.consume(); // Evita que se introduzcan más caracteres
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        int limit = 5; // Limitar a 5 caracteres
        char character = evt.getKeyChar();
        if (!Character.isDigit(character) && character != '.' && character != evt.VK_BACK_SPACE) {
            evt.consume(); // Evita que se introduzcan caracteres diferentes a numeros
        }
        if (jTextField2.getText().length() >= limit) {
            evt.consume(); // Evita que se introduzcan más caracteres
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    /**
     * @param args the command line arguments
     */
    Object[][] dtPro;
    
    private void updateTablaProducto(JTable tabla){             
        String[] columNames = {"id", "nombre", "unidad","costo","tipo","fecha"};  
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
                " id, nombre, unidad_de_medida, costo, tipo_de_insumo, fecha_de_registro" +
                " FROM producto" +
                " ORDER BY id");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while(res.next()){
                String idreceta = res.getString("id");
                String nombreceta = res.getString("nombre");
                String porcioness = res.getString("unidad_de_medida");
                String costo = res.getString("costo");
                String tipo = res.getString("tipo_de_insumo");
                String fecha = res.getString("fecha_de_registro");
                data[i][0] = idreceta;            
                data[i][1] = nombreceta;
                data[i][2] = porcioness;
                data[i][3] = costo;
                data[i][4] = tipo;
                data[i][5] = fecha;
                i++;
            }
            res.close();
        }catch(SQLException e){
         System.out.println(e);
        }
        return data;
    }
    
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
            java.util.logging.Logger.getLogger(Insumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insumos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
           // public void run() {
              //  new Insumos(no).setVisible(true);
            //}
        //});
    }

    private Conexion con;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Costo;
    private javax.swing.JComboBox<String> TipoInsumo;
    private javax.swing.JComboBox<String> Unidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tabPro;
    // End of variables declaration//GEN-END:variables
}