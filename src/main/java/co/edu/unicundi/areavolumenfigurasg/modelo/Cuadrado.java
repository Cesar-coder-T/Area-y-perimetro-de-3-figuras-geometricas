/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

/**
 *
 * @author Diego Cobos
 */
public class Cuadrado extends FiguraGeometrica{

    private double valorLado;

    public Cuadrado(double valorLado) {
        this.valorLado = valorLado;
    }

    @Override
    public double calcularArea(){
        super.setArea(Math.pow(getValorLado(), 2));
        return super.getArea();
    }

    @Override
    public double calcularPerimetro() {
        super.setPerimetro(4*getValorLado());
        return super.getPerimetro();
    }

    /**
     * @return the valorLado
     */
    public double getValorLado() {
        return valorLado;
    }

    /**
     * @param valorLado the valorLado to set
     */
    public void setValorLado(double valorLado) {
        this.valorLado = valorLado;
    }
    
    
}
