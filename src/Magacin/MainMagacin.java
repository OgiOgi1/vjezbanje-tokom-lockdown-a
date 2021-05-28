package Magacin;

public class MainMagacin {
    public static void main(String[] args) {

        Magacin magacin = new Magacin();

        Magacioner mag1 = new Magacioner("Ibro");
        Magacioner mag2 = new Magacioner("Milos");

        Artikl masina = new Artikl("Masina", 1, "Zlata", 1);
        Artikl esencija = new Artikl("Dest esencija", 2, "Brza Posta", 0.5);
        Artikl sijalica = new Artikl("Tesla", 3, "Tim eletric", 0.3);
        Artikl komp = new Artikl("HP", 4, "Antena Mont", 1);

        magacin.dodajMagacionera(mag1);
        magacin.dodajArtikl(masina);

        System.out.println("Magacin: " + magacin);
    }

}
