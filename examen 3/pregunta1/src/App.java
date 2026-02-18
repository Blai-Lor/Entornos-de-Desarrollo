import java.util.Scanner;

public class App {
    
    public static int otro(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static int engrandir(int x) {
        if (x < 10) {
            return x;
        } else {
            return engrandir(x/10)*10 + otro(x%10, engrandir(x/10)%10);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int respuesta = engrandir(n);
        System.out.println(respuesta);

        sc.close();
    }
}
