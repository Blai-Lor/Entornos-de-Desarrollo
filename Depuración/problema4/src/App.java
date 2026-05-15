public class App {
    public static void main(String[] args) {
        int numero = 5;
        if (Math.random() > 0.5) {
        numero = 10;
        }
        System.out.println(numero);
    }
}

/*
Codigo original:

public static void main(String[] args) {
    int numero;
    if (Math.random() > 0.5) {
        numero = 10;
    }
    System.out.println(numero);
}

*/