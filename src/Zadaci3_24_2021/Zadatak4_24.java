package Zadaci3_24_2021;

import java.util.Scanner;

public class Zadatak4_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String prviGrad = scanner.nextLine();

        System.out.print("Enter the second city: ");
        String drugiGrad = scanner.nextLine();

        System.out.print("Enter the third city: ");
        String treciGrad = scanner.nextLine();

        if (prviGrad.charAt(0) >= drugiGrad.charAt(0)) {
            if(drugiGrad.charAt(0) >= treciGrad.charAt(0) ){
                System.out.println("The three cities in alphabetical order are:" + treciGrad + " " + drugiGrad + "" + prviGrad + "" );
            }
            else if (prviGrad.charAt(0) >= treciGrad.charAt(0)){
                System.out.println("The three cities in alphabetical order are: " + drugiGrad + "" + treciGrad + "" + prviGrad + "");
            }
            else if(treciGrad.charAt(0) >= prviGrad.charAt(0)){
                System.out.println("The three cities in alphabetical order are: " + drugiGrad + "" + prviGrad + "" + treciGrad + "");
            }
            else{
                if(treciGrad.charAt(0) >= drugiGrad.charAt(0)){
                    System.out.println("The three cities in alphabetical order are:" + prviGrad + "" + drugiGrad + "" + treciGrad + "");
                }
                else if(prviGrad.charAt(0) >= treciGrad.charAt(0)){
                    System.out.println("The three cities in alphabetical order are: " + treciGrad + "" + prviGrad + "" +drugiGrad + "");
                }
                else if(treciGrad.charAt(0) >= prviGrad.charAt(0)){
                    System.out.println("The three cities in alphabetical order are: " + prviGrad + "" + treciGrad + "" + drugiGrad + "");
                }
            }
        }
}
}