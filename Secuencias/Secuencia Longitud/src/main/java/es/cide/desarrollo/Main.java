package es.cide.desarrollo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String primera = sc.next();
        boolean terminado = false;
        int c = 0;
        int maximo = 0;

        while (!terminado) {
            String elem = sc.next(); 
            if (elem.equals(".")) {
                terminado = true;
            } if (elem.equals(primera)) {
                ++c;
            } else {
                c = 0;
            } if (c > maximo){
                maximo = c;
            }
        }
        System.out.println(maximo);
        sc.close();
    }
}