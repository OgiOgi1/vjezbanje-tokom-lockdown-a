package Zadaci3_25_2021;

public class Zadatak5_40 {
    public static void main(String[] args) {
        int coin = 0;
        int head = 0;
        int tail = 0;
        System.out.println("Let me spin the  coin million times....");
        for(int i  = 0; i < 1000000; i ++){
            coin = (int)(Math.random() * 2) == 0 ? head++ : tail++; ;
        }
        System.out.println("Heads: " + head + " Tails: " + tail);
    }
}
