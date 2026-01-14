package es.cide.desarrollo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numTriangulo;
        int numCirculo;
        int i=0;
        int altura;
        int ancho;
        int areatria;
        Double areacirc;
        Double radio;
        Double pi = Math.PI; //El numero pi

        System.out.println("¿Cuantos triangulos quieres?");
        numTriangulo=sc.nextInt();
        System.out.println("¿Cuantos circulos quieres?");
        numCirculo=sc.nextInt();

        while (i<numTriangulo){
            System.out.println("Altura del triangulo");
            altura=sc.nextInt();

            System.out.println("Anchura del triangulo");
            ancho=sc.nextInt();

            areatria = altura * ancho;
            System.out.println(areatria);
            i++;
        }

        i = 0; //Reiniciamos la i para no llevar las i's del anterior bucle

        while(i<numCirculo){
            System.out.println("Radio del circulo");
            radio = sc.nextDouble();
            areacirc = (radio * radio) * pi;
            System.out.println(areacirc);
            i++;
        }

        System.out.println("");
        System.out.println("");
    }
}