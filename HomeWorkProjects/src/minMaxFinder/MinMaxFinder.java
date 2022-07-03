package minMaxFinder;

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        int minNum = -1,maxNum = 0,temp,counter =1;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("enter" + counter+". number (press 0 to exit)");
            temp = scanner.nextInt();
            counter++;
            if (temp == 0) break;

            if(temp > maxNum) maxNum = temp;
            if (temp < minNum) minNum = temp;
        }
        System.out.println("Minimum number: "+minNum);
        System.out.println("Maximum number: "+maxNum);
    }
}
