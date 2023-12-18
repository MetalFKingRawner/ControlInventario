/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Model_insumos;
import Vista.Insumos;

/**
 *
 * @author Rawne
 */
public class Controller_insumos {
    private Insumos insumos;
    private Model_insumos modelo;
    
    public void setVista(Insumos insumos){
        this.insumos = insumos;
    }
    public void setModelo(Model_insumos modelo){
        this.modelo = modelo;
    }

    public void agregarInsumo(String nombre, String unidad, String costo, String tipoInsumo, String cantidad) {
        if (nombre.isEmpty()|| unidad.isEmpty() || costo.isEmpty() || tipoInsumo.isEmpty() || cantidad.isEmpty()) {
            insumos.mensajeError("Porfavor, completa todos los campos", "Precaución!");
            //JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.");
        }
        else{
            modelo.insertar(nombre, unidad, costo, tipoInsumo, cantidad);
        }
    }

    public void enviarMensaje(String mensaje, String encabezado, int tipo) {
        switch(tipo){
            case 1:
                insumos.mensajeAprobado(mensaje, encabezado);
                break;
            case 2:
                insumos.mensajeError(mensaje, encabezado);
                break;
        }
    }
    
    
}
