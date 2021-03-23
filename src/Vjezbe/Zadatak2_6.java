package Vjezbe;

public class Zadatak2_6 {
    public static void main(String[] args) {
        System.out.println(intager(222));
    }

    public static int intager(int broj) {
        int zbir = 0;
        int prviBRojUIntageru = 1;
        while (prviBRojUIntageru != 0) {
            prviBRojUIntageru = broj % 10;
            broj = broj / 10;
            zbir += prviBRojUIntageru;
        }


        return zbir;

    }

}
