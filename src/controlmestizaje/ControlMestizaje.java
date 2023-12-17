/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlmestizaje;

import Controlador.Controller;
import Modelo.Model;
import Vista.login;

/**
 *
 * @author Rawne
 */
public class ControlMestizaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controller controlador = new Controller();
        login vistalogin = new login();
        Model modelo = new Model();
        
        controlador.setLogin(vistalogin);
        controlador.setModelo(modelo);
        modelo.setControlador(controlador);
        vistalogin.setControlador(controlador);
        
        vistalogin.setVisible(true);
        
    }
    
}
