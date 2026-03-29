import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contador = 0;
        boolean seguir = true;

        while (seguir) {
            String texto = sc.nextLine();

            for (int i = 0; i < texto.length() && seguir; i++) {
                if (texto.charAt(i) == 'e') {
                    contador++;
                }
                if (texto.charAt(i) == '.') {
                    seguir = false;
                }
            }

            System.out.println(contador);
            contador = 0; 
        }

        sc.close(); 
    }
}