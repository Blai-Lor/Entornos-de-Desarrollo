package es.cide.desarrollo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i=0;
        int x=0;
        int y=0;
        System.out.println("Introduce lo que quieras");
        boolean encontrado = false;
        while (!encontrado && sc.hasNextLine()) { 
            String entrada = sc.nextLine(); //lee una linea
            for (i = 0; i < entrada.length(); i++) {
                char mov = entrada.charAt(i);
                
                if (mov=='.'){
                    System.out.println("("+x+","+y+")");
                    encontrado=true;
                }
                if (mov == 'n'){
                    y--;
                } else if (mov == 's'){
                    y++;
                } else if (mov == 'e'){
                    x++;
                } else if (mov == 'w'){
                    x--;
                }
            }
        }
        sc.close();
    }
}