package Online_Prodavnica;

import Magacin.Artikl;
import Magacin.Magacioner;

import java.util.Scanner;

public class MainProdavnica {
    private static Object Artikl;

    public static void main(String[] args) {
        MainProdavnica prodavnica = new MainProdavnica();

        // scanner
        Scanner scanner = new Scanner(System.in);


        //dodati kupce


        //NaziviIOpisiArtikala
        NazivIOpisArtikala artikal1 = new NazivIOpisArtikala("Masina", 300, "Vrhunska", 100);
        NazivIOpisArtikala artikal2 = new NazivIOpisArtikala("Esencija", 2, "Brza", 0.5);
        NazivIOpisArtikala artikal3 = new NazivIOpisArtikala("Sijalica", 3, "Svijetli", 0.3);
        NazivIOpisArtikala artikal4 = new NazivIOpisArtikala("Komp", 10000, "3xgtx3090", 2);


    }
}
