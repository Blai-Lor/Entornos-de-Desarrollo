package es.cide.desarrollo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int numCent4=4;
        int numCent7=7;
        int total=0;
        int cont7=0;
        int cont4=0;
        int q=0;
        int p=0; //contador 7
        
        int min=n;
        boolean trobat =false;
        while (sc.hasNext() && !trobat){
            if (sc.hasNextInt()) {
                n=sc.nextInt();
                int minStamps=n; //Valor inicial grande
                int bestP=0, bestQ=0;
            
        
                for (p = 0; p < n/7; ++p) {
                    int remaning=n-7*p;
                    if (remaning%4==0) {
                        q=remaning/4;
                        if (p+q<min) {
                            bestP=p;
                            bestQ=q;
                        }
                    }
                }
                System.out.println(bestP+""+bestQ);
            }else {
                //si encuentra un punto, salimos
                String token= sc.next();
                if (token.equals(".")){
                    trobat = true;
                }
            }
        }
        System.out.println(p);
        System.out.println(q);
        sc.close();
    }
}