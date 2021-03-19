/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class Circulo extends FiguraGeometrica{

    double radio;
    
 
    public Circulo() {
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    
    }
    
    
}
