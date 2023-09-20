/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen1;
     
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Examen1 {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingresa nombre, nombre2, nombre3 de instrumento");
        String nombre = lectura.nextLine();
        String nombre2 = lectura.nextLine();
        String nombre3 = lectura.nextLine();
        
        System.out.println("Ingresa precio de venta de instrumento");
        double precio = lectura.nextDouble();
        
        System.out.println("Ingresa precio de compra de instrumento");
        double compra =lectura.nextDouble();
       
        
           double ganancia = (precio-compra);
            double total = (ganancia/compra)*100;
        
        
        System.out.println("La ganacia es de " + nombre + ganancia);
        
        System.out.println("El total es " + nombre + total);
        
       
        
        
        
        System.out.println("Ingresa precio2 de venta de instrumento");
        double precio2 = lectura.nextDouble();
        
        System.out.println("Ingresa precio de compra2 de instrumento");
        double compra2 =lectura.nextDouble();
       
        
           double ganancia2 = (precio2-compra2);
            double total2 = (ganancia2/compra2)*100;
        
        
        System.out.println("La ganacia2 es de " + nombre2 + ganancia2);
        
        System.out.println("El total2 es " + nombre2 + total2);
        
        
        
       
        
        System.out.println("Ingresa precio3 de venta de instrumento");
        double precio3 = lectura.nextDouble();
        
        System.out.println("Ingresa precio de compra3 de instrumento");
        double compra3 =lectura.nextDouble();
       
        
           double ganancia3 = (precio3-compra3);
            double total3 = (ganancia3/compra3)*100;
        
        
        System.out.println("La ganacia es de " + nombre3 + ganancia3);
        
        System.out.println("El total es " + nombre3 + total3);
      
      
    }
      
    }
    

