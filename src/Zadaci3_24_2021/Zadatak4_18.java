package Zadaci3_24_2021;

import java.util.Scanner;

public class Zadatak4_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String slovo = scanner.next();

        char unesenoSlovo = Character.toUpperCase(slovo.charAt(0));
        char unesenaGodina = slovo.charAt(1);

        String imeZaSlova = "";
        String imeZaGodine = "";

        if (unesenoSlovo == 'M' || unesenoSlovo == 'I' || unesenoSlovo == 'C')
        {
            switch(unesenoSlovo)
            {
                case 'M':
                    imeZaSlova = "Mathematics";
                    break;
                case 'C':
                    imeZaSlova = "Computer Science";
                    break;
                case 'I':
                    imeZaSlova = "Information Technology";
                    break;
                default:
                    break;
            }

            switch(unesenaGodina)
            {
                case '1':
                    imeZaGodine = "Freshman";
                    break;
                case '2':
                    imeZaGodine = "Sophmore";
                    break;
                case '3':
                    imeZaGodine = "Junior";
                    break;
                case '4':
                    imeZaGodine = "Senior";
                    break;
                default:
                    break;
            }
            System.out.printf("Vi ste: " + imeZaSlova + " i " + imeZaGodine);
        }
        else{
            System.out.printf("Invalid input");
        }

    }
}
