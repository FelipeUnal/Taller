
package taller;

public class Taller {
    
    static double Punto1(double a, double b){
        double x = (a/0.001)*b; //Circunferencia, unidades en metros
        double r = ((x/2)/3.141592)/1000;//Radio, Conversion a Km
        return ((r*r)*3.141592); 
    }
    
    static void Punto2_1(int[] v){
        for(int i = 0; i < v.length; i++){
            v[i] = (int)(Math.random() * 15);
        }
    } 
    static void Punto2_2(int[] v){
        int[] rep = new int[v.length];
        for(int i = 0; i < v.length; i++){
            int a = 0;
            for(int j = 0; j < v.length; j++){
                if(v[j] == v[i]){
                    a++;
                }
            }
            if((rep[i] == 0)){
                System.out.print(v[i]+": ");
                for(int k = 0; k < a; k++){
                    System.out.println("*");
                }
                System.out.println();
            }
            for (int j = 0; j < v.length; j++){
                if(v[i]==v[j]){
                    rep[j]++;
                }
            }
        }
    }
    
    
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
    
    public static void main(String[] args) {
        
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Ejercicio 1");
        System.out.println("Ingresa los valores :");
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = Punto1(a,b);
        System.out.print("El area del Circulo es: ");
        System.out.print(Math.floor(c));
        System.out.println("KM");
        
        System.out.println(" ");
        System.out.println("Ejercicio 2 ");
        System.out.print("Ingresa el numero de Historgramas que quieres realizar (Maximo 5):");
        System.out.println("Cantidad de Elementos: ");
        int z = teclado.nextInt();
        int[] v = new int[z];
        Punto2_1(v);
        Punto2_2(v);
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("Ejercicio 3 ");
        System.out.println("Ingresa 3 numeros: ");
        int i = teclado.nextInt();
        int j = teclado.nextInt();
        int k = teclado.nextInt();
        System.out.println(" ");
        int l = Punto3(i,j,k);
        System.out.println(" ");
        System.out.println(l);
        
        

        
        
        
        
    }
    
}
