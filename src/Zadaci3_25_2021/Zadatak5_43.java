package Zadaci3_25_2021;

public class Zadatak5_43 {
    public static void main(String[] args) {
        int brojac = 0;
        for (int i = 0; i < 7; i++){
            for(int i1 =  i + 1; i1 <= 7; i1 ++){
                System.out.println("Combinations are: " + i + i1);
                brojac ++;
            }
        }
        System.out.println("The total number of all combinations is " + brojac);
    }
}
