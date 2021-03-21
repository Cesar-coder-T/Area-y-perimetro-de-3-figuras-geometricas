/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

import java.text.DecimalFormat;

/**
 * Esta clase contiene los cálculos (área y perímetro) correspondientes al círculo.
 * @author César Téllez
 * @author Diego Cobos
 * @since 1.0
 * @version 1.3.9
 * 
 */
public class Circulo extends FiguraGeometrica{

    /**
     * Almacena el radio del circulo.
     */
    private double radio;
    
    /**
     * Almacena el diámetro del circulo.
     */
    private double diametro;
    
    DecimalFormat decimal = new DecimalFormat(".##");

    /**
     * Constructor genérico de la clase.
     */
    public Circulo() {
        
    }
    
    /**
     * Constructor (Sobrecarga).
     * @param radio 
     * @param tipoDeFigura
     */
    public Circulo(String tipoDeFigura, double radio) {
        super.setTipoDeFigura(tipoDeFigura);
        this.radio = radio;
    }
    
    /**
     *  Método encargado de calcular el diámetro del circulo. 
     * @return el diametro
     */
    public String calcularDiametro(){
        this.diametro = 2*this.radio;
        if(this.diametro % 2 == 0){
            int numCast;
            numCast = (int)this.diametro;
            return ""+numCast;
        }else{
            return decimal.format(this.diametro);
        }
    }
    
    /**
     * Método encargado de calcular el área del círculo.
     * @return el área
     */
    @Override
    public String calcularArea() {
        super.setArea(Math.PI*Math.pow(this.radio, 2));
        if(super.getArea() % 2 == 0){
            int numCast;
            numCast = (int)super.getArea();
            return ""+numCast;
        }else{
            return decimal.format(super.getArea()); 
        }
    }

    /**
     * Método encargado de calcular el perímetro del círculo.
     * @return el perímetro
     */
    @Override
    public String calcularPerimetro() {
        super.setPerimetro(Math.round(2*Math.PI*this.radio));
        if(super.getPerimetro() % 2 == 0){
            int numCast;
            numCast = (int)super.getPerimetro();
            return ""+numCast;
        }else{
            return decimal.format(super.getPerimetro());
        }
    }
    
    /**
     * Método get del atributo radio.
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Método set del atributo radio.
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    
}
