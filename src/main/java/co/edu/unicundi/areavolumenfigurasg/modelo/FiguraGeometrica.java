/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

/**
 * Esta clase se encarga de heredar su comportamiento a las 
 * demás clases (Circulo, cuadrado, rectángulo y triángulo).
 * @author César Téllez
 * @author Diego Cobos
 * @since 1.0
 * @version 1.3.15
 * 
 */
public abstract class FiguraGeometrica {
    /**
     * Almacena el valor del area correspondiente a la figura geométrica.
     */
    private double area;
    
    /**
     * Almacena el valor del perímetro correspondiente a la figura geométrica.
     */
    private double perimetro;
    
    /**
     * Almacena el tipo de la figura
     */
    private String tipoDeFigura;
    
    /**
     * Constructor genérico de la clase.
     */
    public FiguraGeometrica() {
        
    }

    /**
     * Contructor que recibe parámetros de la clase padre (Sobrecarga).
     * @param area
     * @param perimetro 
     * @param tipoDeFigura
     */
    public FiguraGeometrica(double area, double perimetro, String tipoDeFigura) {
        this.area = area;
        this.perimetro = perimetro;
        this.tipoDeFigura = tipoDeFigura;
    }
    
    /**
     * Método abstracto previsto para calcular el área en cada figura.
     * @return 
     */
    public abstract String calcularArea();
    /**
     * Método abstracto previsto para calcular el perímetro en cada figura.
     * @return 
     */
    public abstract String calcularPerimetro();
    
    
    /**
     * Método get del atributo area.
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * Método set del atributo area.
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Método get del atributo perimetro.
     * @return the perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * Método set del atributo perimetro.
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    /**
     * Método get del atributo tipoDeFigura
     * @return the tipoDeFigura
     */
    public String getTipoDeFigura() {
        return tipoDeFigura;
    }

    /**
     * Método set del atributo tipoDeFigura
     * @param tipoDeFigura the tipoDeFigura to set
     */
    public void setTipoDeFigura(String tipoDeFigura) {
        this.tipoDeFigura = tipoDeFigura;
    }
}
