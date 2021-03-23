package Zadaci;

import java.util.Random;
import java.util.Scanner;

public class Zadatak3_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pritisnite 0 za head ili 1 za tails");
        int pogodak = scanner.nextInt();
        Random random = new Random();
        int bacanje = random.nextInt(2);

        if(pogodak == bacanje){
            System.out.println("Pogodili ste, svaka cast!");
        }
        else{
            System.out.println("Niste pogodili, unlucky");
        }

    }
}
