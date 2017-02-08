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
        double x = (a/0.001)*b; //Circunferencia, unidades en metros
        double r = ((x/2)/3.141592)/1000;//Radio, Conversion a Km
        return ((r*r)*3.141592); 
    }
    
    static void Punto2(int a){
        int z[];
        z = new int[a];
    } 
    
    public static void main(String[] args) {
        
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Ejercicio 1");
        System.out.println("Ingresa los valores :");
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = Punto1(a,b);
        System.out.print("El area del Circulo es: ");
        System.out.println(Math.floor(c));
        
        System.out.println(" ");
        System.out.println("Ejercicio 2 ");
        System.out.print("Ingresa el numero de Histogramas: ");
        int z = teclado.nextInt();
        System.out.println(z);
        System.out.println(" ");
        
        
        
        
    }
    
}
