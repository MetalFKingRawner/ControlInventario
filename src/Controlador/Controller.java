/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Model;
import Vista.Interfaz;
import Vista.login;

/**
 *
 * @author Rawne
 */
public class Controller {
    
    private login logvista;
    private Model modelo;
    
    public void setLogin(login logvista){
        this.logvista = logvista;
    } 
    public void setModelo(Model modelo){
        this.modelo = modelo;
    }
    
    
    public void ingresarUsuario(String nombre, String contrasena) {
        if(nombre.equalsIgnoreCase("Username") || contrasena.equalsIgnoreCase("Password")){
            //System.out.print("holi");
            logvista.mensajeError("Por favor, completa todos los campos", "Precaución");
        }
        else{
            modelo.ingresar(nombre, contrasena);
        }
    }
    
    public void enviarRespuesta(){
        logvista.mensajeCorrecto("Bienvenido :)", "EXITO");
    }
    
    public void error(int tipo){
        if(tipo==1){
            logvista.mensajeError("Usuario o contraseña erronea.","ERROR");
        }
        else{
            logvista.mensajeError("No se puede acceder a la base de datos","ERROR"); 
        }
    }
    

    public void abrirInterfaz(String nom) {
        Interfaz ins = new Interfaz(nom);
        ins.setVisible(true);
        logvista.dispose();
        
    }
}
