/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

import java.util.Scanner;

/**
 *
 * @author Diego Cobos
 */
public class Cuadrado extends FiguraGeometrica{

    
    double ladosCuadrado;
    
    public Cuadrado() {
    }
  
    @Override
    public double calcularArea() {
        return Math.pow(ladosCuadrado, 2);
    }

    @Override
    public double calcularPerimetro() {
         return 4*ladosCuadrado;
    }
}
