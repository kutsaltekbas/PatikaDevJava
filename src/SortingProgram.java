import java.util.Scanner;

public class SortingProgram {
    public static void main(String[] args) {
        //Write a program that sorts the 3 entered numbers "from least to greatest".

        int a,b,c;
        Scanner numScanner = new Scanner(System.in);

        System.out.println("pls enter number 1");
        a = numScanner.nextInt();

        System.out.println("pls enter number 2");
        b = numScanner.nextInt();

        System.out.println("pls enter number 3");
        c = numScanner.nextInt();

        if(a<b && c<b){
            if(a<c){
                System.out.println("a<c<b");
            }
            else{
                System.out.println("c<a<b");
            }
        }
        else if (a<c) {
            if (a < b) {
                System.out.println("a<b<c");
            } else {
                System.out.println("b<a<c");
            }
        }
        else{
            if (b<c){
                System.out.println("b<c<a");
            }
            else{
                System.out.println("c<b<a");
            }

        }

    }
}
