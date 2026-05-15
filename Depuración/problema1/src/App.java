public class App {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 2, 9, 5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}

/*
Codigo original:

public static void main(String[] args) {
    int[] numeros = {4, 7, 2, 9, 5};
    for (int i = 0; i <= numeros.length; i++) {
        System.out.println(numeros[i]);
    }
}

*/