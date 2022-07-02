import java.util.Scanner;

public class GroceryAmountCalculator {
    public static void main(String[] args) {
        /*Write a program in Java that prints
         the total amount of the products purchased from the grocery store,
         according to the kilogram values, to the screen.*/

        float pineapple = 12.7f;
        float banana = 20.0f;
        float strawberry = 7.0f;
        float totalAmount = 0;
        float temp;

        Scanner amountCal = new Scanner(System.in);

        System.out.println("How many pineapples");
        temp = amountCal.nextFloat();
        totalAmount += temp*pineapple;

        System.out.println("How many bananas");
        temp = amountCal.nextFloat();
        totalAmount += temp*banana;

        System.out.println("How many strawberries");
        temp = amountCal.nextFloat();
        totalAmount += temp*strawberry;

        System.out.println("Total amount = " + totalAmount);



    }
}
