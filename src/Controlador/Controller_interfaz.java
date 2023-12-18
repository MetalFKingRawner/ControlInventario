/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Model_insumos;
import Vista.Insumos;
import Vista.Interfaz;
import Vista.Inventario;
import Vista.Recetas;

/**
 *
 * @author Rawne
 */
public class Controller_interfaz {
    private Interfaz interfaz;
    
    public void setInterfaz(Interfaz interfaz){
        this.interfaz = interfaz;
    } 
    
    public void abrirInsumos(String nombre){
        Controller_insumos controlador = new Controller_insumos();
        Model_insumos modelo = new Model_insumos();
        Insumos ins = new Insumos(nombre);
        controlador.setVista(ins);
        controlador.setModelo(modelo);
        ins.setControlador(controlador);
        modelo.setControlador(controlador);
        ins.setVisible(true);
    }

    public void abrirRecetas(String nombre) {
        Recetas rec = new Recetas(nombre);
        rec.setVisible(true);
    }

    public void abrirInventario() {
        Inventario inv = new Inventario();
        inv.setVisible(true);
    }
}
