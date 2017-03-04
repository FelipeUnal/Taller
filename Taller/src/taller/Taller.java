
package taller;

import static java.lang.Math.floor;


public class Taller {

    private static int[] a;
    
    static double Punto1(double a, double b){
        double x = (a/0.001)*b; //Circunferencia, unidades en metros
        double r = ((x/2)/3.141592)/1000;//Radio, Conversion a Km
        return ((r*r)*3.141592); 
    }
    
    /*static void Punto2(int i,int j, int z, int k){
        int[] n = new int[z];
        String[] s = 
        for(i = 0; z<i; i++){
            n[i] = ;
        } 
    }*/
    
    static int Punto3(int a, int b, int c){
        int d[]; 
        d = new int[3];
        if(((a>b)&&(a>c))||((a==b)&&(a>c))||((a>b)&&(a==c))||((a==b)&&(a==c))){
            d[0] = a;
        }else if(((b>a)&&(b>c))||((b>a)&&(b==c))){
            d[0] = b;
        }else if((c>a)&&(c>b)){
            d[0] = c;
        } 
        if(((a<b)&&(a>c))||((a<c)&&(a>b))||((a==b)&&(a<c))||((a<b)&&(a==c))){
            d[1] = a;
        }else if(((b==a)&&(b==c))||((b==a)&&(b>c))||((b>a)&&(b<c))||((b<a)&&(b>c))||((b<a)&&(b==c))){
            d[1] = b;
        }else if(((c==a)&&(c>b))||((c>a)&(c==b))||((c>a)&&(c<b))||((c<a)&&(c>b))){
            d[1] = c;
        } 
        if((a<b)&&(a<c)){
            d[2] = a;
        }else if(((b<a)&&(b<c))||((b==a)&(b<c))){
            d[2] = b;
        }else if(((c==a)&&(c==b))||((c<a)&&(c<b))||((c<a)&&(c==b))||((c==a)&&(c<b))){
            d[2] = c;
        }
        System.out.println("El orden es: ");
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(" ");
        System.out.print("El mayor nuemro es: ");
        return d[0];
    }
    
    static int Ejercicio2_A(int n){
        for(int i = 0; i<=n; i++){
            int b = i*n;
            System.out.println(n+" x "+i+" = "+b);
        }
        return n;
    }
    
    static int Ejercicio2_B(int n){
        int ei = 0;
        int inter = (4*n)-3;
        for(int i = 1; i<=(n*2); i++){
        //Debe escribirse la condicion en la que se cumpla, y no cuando termine.
            for(int j = 1; j<=ei; j++){
                System.out.print(" ");
            }    
            if(i>n){System.out.print("*");}
            else{System.out.print(" ");}
            for(int j = 1; j<=inter; j++){
                System.out.print(" ");
            }    
            if(i<=(n*2)-1){
                System.out.println("*");
            }
            i++;
            ei++;
            inter = inter - 2;            
        } 
        return n;
    }
    
    static int Ejercicio2_C(){
        int nD = 0;
        int n = 0;
        for(int i = 1; i<=100;i++){
            int ConD = 0;
            for(int j = 1; j<=i; j++){
                if(i%j == 0){ConD++;}
            }
            if(ConD>=nD){
                nD = ConD;
                n = i;
            }
        }
        System.out.println("El numero "+n+" tiene "+nD+" divisores.");
        return n;
    }
    
    static int Ejercicio2_D(int Tamaño){
        int i;
        int k;  
        int t;
        int[] b = new int[Tamaño];
        for(i = 0; i<4; i++){
            b[i] = i+1;
            System.out.println(b[i]);
        }
        
        for(i = 0; i<Tamaño; i++){
            k = (int) floor((Math.random()*Tamaño)+1);
            t = b[i];
            b[i] = b[k];
            b[k] = t;
        }
        return 0;
        
    }
        
    public static void main(String[] args) {
        
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Ejercicio 1");
        System.out.println("Ingresa el ancho y el largo de la piel:");
        double a1 = teclado.nextDouble();
        double b1 = teclado.nextDouble();
        double c1 = Punto1(a1,b1);
        System.out.print("El area del Circulo es de ");
        System.out.print(Math.floor(c1));
        System.out.println(" Kilometros Cuadrados");
        
        System.out.println(" ");
        System.out.println("Ejercicio 2 ");
        System.out.println("Cuantos histogramas quieres hacer :");
       /*int a = teclado.nextInt();
        
        int ac = Punto2();
      */
            
        System.out.println("Ejercicio 3 ");
        System.out.println("Ingresa 3 numeros: ");
        int i = teclado.nextInt();
        int j = teclado.nextInt();
        int k = teclado.nextInt();
        System.out.println(" ");
        int l = Punto3(i,j,k);
        System.out.println(" ");
        System.out.println(l);
        
        System.out.println(" ");
        System.out.println("Punto 2-A");
        System.out.println("Escribe un numero");
        int na1;
        na1 = teclado.nextInt();
        System.out.println(Ejercicio2_A(na1));
        System.out.println("Imprime las tablas de multiplicardel numero escogido,");
        System.out.println("hasta llegar a su cuadrado.");
        
        System.out.println(" ");
        int nb2;
        System.out.println("Punto 2-B");
        System.out.println("Escribe un numero");
        nb2 = teclado.nextInt();
        System.out.println(Ejercicio2_B(nb2));
        System.out.println("Imprime asteriscos en diagonal.");
        System.out.println("La primera diagonal contiene la mitad de la segunda diagonal."); 
        System.out.println("La segunda diagonal contiene los asteriscos del numero marcado.");
        
        System.out.println(" ");
        System.out.println("Punto 2-C");
        int nbf = teclado.nextInt();
        System.out.println(Ejercicio2_C());
        System.out.println("Es una funcion que indica la cantidad de divisores que tiene el numero 96.");
        
        System.out.println();
        System.out.println("Punto 2-D"); 
        int nd2;
        System.out.println("Escribe un numero");
        nd2 = teclado.nextInt();
        System.out.println(Ejercicio2_D(nd2));
        System.out.println("Es una funcion que indica la cantidad de divisores que tiene el numero 96.");

    }
}
