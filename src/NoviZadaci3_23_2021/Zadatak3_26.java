package NoviZadaci3_23_2021;

import java.util.Scanner;

public class Zadatak3_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite integer");
        int uneseniIteger = scanner.nextInt();
        System.out.println("da li je " + uneseniIteger + " djeljiv sa 5 i 6? " +
                ((uneseniIteger % 5 == 0) && (uneseniIteger % 6 == 0)));
        System.out.println("da li je " + uneseniIteger +  " djeljiv sa 5 ili 6? " +
                ((uneseniIteger % 5 == 0) || (uneseniIteger % 6 == 0)));
        System.out.println("da li je " + uneseniIteger + " djeljiv sa 5 ili 6, ali ne oboje? " +
                ((uneseniIteger % 5 == 0) ^ (uneseniIteger % 6 == 0)));
    }
}
