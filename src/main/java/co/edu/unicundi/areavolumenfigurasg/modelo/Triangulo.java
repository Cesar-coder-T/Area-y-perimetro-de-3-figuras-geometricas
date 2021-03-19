/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

/**
 *
 * @author cesar
 */
public class Triangulo extends FiguraGeometrica{
    
    double base;
    double haltura;
    double ladoA;
    double ladoB;
    double ladoC;

    public Triangulo(double base, double haltura, double ladoA, double ladoB, double ladoC) {
        
        this.base = base;
        this.haltura = haltura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    @Override
    public double calcularArea() {
        return (base*haltura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return ladoA+ladoB+ladoC;
    }
    
}
