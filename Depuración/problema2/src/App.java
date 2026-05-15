public class App {
    public static void main(String[] args) {
        String usuari = new String("admin");
        if (usuari.equals("admin")) {
            System.out.println("Accés concedit");
        } else {
            System.out.println("Accés denegat");
        }
    }
}

/*
Codigo original:

public static void main(String[] args) {
    String usuari = new String("admin");
    if (usuari == "admin") {
        System.out.println("Accés concedit");
    } else {
        System.out.println("Accés denegat");
    }
}

*/