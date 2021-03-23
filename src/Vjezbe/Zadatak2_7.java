package Vjezbe;

public class Zadatak2_7 {
    public static void main(String[] args) {
        int minute = 1080000;
        int goidna = 0;
        int dan = (int) (minute/ 60 / 24) % 365;
        goidna = minute / (int) 525959.4;
        System.out.println("Broj godina " + goidna + " Broj dana " + dan);
    }


}
