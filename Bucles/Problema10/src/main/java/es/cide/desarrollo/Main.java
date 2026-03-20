package es.cide.desarrollo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i=0;
        int a=sc.nextInt();
        int b=sc.nextInt();

        if (a<b) {
        for (i = 0; i <b; i++) {
            System.out.println(i + ",");
        }
        System.out.println(b);
        } else if (a==b){
            System.out.println(a);
        }
        sc.close();
    }
}