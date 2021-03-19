/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.controlador;

import co.edu.unicundi.areavolumenfigurasg.vista.VistaUsuario;

/**
 * Esta clase se encarga de ejecutar el programa.
 * @author César Téllez
 * @author Diego Cobos
 * @since 1.0
 * @version 1.2.15
 * 
 */
public class Principal {
    
    /**
    * Este método se encarga de iniciar la ejecución del programar
    * @param args[] es un arreglo con los parámetros que el reciba por consola
    */
    public static void main(String[] args) {
        VistaUsuario vista = new VistaUsuario();
        vista.mostrarMenu();
    }
    
}
