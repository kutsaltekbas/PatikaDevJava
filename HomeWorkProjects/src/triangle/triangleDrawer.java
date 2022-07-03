package triangle;

import java.util.Scanner;

public class triangleDrawer {
    public static void main(String[] args) {
        int i,j,k,num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter a number");
        num = scanner.nextInt();

        for (i=1; i<num; i++) {
            for(j=i; j<num;j++) {
                System.out.print(" ");
            }
            for (k=1; k<=i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
