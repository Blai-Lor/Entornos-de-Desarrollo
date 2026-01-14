package es.cide.desarrollo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d=sc.nextInt();
        int n=sc.nextInt();
        boolean buscarNum=false;

        while (!buscarNum && n>0) {
            if (n%10==d) {
                buscarNum=true;
                n=n/10;
            } 
        }   
        if(buscarNum){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}