/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.modelo;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class Circulo extends FiguraGeometrica{

    double raiz;
    
    Scanner consola = new Scanner(System.in);
    public Circulo() {
    }
    
    public void Dato(){
        System.err.println("Ingrese el radio del circulo");
        raiz = consola.nextDouble();
    }
    
    public void areaCircu(){
        area = Math.PI *Math.pow(raiz, 2);
        System.out.println("El area del circulo es: " + area );
    }
    
    public void perimetroCirculo(){
        perimetro = 2*Math.PI*raiz;
        System.out.println("El perimetro del circulo es: " + perimetro);
    } 
}
