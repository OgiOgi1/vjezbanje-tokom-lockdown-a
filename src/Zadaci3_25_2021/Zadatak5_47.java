package Zadaci3_25_2021;

import java.util.Scanner;

public class Zadatak5_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string:");
        String isbn = scanner.nextLine();
        if (isbn.length() != 12) {
            System.out.println(isbn + " Enter Correctly, Please!");
            System.exit(1);
        }
        int checkIsbn = 0;
        for (int i = 0; i < isbn.length(); i++) {
            checkIsbn += i % 2 == 0 ? 3 * Integer.parseInt(isbn.charAt(i) + ""):
                    Integer.parseInt(isbn.charAt(i) + "");
        }
        checkIsbn = 10 - checkIsbn % 10;
        System.out.println("The ISBN-13 number is " + isbn + (checkIsbn == 10 ? 0 : checkIsbn));
    }
}