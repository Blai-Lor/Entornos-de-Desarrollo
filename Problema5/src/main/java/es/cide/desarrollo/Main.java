package es.cide.desarrollo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int n=sc.nextInt();
        int i=0;
        
        int bucle=2;

        while (n>=bucle && i <= 2) { 
            
            if (n%bucle==0) {
            i++;
            } bucle++; 
        }
        if (i==2 || i==1) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
    }
}