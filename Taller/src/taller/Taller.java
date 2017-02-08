/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author Estudiante
 */
public class Taller {
    
    static double Punto1(double a, double b){
        double x= a*1000*b;
        double r= x/(2*3.14);
        return (r*r)*3.14; 
    }
    
    public static void main(String[] args) {
        
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        double a= teclado.nextDouble();
        double b= teclado.nextDouble();
        double c= Punto1(a,b);
        
        System.out.println("Ejercicio 1");
        System.out.println("Ingresa los valores");
        System.out.println(" ");
        System.out.println(c);
        
    }
    
}
