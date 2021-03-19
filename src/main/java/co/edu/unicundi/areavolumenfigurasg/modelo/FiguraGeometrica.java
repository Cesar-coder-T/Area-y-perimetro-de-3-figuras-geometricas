/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

/**
 *
 * @author cesar
 */
public abstract class FiguraGeometrica{
    
    private double area;
    private double perimetro;
    
    public FiguraGeometrica() {
        
    }

    public FiguraGeometrica(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * @return the perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
}
