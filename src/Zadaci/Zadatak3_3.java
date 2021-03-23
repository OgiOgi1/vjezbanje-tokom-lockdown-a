package Zadaci;

import java.util.Scanner;

public class Zadatak3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite a , b, c, d, e i f");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        if ((a*b - b*c) == 0){
            System.out.println("The equation has no solution (nema resenja)");
        }
        else{
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            System.out.println("X je " + x + "Y je " + y);

        }

    }
}
