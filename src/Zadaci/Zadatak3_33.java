package Zadaci;

import java.util.Scanner;

public class Zadatak3_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite tezinu i cijenu prvog paketa");
        double tezinaPrvogPaketa = scanner.nextDouble();
        double cijenaPrvogPaketa = scanner.nextDouble();
        System.out.println("Unesite tezinu i cijenu drugog paketa");
        double tezinaDrugogPaketa = scanner.nextDouble();
        double cijenaDrugogPaketa = scanner.nextDouble();


        if((tezinaPrvogPaketa > tezinaDrugogPaketa) || (cijenaPrvogPaketa < cijenaDrugogPaketa)){
            System.out.println("Isplativiji je Prvi paket");
        }
       if(((tezinaDrugogPaketa > tezinaPrvogPaketa) || (cijenaDrugogPaketa < cijenaPrvogPaketa))){
        System.out.println("Isplativi je drugi paket");
        }
    }
}
