/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

/**
 * Esta clase contiene los cálculos (área y perímetro) correspondientes al círculo.
 * @author César Téllez
 * @author Diego Cobos
 * @since 1.0
 * @version 1.2.15
 * 
 */
public class Circulo extends FiguraGeometrica{

    /**
     * Almacena el radio del circulo.
     */
    private double radio;
    private double diametro;

    /**
     * Constructor genérico de la clase.
     */
    public Circulo() {
        
    }
    
    /**
     * Constructor (Sobrecarga).
     * @param radio 
     * @param TipoDeFigura
     */
    public Circulo(double radio, String TipoDeFigura) {
        this.radio = radio;
        super.setTipoDeFigura(TipoDeFigura);
    }
    
    public double CalcularDiametro(){
        this.diametro=2*this.radio;
        return this.diametro;
    }
    
    /**
     * Método encargado de calcular el área del círculo.
     * @return el área
     */
    @Override
    public double calcularArea() {
        setArea(Math.PI*Math.pow(radio, 2));
        return getArea();
    }

    /**
     * Método encargado de calcular el perímetro del círculo.
     * @return el perímetro
     */
    @Override
    public double calcularPerimetro() {
        super.setPerimetro(2*Math.PI*radio);
        return super.getPerimetro();
    
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
