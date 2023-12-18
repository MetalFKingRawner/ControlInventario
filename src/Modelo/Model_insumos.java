/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Controller_insumos;
import controlmestizaje.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rawne
 */
public class Model_insumos {
    private Controller_insumos insumos;
    private Conexion con;
    
    public void setControlador(Controller_insumos insumos){
        this.insumos = insumos;
    }

    public void insertar(String nombre, String unidad, String costo, String tipoInsumo, String cantidad) {
        if(existe(nombre)){
            insumos.enviarMensaje("El insumo ya existe", "ERROR", 2);
        }
        else{
            double cost = Double.parseDouble(costo);
            try {
                con = new Conexion();
                String sql = "INSERT INTO producto(nombre, unidad_de_medida, costo, tipo_de_insumo, fecha_de_registro, id_usuario) VALUES (?, ?, ?, ?, NOW(),1)";
                PreparedStatement pstmt = con.getConnection().prepareStatement(sql);
                pstmt.setString(1, nombre);
                pstmt.setString(2, unidad);
                pstmt.setDouble(3, cost);
                pstmt.setString(4, tipoInsumo);
                int filasAfectadas = pstmt.executeUpdate();
                if (filasAfectadas > 0) {
                    insumos.enviarMensaje("Insumo agregado exitosamente","Bien hecho", 1);
                    int idinsumo = buscarid(nombre);
                    agregarInventario(idinsumo, unidad, cantidad);
                    //JOptionPane.showMessageDialog(null, "Insumo agregado exitosamente.");
                } 
                else {
                    insumos.enviarMensaje("No se puedo agregar el insumo", "Verificar datos",2);
                    //JOptionPane.showMessageDialog(null, "No se pudo agregar el insumo.");
                }
                pstmt.close();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                insumos.enviarMensaje("Error al concextar a la base de datos", "ERROR", 2);
                 //JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
            }
        }
    }

    private int buscarid(String nombre) {
        int id = 0;
        try {
            con = new Conexion();
            String sql = "select id from producto where nombre = ?";
            PreparedStatement pstmt = con.getConnection().prepareStatement(sql);
            pstmt.setString(1, nombre);
            ResultSet resultSet = pstmt.executeQuery();
            // Verificar si hay resultados
            if (resultSet.next()) {
                // Obtener el valor de la columna 'id_receta'
                id = resultSet.getInt("id");
            }
            pstmt.close();resultSet.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }

    private void agregarInventario(int idinsumo, String unidad, String cantidad) {
        try{
            double cantida = Double.parseDouble(cantidad); 
            String sql = "INSERT INTO inventario(id_producto, unidad_de_medida, cantidad, fecha) VALUES (?, ?, ?, NOW())";
            PreparedStatement pstmt = con.getConnection().prepareStatement(sql);
            pstmt.setInt(1, idinsumo);
            pstmt.setString(2, unidad);
            pstmt.setDouble(3, cantida);
            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
               insumos.enviarMensaje("Agregado a inventario", "EXITO", 1);
                //JOptionPane.showMessageDialog(null, "Inventario actualizado exitosamente.");
            }
            pstmt.close();
        }
        catch (SQLException ex) {
            ex.printStackTrace();}
    }
    
    private boolean existe(String nombre){
        boolean existe = false;
        try{
            con = new Conexion();
            String consulta = "SELECT COUNT(*) FROM producto WHERE LOWER(nombre) = LOWER(?)";
            PreparedStatement pstmt = con.getConnection().prepareStatement(consulta);
            pstmt.setString(1, nombre);
            ResultSet resultSet = pstmt.executeQuery();
            // Verificar si hay resultados
            if (resultSet.next()) {
                int cantidad = resultSet.getInt(1);
                existe = cantidad > 0;
            }
            pstmt.close();resultSet.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return existe;
    }
    
}
