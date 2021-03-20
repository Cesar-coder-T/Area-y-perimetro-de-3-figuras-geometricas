/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.vista;

import co.edu.unicundi.areavolumenfigurasg.modelo.Circulo;
import co.edu.unicundi.areavolumenfigurasg.modelo.Cuadrado;
import co.edu.unicundi.areavolumenfigurasg.modelo.IMenu;
import co.edu.unicundi.areavolumenfigurasg.modelo.Rectangulo;
import co.edu.unicundi.areavolumenfigurasg.modelo.Triangulo;
import java.util.Scanner;

/**
 * Esta clase se encarga de interactuar con el usuario.
 * @author César Téllez
 * @author Diego Cobos
 * @since 1.0
 * @version 1.2.15
 * 
 */
public class VistaUsuario implements IMenu{
    
    /**
     * Método que muestra el menú de opciones al usuario.
     */
    public void mostrarMenu(){
        Scanner console = new Scanner(System.in);
        byte opcionDo;
        byte opcionSwitch;
        System.out.println("¡¡¡Bienvenido!!!\nEn este programa se podrá calcular el area y perímetro de las cuatro figuras geométricas principales\n(Circulo, cuadrado, rectángulo y triángulo).");
        do{
            System.out.println("\nElija la figura:\n1.Circulo\n2.Cuadrado\n3.Rectángulo\n4.Triángulo");
            opcionSwitch = console.nextByte();
            switch(opcionSwitch){
                case 1:
                    System.out.println("Circulo\nDigite el radio:");
                    Circulo circulo = new Circulo(console.nextDouble());
                    imprimir(circulo.calcularArea(),circulo.calcularPerimetro());
                    break;
                case 2:
                    System.out.println("Cuadrado\nDigite uno de los lados:");
                    Cuadrado cuadrado = new Cuadrado(console.nextDouble());
                    imprimir(cuadrado.calcularArea(),cuadrado.calcularPerimetro());
                    break;
                case 3:
                    System.out.println("Rectángulo\nDigite la base y la altura:");
                    Rectangulo rectangulo = new Rectangulo(console.nextDouble(),console.nextDouble());
                    imprimir(rectangulo.calcularArea(),rectangulo.calcularPerimetro());
                    break;
                case 4:
                    System.out.println("Triángulo\nDigite el lado A, B, C y la altura:");
                    Triangulo triangulo = new Triangulo(console.nextDouble(), console.nextDouble(), console.nextDouble(), console.nextDouble());
                    imprimir(triangulo.calcularArea(),triangulo.calcularPerimetro());
                    break;
            }
            System.out.println("¿Desea escoger otra figura? (1.Si/2.No)");
            opcionDo = console.nextByte();
        }while(opcionDo == 1);
    }

    /**
     * Método implementado de la interface "IMenu" que imprime el área y perímetro.
     * @param area
     * @param perimetro 
     */
    @Override
    public void imprimir(double area, double perimetro) {
        System.out.println("Área: "+area+"\nPerímetro: "+perimetro);
    }
}
