package Zadaci;

import java.util.Random;
import java.util.Scanner;

public class Zadatak3_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pc = (int) (Math.random() * 3);
        System.out.println("Izaberite i unesite: makaze(0), kamen (1), papir(2)");
        int korisnikovUnos = scanner.nextInt();
        System.out.println("Racunar je odabrao:");

        switch (pc) {
            case 0:
                System.out.println("makaze");
                break;
            case 1:
                System.out.println("kamen");
                break;
            case 2:
                System.out.println("papir");
                break;
        }



        System.out.println("Korisnik(ti) je odabrao:");
        switch (korisnikovUnos) {
            case 0:
                System.out.println("makaze");
                break;
            case 1:
                System.out.println("kamen");
                break;
            case 2:
                System.out.println("papir");
                break;
    }
    if(pc == korisnikovUnos){
        System.out.println("Nereseno");
    }
    else{
        boolean win = (korisnikovUnos == 0 && pc == 2) ||
                (korisnikovUnos == 1 && pc == 0) ||
                (korisnikovUnos == 2 && pc == 1);
        if (win)
            System.out.println("Pobeda :)");
        else
            System.out.println("Izgubio si :(");
    }
} }
