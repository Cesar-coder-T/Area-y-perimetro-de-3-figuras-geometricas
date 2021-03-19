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
public class Triangulo extends FiguraGeometrica{
    
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    @Override
    public double calcularArea() {
        super.setArea((getBase()*getAltura())/2);
        return super.getArea();
    }

    @Override
    public double calcularPerimetro() {
        super.setPerimetro(getLadoA()+getLadoB()+getLadoC());
        return super.getPerimetro();
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the ladoA
     */
    public double getLadoA() {
        return ladoA;
    }

    /**
     * @param ladoA the ladoA to set
     */
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * @return the ladoB
     */
    public double getLadoB() {
        return ladoB;
    }

    /**
     * @param ladoB the ladoB to set
     */
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    /**
     * @return the ladoC
     */
    public double getLadoC() {
        return ladoC;
    }

    /**
     * @param ladoC the ladoC to set
     */
    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    
}
