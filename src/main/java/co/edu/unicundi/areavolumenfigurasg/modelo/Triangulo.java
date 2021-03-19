/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

/**
 * Esta clase contiene los cálculos (área y perímetro) correspondientes al triángulo.
 * @author César Téllez
 * @author Diego Cobos
 * @since 1.0
 * @version 1.2.15
 * 
 */
public class Triangulo extends FiguraGeometrica{
    
    /**
     * Almacena el valor del lado a (Triángulo).
     */
    private double ladoA;
    
    /**
     * Almacena el valor del lado b (Triángulo).
     */
    private double ladoB;
    
    /**
     * Almacena el valor del lado c (Triángulo).
     */
    private double ladoC;
    
    /**
     * Almacena el valor de la altura (Triángulo).
     */
    private double altura;

    /**
     * Constructor genérico de la clase.
     */
    public Triangulo() {
        
    }
    
    /**
     * Constructor (Sobrecarga).
     * @param ladoA
     * @param ladoB
     * @param ladoC
     * @param altura 
     */
    public Triangulo(double ladoA, double ladoB, double ladoC, double altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.altura = altura;
    }
    
    /**
     * Método encargado de calcular el área del triángulo.
     * @return el área
     */
    @Override
    public double calcularArea() {
        
        super.setArea((ladoB*altura)/2);
        return super.getArea();
    }

    /**
     * Método encargado de calcular el perímetro del triángulo.
     * @return el perímetro
     */
    @Override
    public double calcularPerimetro() {
        super.setPerimetro(ladoA+ladoB+ladoC);
        return super.getPerimetro();
    }

    /**
     * Método get del atributo ladoA.
     * @return the ladoA
     */
    public double getLadoA() {
        return ladoA;
    }

    /**
     * Método set del atributo ladoA.
     * @param ladoA the ladoA to set
     */
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * Método get del atributo ladoB.
     * @return the ladoB
     */
    public double getLadoB() {
        return ladoB;
    }

    /**
     * Método set del atributo ladoB.
     * @param ladoB the ladoB to set
     */
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    /**
     * Método get del atributo ladoC.
     * @return the ladoC
     */
    public double getLadoC() {
        return ladoC;
    }

    /**
     * Método set del atributo ladoC.
     * @param ladoC the ladoC to set
     */
    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    /**
     * Método get del atributo altura.
     * @return the altura
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
    
    
    
}
