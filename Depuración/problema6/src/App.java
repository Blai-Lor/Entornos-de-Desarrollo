import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> noms = new ArrayList<>();
        noms.add("Anna");
        noms.add("Joan");
        noms.add("Maria");
            for (int i = 0; i < noms.size(); i++) {
                if (noms.get(i).equals("Joan")) {
                    noms.remove(i);
                }
            }
        System.out.println(noms);
    }
}

/*
Codigo original:

ArrayList<String> noms = new ArrayList<>();
        noms.add("Anna");
        noms.add("Joan");
        noms.add("Maria");
        for (int i=0; i<3; i++) {
            if (noms.get(i) == "Joan") {
                noms.remove(noms.get(i));
            }
        }
        System.out.println(noms);

*/