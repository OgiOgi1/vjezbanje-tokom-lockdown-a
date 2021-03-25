package Zadaci3_25_2021;

import java.util.Scanner;

public class Zadatak5_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String enteredString = scanner.nextLine();
        String positions = "";
        for (int i = 0; i < enteredString.length(); i+=2) {
            positions += enteredString.charAt(i);
        }
        System.out.println(positions);
    }
}
