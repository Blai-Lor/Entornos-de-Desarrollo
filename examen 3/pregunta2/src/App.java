import java.util.Scanner;

public class App {

    public static int countaa(String s) {
        if (s.length() == 2) {
            if (s.charAt(0) == 'a' && s.charAt(1) == 'a') {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (s.charAt(0) == 'a' && s.charAt(1) == 'a' && s.charAt(2) == 'a') {
                return 2 + countaa(s.substring(1));
                
        } else if (s.charAt(0) == 'a' && s.charAt(1) == 'a') {
            return 1 + countaa(s.substring(1));
        } else {
            return countaa(s.substring(1));
        }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int respuesta = countaa(n);
        System.out.println(respuesta);
        
        sc.close();
    }
}
