import java.util.Scanner;

public class TriangleFieldCalculator {
    public static void main(String[] args) {
        /*Write a program that calculates the area of the triangle
         whose three side lengths you get from the user.*/

        float side1,side2,side3,perimeter,pwrField,u;
        double field ;
        Scanner fieldCalculator = new Scanner(System.in);

        System.out.println("pls enter side 1");
        side1 = fieldCalculator.nextFloat();

        System.out.println("pls enter side 2");
        side2 = fieldCalculator.nextFloat();

        System.out.println("pls enter side 3");
        side3 = fieldCalculator.nextFloat();

        u = (side1+side2+side3)/2;
        pwrField = u*(u-side1)*(u-side2)*(u-side3);
        field = Math.sqrt(pwrField);
        System.out.println(field);




    }
}
