package Zadaci3_24_2021;

import java.util.Scanner;

public class Zadatak4_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite neki string");
        String uneseniString = scanner.nextLine();
        System.out.println("Duzina unesenog stringa je " + uneseniString.length() + " a prvo slovo mu je "
         + uneseniString.charAt(0));
    }
}
