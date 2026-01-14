package es.cide.desarrollo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean encontrado = false;
        int elemento;
        elemento=sc.nextInt();

        while (!encontrado && elemento != 0) { 
            if (elemento % 2 ==0) {
                encontrado=true;
                elemento=sc.nextInt();
            } 
            if (encontrado) {
                System.out.println("SI");
            } else { System.out.println("NO");
            }
        }
        sc.close();
    }
}