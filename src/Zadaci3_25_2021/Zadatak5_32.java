package Zadaci3_25_2021;

import java.util.Scanner;

public class Zadatak5_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two lottery digits");
        int unosOdKorisnika = scanner.nextInt();
        int guess1 = unosOdKorisnika /10;
        int guess2 = unosOdKorisnika % 10;
        int lotteryDigit1 = (int) (Math.random() * 10);
        int lotteryDigit2 = 0;
        do {
            lotteryDigit2 = (int)(Math.random() * 10);
        }
        while (lotteryDigit1 == lotteryDigit2);
        System.out.println("Lottery numbers are: " + " " + lotteryDigit1 + " " + lotteryDigit2);
        if(guess1 == lotteryDigit1 && guess2 == lotteryDigit2){
            System.out.println("Congrats, WIN!(100000$)");
        }
        else if (guess2 == lotteryDigit1 && guess1 == lotteryDigit2){
            System.out.println("Congrats, WIN!(10000$)");
        }
        else if (guess1 == lotteryDigit1 || guess1 == lotteryDigit2 || guess1 == lotteryDigit2 || guess2 == lotteryDigit1){
            System.out.println("Congrats, WIN!(2000$)");
        }
        else {
            System.out.println("Unlucky, no WIN");
        }



    }
}
