import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;
        boolean encontrado = false;

        while (!encontrado && sc.hasNextLine()) {
            String entrada = sc.nextLine();
            for (int i = 0; i < entrada.length(); i++) {
                char coordenada = entrada.charAt(i);

                if (coordenada == '.') {
                    System.out.println("(" + x + "," + y + ")");
                    encontrado = true;
                }

                if (coordenada == 'n') {
                    y--;
                } else if (coordenada == 's') {
                    y++;
                } else if (coordenada == 'e') {
                    x++;
                } else if (coordenada == 'w') {
                    x--;
                }
            }
        }

        sc.close();
    }
}
