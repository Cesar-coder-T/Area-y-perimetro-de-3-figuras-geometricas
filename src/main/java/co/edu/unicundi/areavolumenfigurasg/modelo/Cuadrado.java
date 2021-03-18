/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

import java.util.Scanner;

/**
 *
 * @author Diego Cobos
 */
public class Cuadrado extends FiguraGeometrica{

    
    double lados;
    
    Scanner consola = new Scanner(System.in);
    public Cuadrado() {
    }
    
    public void Datos(){
        
        System.out.println("Ingrese un lado del cuadrado en centimetros:");
        lados = consola.nextDouble();
    }
    
    public void areaCuadrado(){
        super.area=Math.pow(this.lados, 2);
        System.out.println("Area del caudadrado es: " + super.area + " cm");
    }
    
    public void perimetroCadrado(){
        super.perimetro=4*lados;
        System.err.println("Perimetro del cuadrado es: "+ super.perimetro + " cm");
    }
}
