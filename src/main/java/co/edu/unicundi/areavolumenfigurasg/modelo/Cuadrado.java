/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

import java.text.DecimalFormat;

/**
 * Esta clase contiene los cálculos (área y perímetro) correspondientes al cuadrado.
 * @author César Téllez
 * @author Diego Cobos
 * @since 1.0
 * @version 1.3.9
 * 
 */
public class Cuadrado extends FiguraGeometrica{

    /**
     * Almacena el valor de uno de los lados del cuadrado.
     */
    private double valorLado;
    
    /**
     * Almacena el valor de la diagonal del cuadrado.
     */
    private double diagonal;
    
    DecimalFormat decimal = new DecimalFormat(".##");

    /**
     * Constructor genérico de la clase.
     */
    public Cuadrado() {
    }
    
    /**
     * Constructor (Sobrecarga).
     * @param valorLado 
     *  @param TipoDeFigura
     */
    public Cuadrado(String TipoDeFigura, double valorLado) {
        super.setTipoDeFigura(TipoDeFigura);
        this.valorLado = valorLado;
    }
    
    /**
     * Método encargado de calcular la diagonal del cuadrado
     * @return la diagonal
     */
    public String calcularDiagonal(){
        this.diagonal = this.valorLado* Math.sqrt(2);
        if(this.diagonal % 2 == 0){
            int numCast;
            numCast = (int)this.diagonal;
            return ""+numCast;
        }else{
            return decimal.format(this.diagonal);
        }
    }

    /**
     * Método encargado de calcular el área del cuadrado.
     * @return el área
     */
    @Override
    public String calcularArea(){
        super.setArea(Math.pow(this.valorLado, 2));
        if(super.getArea() % 2 == 0){
            int numCast;
            numCast = (int)super.getArea();
            return ""+numCast;
        }else{
            return decimal.format(super.getArea());
        }
    }

    /**
     * Método encargado de calcular el perímetro del cuadrado.
     * @return el perímetro
     */
    @Override
    public String calcularPerimetro() {
        super.setPerimetro(4*this.valorLado);
        if(super.getPerimetro() % 2 == 0){
            int numCast;
            numCast = (int)super.getPerimetro();
            return ""+numCast;
        }else{
            return decimal.format(super.getPerimetro());
        }
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

    /**
     * Método get del atributo diagonal.
     * @return the diagonal
     */
    public double getDiagonal() {
        return diagonal;
    }

    /**
     * Método set del atributo diagonal.
     * @param diagonal the diagonal to set
     */
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    
}
