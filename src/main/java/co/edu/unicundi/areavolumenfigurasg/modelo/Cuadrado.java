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
     * Almacena el valor de la diagonal del cuadrado.
     */
    private double diagonal;

    /**
     * Constructor generico de la clase.
     */
    public Cuadrado() {
    }
    
    /**
     * Constructor (Sobrecarga).
     * @param valorLado 
     *  @param TipoDeFigura
     */
    public Cuadrado(double valorLado, String TipoDeFigura) {
        this.valorLado = valorLado;
        super.setTipoDeFigura(TipoDeFigura);
    }
    
    /**
     * Metodo encargado de calcular la diagonal del cuadrado
     * @return la diagonal
     */
    public double CalcularDiagonal(){
        this.setDiagonal(this.valorLado* Math.sqrt(2));
        return this.getDiagonal();
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

    /**
     * @return the diagonal
     */
    public double getDiagonal() {
        return diagonal;
    }

    /**
     * @param diagonal the diagonal to set
     */
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    
}
