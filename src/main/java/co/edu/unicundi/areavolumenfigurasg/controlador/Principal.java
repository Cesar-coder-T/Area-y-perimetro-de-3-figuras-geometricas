/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.controlador;

import co.edu.unicundi.areavolumenfigurasg.modelo.Circulo;
import co.edu.unicundi.areavolumenfigurasg.modelo.Cuadrado;

/**
 *
 * @author cesar
 */
public class Principal {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.Datos();
        cuadrado1.areaCuadrado();
        cuadrado1.perimetroCadrado();
        Circulo circulo1 = new Circulo();
        circulo1.Dato();
        circulo1.areaCircu();
        circulo1.perimetroCirculo();
                
    }
}
