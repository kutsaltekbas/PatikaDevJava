package ticketProgram;

import java.security.KeyStore;
import java.util.Scanner;

public class TicketProgram {
    public static void main(String[] args) {

        float distance,actualPrice, discountedPrice =0;
        int age,tType;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome! pls enter your age:");
            age = scanner.nextInt();
            if (age>0) break;
            else System.out.println("error! please enter a number greater than 0");
        }

        while (true) {
            System.out.println("Choose your travel type: (1-one way,2-round trip)");
            tType = scanner.nextInt();
            if (tType == 1 || tType == 2) break;
            else System.out.println("error! you must choose 1 or 2");
        }

        while (true) {
            System.out.println("Pls enter your travel distance:");
            distance = scanner.nextFloat();
            if (distance>0) break;
            else System.out.println("error! please enter a number greater than 0");
        }
        actualPrice = distance*0.10f;
        System.out.println("actual price: "+actualPrice+"$");

        if (tType == 2) {
            discountedPrice = actualPrice - (actualPrice*(20f/100f));
            System.out.println("travel type discount: "+(actualPrice*(20f/100f))+"$");
        }

        if (age<12) {
            discountedPrice = discountedPrice-(actualPrice/2);
            System.out.println("age discount: "+(actualPrice/2)+"$");
        }
        else if (age >=12 || age <=24){
            discountedPrice = discountedPrice-(actualPrice*(10f/100f));
            System.out.println("age discount: "+(actualPrice*(10f/100f))+"$");
        }
        else if (age>65){
            discountedPrice = discountedPrice-(actualPrice*(30f/100f));
            System.out.println("age discount: "+(actualPrice*(30f/100f))+"$");
        }
        System.out.println("last price: "+discountedPrice+"$");
    }

}
