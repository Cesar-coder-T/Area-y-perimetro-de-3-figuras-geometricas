/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

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
     * Almacena la la diagonal del rectángulo.
     */
    private double diagonal;

    /**
     * Constructor generico de la clase.
     */
    public Rectangulo() {
    }
    
    /**
     * Constructor (Sobrecarga).
     * @param base
     * @param altura 
     * @param TipoDeFigura
     */
    public Rectangulo(double base, double altura, String TipoDeFigura) {
        this.base = base;
        this.altura = altura;
        super.setTipoDeFigura(TipoDeFigura);
    }
    
    /**
     * Método encargado de calcular el área del rectángulo.
     * @return el área
     */
    @Override
    public double calcularArea() {
        super.setArea(base*altura);
        return super.getArea();
    }

    /**
     * Método encargado de calcular el perímetro del rectángulo.
     * @return el perímetro
     */
    @Override
    public double calcularPerimetro() {
        super.setPerimetro(2*(base+altura));
        return super.getPerimetro();
    }
    
    /**
     * Metodo encatgado de calcular la diagonal del rectangulo      
     * @return la diagonal 
     */
    public double CalcularDiagonal(){
        this.setDiagonal(Math.sqrt(Math.pow(altura, 2)+Math.pow(base, 2)));
        return this.getDiagonal();
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
