package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int z=0;        

        System.out.println("Introduce una palabra o una frase:");
        while (true) { 
            String texto = sc.nextLine();
        for (int i = 0; i < texto.length(); i++) {
            
            if (texto.charAt(i)=='a'){
                z++;
            }
            if (texto.charAt(i)=='.') {
                break;
            }
        }
        System.out.println("Este texto tiene "+z+" a.");
        z=0;
        }  
    }
}