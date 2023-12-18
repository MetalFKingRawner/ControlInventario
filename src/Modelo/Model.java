/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Rawne
 */

import Controlador.Controller;
import controlmestizaje.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model {
    private Conexion con;
    private Controller controlador;
        
    public void setControlador(Controller controlador){
        this.controlador = controlador;
    } 

    public void ingresar(String nombre, String contrasena) {
        try {
            con = new Conexion();
            String sql = "select * from usuarios where nombre=? and contrasenia=?";
            PreparedStatement pstmt = con.getConnection().prepareStatement(sql);
            pstmt.setString(1, nombre);
            pstmt.setString(2, contrasena);
            ResultSet resultSet = pstmt.executeQuery();
            //int filasAfectadas = pstmt.executeQuery();
            if (resultSet.next()) {
                controlador.enviarRespuesta();
                controlador.abrirInterfaz(nombre);
            } 
            else {
                controlador.error(1);}
            pstmt.close();
        } catch (SQLException ex) {
            controlador.error(2);
        }
    }
    
    
}
