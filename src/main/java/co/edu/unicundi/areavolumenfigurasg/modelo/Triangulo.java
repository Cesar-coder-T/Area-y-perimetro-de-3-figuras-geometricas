/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

import java.text.DecimalFormat;

/**
 * Esta clase contiene los cálculos (área y perímetro) correspondientes al triángulo.
 * @author César Téllez
 * @author Diego Cobos
 * @since 1.0
 * @version 1.3.9
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
    
    DecimalFormat decimal = new DecimalFormat(".##");

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
     * @param tipoDeFigura 
     */
    public Triangulo(String tipoDeFigura, double ladoA, double ladoB, double ladoC) {
        super.setTipoDeFigura(tipoDeFigura);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    /**
     * Método encargado de calcular el área del triángulo.
     * @return el área
     */
    @Override
    public String calcularArea() {
        super.setArea(this.ladoB*this.altura/2);
        if(super.getArea() % 2 == 0){
            int numCast;
            numCast = (int)super.getArea();
            //return ""+numCast;
            return ""+super.getArea();
        }else{
            //return decimal.format(super.getArea());
            return ""+super.getArea();
        }
    }

    /**
     * Método encargado de calcular el perímetro del triángulo.
     * @return el perímetro
     */
    @Override
    public String calcularPerimetro() {
        super.setPerimetro(this.ladoA+this.ladoB+this.ladoC);
        if(super.getPerimetro() % 2 == 0){
            int numCast;
            numCast = (int)super.getPerimetro();
            return ""+numCast;
        }else{
            return decimal.format(super.getPerimetro());
        }
    }
    
    /**
     * Método encargado de calcular la altura según el tipo de triángulo
     * @return la altura del triángulo
     */
    public String calcularAltura(){
        if (this.ladoA == this.ladoB && this.ladoB == this.ladoC){
            this.altura = (Math.sqrt(3)*this.ladoA)/2;
        }else if (this.ladoA == this.ladoB || this.ladoA == this.ladoC || this.ladoB == this.ladoC ){
                if (this.ladoA == this.ladoB) {
                this.altura = Math.sqrt((Math.pow(this.ladoA, 2)-(Math.pow(this.ladoC, 2)/4)));      
            } else if (this.ladoA == this.ladoC) {
                this.altura = Math.sqrt((Math.pow(this.ladoA, 2)-(Math.pow(this.ladoB, 2)/4)));     
            } else {
                this.altura = Math.sqrt((Math.pow(this.ladoB, 2)-(Math.pow(this.ladoA, 2)/4))); 
            }
        } else {
            this.altura = (this.ladoA*this.ladoB)/this.ladoC;
        }
        
        if(this.altura % 2 == 0){
            int numCast;
            numCast = (int)this.altura;
            return ""+numCast;
        }else{
            return decimal.format(this.altura);
        }
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
