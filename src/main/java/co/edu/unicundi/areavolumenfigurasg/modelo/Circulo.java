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
public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        super.setArea(Math.PI*Math.pow(getRadio(), 2));
        return super.getArea();
    }

    @Override
    public double calcularPerimetro() {
        super.setPerimetro(2*Math.PI*getRadio());
        return super.getPerimetro();
    
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
}
