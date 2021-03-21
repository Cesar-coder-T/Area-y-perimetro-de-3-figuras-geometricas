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
    public Circulo(double radio, String tipoDeFigura) {
        this.radio = radio;
        super.setTipoDeFigura(tipoDeFigura);
    }
    
    /**
     *  Método encargado de calcular el diámetro del circulo. 
     * @return el diametro
     */
    public double calcularDiametro(){
        this.diametro = Math.round(2*this.radio);
        return this.diametro;
    }
    
    /**
     * Método encargado de calcular el área del círculo.
     * @return el área
     */
    @Override
    public double calcularArea() {
        setArea(Math.round(Math.PI*Math.pow(radio, 2)));
        return getArea();
    }

    /**
     * Método encargado de calcular el perímetro del círculo.
     * @return el perímetro
     */
    @Override
    public double calcularPerimetro() {
        super.setPerimetro(Math.round(2*Math.PI*radio));
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
