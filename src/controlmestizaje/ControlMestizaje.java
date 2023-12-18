/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlmestizaje;

import Controlador.Controller;
import Controlador.Controller_interfaz;
import Modelo.Model;
import Vista.login;
import Vista.Interfaz;

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
        //Controller_interfaz contrainterfaz = new Controller_interfaz();
        //Interfaz interfaz = new Interfaz();
        
        controlador.setLogin(vistalogin);
        controlador.setModelo(modelo);
        modelo.setControlador(controlador);
        vistalogin.setControlador(controlador);
        
        
        //contrainterfaz.setInterfaz(interfaz);
        //interfaz.setControlador(contrainterfaz);
        
        
        vistalogin.setVisible(true);
    }
    
}
