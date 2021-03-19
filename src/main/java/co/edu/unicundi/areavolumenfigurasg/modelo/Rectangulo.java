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
public class Rectangulo extends FiguraGeometrica{

    double base;
    double haltura;

    public Rectangulo(double base, double haltura) {
        this.base = base;
        this.haltura = haltura;
    }
    
    @Override
    public double calcularArea() {
        return base*haltura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(base*haltura);
    }

 
}
