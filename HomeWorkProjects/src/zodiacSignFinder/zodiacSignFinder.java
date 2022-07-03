package zodiacSignFinder;

import java.util.Scanner;

public class zodiacSignFinder {
    public static void main(String[] args) {
        int yearOfBirth,sign;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls enter your year of birth");

        while (true) {
            yearOfBirth = scanner.nextInt();
            if (yearOfBirth<=0 ||yearOfBirth>9999 ){
                System.out.println("pls enter a real year of birth");
            }
            else break;
        }
        sign = yearOfBirth%12;

        switch (sign){
            case 0 : System.out.println("Monkey");break;
            case 1 : System.out.println("Rooster");break;
            case 2 : System.out.println("Dog");break;
            case 3 : System.out.println("Pig");break;
            case 4 : System.out.println("Mice");break;
            case 5 : System.out.println("Ox");break;
            case 6 : System.out.println("Tiger");break;
            case 7 : System.out.println("Rabbit");break;
            case 8 : System.out.println("Dragon");break;
            case 9 : System.out.println("Snake");break;
            case 10 : System.out.println("Horse");break;
            case 11 : System.out.println("Sheep");break;
            default:
                System.out.println("unexpected error"); break;


        }


    }
}
