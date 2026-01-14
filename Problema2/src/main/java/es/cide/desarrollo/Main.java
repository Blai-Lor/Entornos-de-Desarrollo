package es.cide.desarrollo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los numeros para multiplicar:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int resultado=0;
        int bucle=0;
        
        while (y>0) {
            resultado=resultado+x;
            y=y-1;
        } 
        System.out.println("El resultado de la multiplicacion es: "+resultado);

    }
}