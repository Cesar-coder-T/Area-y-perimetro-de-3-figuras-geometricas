/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

/**
 * Esta clase contiene los cálculos (área y perímetro) correspondientes al cuadrado.
 * @author César Téllez
 * @author Diego Cobos
 * @since 1.0
 * @version 1.2.15
 * 
 */
public class Cuadrado extends FiguraGeometrica{

    /**
     * Almacena el valor de uno de los lados del cuadrado.
     */
    private double valorLado;

    /**
     * Constructor generico de la clase.
     */
    public Cuadrado() {
        
    }
    
    /**
     * Constructor (Sobrecarga).
     * @param valorLado 
     */
    public Cuadrado(double valorLado) {
        this.valorLado = valorLado;
    }

    /**
     * Método encargado de calcular el área del cuadrado.
     * @return el área
     */
    @Override
    public double calcularArea(){
        super.setArea(Math.pow(valorLado, 2));
        return super.getArea();
    }

    /**
     * Método encargado de calcular el perímetro del cuadrado.
     * @return el perímetro
     */
    @Override
    public double calcularPerimetro() {
        super.setPerimetro(4*valorLado);
        return super.getPerimetro();
    }

    /**
     * Método get del atributo valorLado.
     * @return the valorLado
     */
    public double getValorLado() {
        return valorLado;
    }

    /**
     * Método set del atributo valorLado.
     * @param valorLado the valorLado to set
     */
    public void setValorLado(double valorLado) {
        this.valorLado = valorLado;
    }
}
