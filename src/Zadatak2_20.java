import java.util.Scanner;

public class Zadatak2_20 {
    public static void main(String[] args) {
        System.out.println("Unesite vas Balance");
        Scanner scanner = new Scanner(System.in);
        double balance = scanner.nextDouble();
        System.out.println("Unesite vas InterestRate");
        double intererstRate = scanner.nextDouble();
        double interest = balance * (intererstRate/1200.0);
        System.out.println("Iznos je " + interest);

    }
}
