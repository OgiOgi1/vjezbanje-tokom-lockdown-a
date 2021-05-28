package Zadaci3_28_2021;

import java.util.Scanner;

public class Zadatak7_3 {
    public static void main(String[] args) {
        int[] counts = new int[100];
        System.out.print("Enter the integers from 1 to 100 ");
        count(counts);
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0)
                System.out.println((i + 1) + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
        }
    }

    public static void count(int[] counts) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            number = scanner.nextInt();
            if (number >= 1 && number <= 100)
                counts[number - 1]++;
        } while (number != 0);
    }
}
