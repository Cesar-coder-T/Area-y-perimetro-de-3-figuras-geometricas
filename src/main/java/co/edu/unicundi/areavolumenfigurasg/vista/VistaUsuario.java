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
 *
 * @author cesar
 */
public class VistaUsuario implements IMenu{
    
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
                    System.out.println("Circulo");
                    Circulo circulo = new Circulo(8);
                    imprimir(circulo.calcularArea(),circulo.calcularPerimetro());
                    break;
                case 2:
                    System.out.println("Cuadrado");
                    Cuadrado cuadrado = new Cuadrado(5);
                    imprimir(cuadrado.calcularArea(),cuadrado.calcularPerimetro());
                    break;
                case 3:
                    System.out.println("Rectángulo");
                    Rectangulo rectangulo = new Rectangulo(2, 5);
                    imprimir(rectangulo.calcularArea(),rectangulo.calcularPerimetro());
                    break;
                case 4:
                    System.out.println("Triángulo");
                    Triangulo triangulo = new Triangulo(1,2,3,4,5);
                    imprimir(triangulo.calcularArea(),triangulo.calcularPerimetro());
                    break;
            }
            System.out.println("¿Desea escoger otra figura? (1.Si/2.No)");
            opcionDo = console.nextByte();
        }while(opcionDo==1);
    }

    @Override
    public void imprimir(double area, double perimetro) {
        System.out.println("Área: "+area+"\nPerímetro: "+perimetro);
    }

}
