package ejerciciojava01;

import java.util.Scanner;

/**
 *
 * @author ivani
 */
public class Ejerciciojava01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada= new Scanner (System.in);
        float[] numeros = new float[4];
        System.out.println("Guaradaremos los valores introducidos");
        
        for(int i=0;i<4;i++){
        System.out.println((i+1)+". Digite los numeros");
        numeros[i] = entrada.nextFloat();
        }
        
        System.out.println("\nLos numeros en orden de entrada son:");
        for (float i:numeros){
            System.out.println(i);
        }
    }
    
}




package ejerciciojava02;

import java.util.Scanner;

/**
 *
 * @author ivani
 */
public class Ejerciciojava02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char[] caracteres= new char[6];
        Scanner entrada= new Scanner(System.in);
        for (int i=0;i<caracteres.length;i++){
            System.out.println("Ingrese los caracteres deseados");
            caracteres[i]= entrada.next().charAt(0);
        }
        System.out.println("Los caracteres en orden inverso son:");
        
        int i=5;
        while(i>=0)
        {
            System.out.println(caracteres[i]+",\n");
            i--;
        }
    }
    
}
