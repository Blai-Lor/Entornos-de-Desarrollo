import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int elem;
        int resposta = 0;

        while (sc.hasNextInt()) {
            elem=sc.nextInt();
            if (elem%2==0) {
                resposta += elem;
            } else {
                resposta -= elem;
            }
        }
        System.out.println(resposta);
    }
}
