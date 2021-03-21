/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.areavolumenfigurasg.vista;

import co.edu.unicundi.areavolumenfigurasg.modelo.Circulo;
import co.edu.unicundi.areavolumenfigurasg.modelo.Cuadrado;
import co.edu.unicundi.areavolumenfigurasg.modelo.FiguraGeometrica;
import co.edu.unicundi.areavolumenfigurasg.modelo.IMenu;
import co.edu.unicundi.areavolumenfigurasg.modelo.Rectangulo;
import co.edu.unicundi.areavolumenfigurasg.modelo.Triangulo;
import java.util.Scanner;

/**
 * Esta clase se encarga de interactuar con el usuario.
 * @author César Téllez
 * @author Diego Cobos
 * @since 1.0
 * @version 1.3.9
 * 
 */
public class VistaUsuario implements IMenu{
    
    /**
     * claase de encargada de giardarlos datos del usuario
     */
    Scanner console = new Scanner(System.in);
    
    /**
     * Vector que se encargado de guardar los objetos
     */
    FiguraGeometrica[] vector ;
    
    /**
     * Método que donde guardamos los objetos en un vector y muestra el menu.
     */
    public void mostrarBienvenida(){
        byte contador = 0;
        byte opcionDo ;
        byte opcionSwitch;
        
        System.out.println("¡¡¡Bienvenido!!!\nEn este programa se podrá calcular el área y perímetro de las cuatro figuras geométricas principales\n(Circulo, cuadrado, rectángulo y triángulo)."
                + "\n\nNota: Recuerde, la unidad de medida que contempla este programa es cm.\n\nIngrese el número de figuras que desea desarrollar: ");
        
        opcionDo = console.nextByte();
        vector = new FiguraGeometrica[opcionDo];
        do{
            System.out.println("\nElija la figura:\n1.Circulo\n2.Cuadrado\n3.Rectángulo\n4.Triángulo");
            opcionSwitch = console.nextByte();
            vector[contador] = mostrarMenu(opcionSwitch);
            contador++;
        }while(opcionDo > contador);
        imprimerVector();
    }
    
    /**
     * Método que crea el objeto y retorna y lo ternorna.
     * @param opcion
     * @return el nombre de la figura geométrica
     */
    public FiguraGeometrica mostrarMenu(byte opcion){
        
        FiguraGeometrica figura = null;
        switch(opcion){
           case 1:
               System.out.println("Circulo\nDigite el radio:");
                figura= new Circulo(console.nextDouble(), "Círculo");
                imprimir(figura.calcularArea(),figura.calcularPerimetro());
                break;
           case 2:
               System.out.println("Cuadrado\nDigite uno de los lados:");
                figura = new Cuadrado(console.nextDouble(), "Cuadrado");
                imprimir(figura.calcularArea(),figura.calcularPerimetro());
                break;
           case 3:
               System.out.println("Rectángulo\nDigite la base y la altura:");
               figura = new Rectangulo(console.nextDouble(),console.nextDouble(), "Rectángulo");
               imprimir(figura.calcularArea(),figura.calcularPerimetro());
               break;
            case 4:
                System.out.println("Triángulo\nDigite el lado A, B y C:");
                figura = new Triangulo(console.nextDouble(), console.nextDouble(), console.nextDouble() , "Triángulo");
                imprimir(figura.calcularArea(),figura.calcularPerimetro());
                break;
        }
        return figura;
    }
    
    /**
     * Método encargado de imprimir el vector con las características de cada clase.
     */
    public void imprimerVector(){
        byte contador = 1;
        for(FiguraGeometrica figura: vector){
            System.out.println("----------------------------------\nFigura "+ contador + ": " + figura.getTipoDeFigura() +"\n\t\tÁrea: " + figura.calcularArea() + " cm^2");
            System.out.println("\t\tPerímetro: " + figura.calcularPerimetro() + " cm");
            if (figura instanceof Cuadrado){
                System.out.println("\t\tDiagonal: "  + ((Cuadrado)figura).calcularDiagonal() + " cm" + "\n----------------------------------");
            }else if (figura instanceof Circulo) {
                System.out.println("\t\tDiámetro: " + ((Circulo)figura).calcularDiametro() + " cm^2" + "\n----------------------------------");
            } else if (figura instanceof Triangulo) {
                System.out.println("\t\tAltura: " + ((Triangulo)figura).calcularAltura() + " cm^2" + "\n----------------------------------");
            } else if (figura instanceof Rectangulo){
                System.out.println("\t\tDiagonal: " + ((Rectangulo)figura).calcularDiagonal() + " cm" + "\n----------------------------------");
            }
            contador++;
        }
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
