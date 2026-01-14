import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String parentesis = sc.next();
        Boolean encontrado = false;
        Boolean correcto = true;
        int contador = 0;
        int i = 0;

        while (!encontrado&&i<parentesis.length()) { 
            char c = parentesis.charAt(i);
            
            if (c == '.') {
                encontrado = true;
            } if (c == '(') {
                contador++;

            } else if (c == ')') {
                contador--;

            } if (contador < c) {
                correcto = false;
            }

            i++;
        }

        if (contador != 0) {
            correcto = false;
        }

        if (correcto) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}