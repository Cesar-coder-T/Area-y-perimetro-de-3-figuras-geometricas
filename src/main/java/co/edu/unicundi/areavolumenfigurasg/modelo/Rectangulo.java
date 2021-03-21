/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

import java.text.DecimalFormat;

/**
 * Esta clase contiene los cálculos (área y perímetro) correspondientes al rectángulo.
 * @author César Téllez
 * @author Diego Cobos
 * @since 1.0
 * @version 1.2.15
 * 
 */
public class Rectangulo extends FiguraGeometrica{

    /**
     * Almacena la base del rectángulo.
     */
    private double base;
    
    /**
     * Almacena la altura del rectángulo.
     */
    private double altura;
    
    /**
     * Almacena la diagonal del rectángulo.
     */
    private double diagonal;
    
    DecimalFormat decimal = new DecimalFormat(".##");

    /**
     * Constructor genérico de la clase.
     */
    public Rectangulo() {
    }
    
    /**
     * Constructor (Sobrecarga).
     * @param base
     * @param altura 
     * @param tipoDeFigura
     */
    public Rectangulo(String tipoDeFigura, double base, double altura) {
        super.setTipoDeFigura(tipoDeFigura);
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * Método encargado de calcular el área del rectángulo.
     * @return el área
     */
    @Override
    public String calcularArea() {
        super.setArea(this.base*this.altura);
        if(super.getArea() % 2 == 0){
            int numCast;
            numCast = (int)super.getArea();
            return ""+numCast;
        }else{
            return decimal.format(super.getArea());
        }
    }

    /**
     * Método encargado de calcular el perímetro del rectángulo.
     * @return el perímetro
     */
    @Override
    public String calcularPerimetro() {
        super.setPerimetro(2*(this.base+this.altura));
        if(super.getPerimetro()% 2 == 0){
            int numCast;
            numCast = (int)super.getPerimetro();
            return ""+numCast;
        }else{
            return decimal.format(super.getPerimetro());
        }
    }
    
    /**
     * Método encargado de calcular la diagonal del rectángulo      
     * @return la diagonal 
     */
    public String calcularDiagonal(){
        this.diagonal = Math.sqrt(Math.pow(this.altura, 2)+Math.pow(this.base, 2));
        if(this.diagonal % 2 == 0){
            int numCast;
            numCast = (int)this.diagonal;
            return ""+numCast;
        }else{
            return decimal.format(this.diagonal);
        }
    }
    /**
     * Método get del atributo base.
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * Método set del atributo base.
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Método get del atributo altura.
     * @return the haltura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Método set del atributo altura.
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
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
