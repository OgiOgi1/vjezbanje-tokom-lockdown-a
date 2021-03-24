package Zadaci3_24_2021;

import java.util.Scanner;

public class Zadatak4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite s:");
        double s = scanner.nextDouble();
        double area = (6*s * s) / (4* Math.tan(Math.PI / 6));
        System.out.println("Area je: " + area);
    }
}
