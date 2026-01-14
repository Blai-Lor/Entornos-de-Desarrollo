import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int elem;
        Boolean salir = false;
        elem = sc.nextInt();
        Boolean eraPar = (elem%2 == 0);

        while (sc.hasNextInt() && !salir) {
            elem=sc.nextInt();
            if ((eraPar && (elem%2 == 0)) || (!eraPar && (elem%2 != 0 ))) {
                salir = true;
            }
            eraPar = (elem%2 == 0);
        }
        if (salir) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
