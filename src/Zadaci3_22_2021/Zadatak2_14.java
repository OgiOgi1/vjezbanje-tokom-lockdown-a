package Zadaci3_22_2021;

import java.util.Scanner;

public class Zadatak2_14 {
    public static void main(String[] args) {
        System.out.println("Unesite tezinu");
        Scanner scanner = new Scanner(System.in);
        double weight = 0.45359237 * scanner.nextInt();
        System.out.println("Unesite visinu");
        double height = 0.0254 * scanner.nextInt();
        double bmi = weight / height;
        System.out.println("Vas BMI je " + bmi);
    }
}
