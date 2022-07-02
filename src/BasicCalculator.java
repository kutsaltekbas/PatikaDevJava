import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1,num2;
        double result =0;
        String operator;
        Scanner opScanner = new Scanner(System.in);

        System.out.println("pls enter number 1:");
        num1 = opScanner.nextDouble();

        System.out.println("pls enter number 2:");
        num2 = opScanner.nextDouble();

        System.out.println("pls select a operator (+,-,*,/)");
        operator = opScanner.next();

        switch (operator){
            case "+" : result = num1+num2;break;
            case "-" : result = num1-num2;break;
            case "*" : result = num1*num2;break;
            case "/" : result = num1/num2;break;
            default:
                System.out.println("unexpected error"); break;
        }
        System.out.println("result = "+result);
    }
}
