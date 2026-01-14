package es.cide.desarrollo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String p=sc.next(); //Palabra a buscar 
        boolean notGreater = true;

        String s="";
        while (notGreater) { 
            s=sc.next();
            if(s.equals(".")){
                notGreater=false;
            }else if(p.compareTo(s) <= 0){
                notGreater=false;
            }
        }
        if(s.equals(p)){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}