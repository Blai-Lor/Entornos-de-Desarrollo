package es.cide.desarrollo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 =sc.nextInt();
        int num2;
        boolean insertado = false;
        boolean finalSecuencia = false;

        while (!finalSecuencia && sc.hasNext()) { 
            if(sc.hasNextInt()){
                num2 =sc.nextInt();
                if (!insertado && num2 >= num1) {
                    System.out.print(num1+ " ");
                    insertado = true;
                }
                System.out.print(num2+ " ");
            } else{
                String token = sc.next();
                if (token.equals(".")){
                    if(!insertado){
                        System.out.println(num1);
                        insertado = true;
                    }
                }
                finalSecuencia = true;
            }
        }
        System.out.println();
        sc.close();
    }
}