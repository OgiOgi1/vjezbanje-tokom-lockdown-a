package Zadaci3_24_2021;

import java.util.Scanner;

public class Zadatak4_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a letter : ");
        String slovo = in.next();
        char let = Character.toLowerCase(slovo.charAt(0));
        if (!Character.isLetter(let))
            System.out.println(slovo + " niste unjeli slovo!");
        else
        {
            switch(let)
            {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(slovo + " je vowel");
                break;
                default:
                    System.out.println(slovo + " nije vowel");
            }
        }
    }

    }
