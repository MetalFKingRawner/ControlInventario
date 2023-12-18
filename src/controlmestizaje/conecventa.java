/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlmestizaje;

/**
 *
 * @author Rawne
 */
import java.sql.*;
public class conecventa {
    Connection con;
    public conecventa(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/puntoventa?characterEncoding=utf8","root","hangar81");
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        return con;
    }
    
    public void closeConnection() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
