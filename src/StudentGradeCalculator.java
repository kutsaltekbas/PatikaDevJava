import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        //if - else will not be used

        float math,physics,chemistry,turkish,history,musik,average;
        String result;

        Scanner gradeScanner = new Scanner(System.in);

        System.out.println("Pls enter your math grade:");
        math = gradeScanner.nextFloat();

        System.out.println("Pls enter your physics grade:");
        physics = gradeScanner.nextFloat();

        System.out.println("Pls enter your chemistry grade:");
        chemistry = gradeScanner.nextFloat();

        System.out.println("Pls enter your turkish grade:");
        turkish = gradeScanner.nextFloat();

        System.out.println("Pls enter your history grade:");
        history = gradeScanner.nextFloat();

        System.out.println("Pls enter your musik grade:");
        musik = gradeScanner.nextFloat();

        average = (math+physics+chemistry+turkish+history+musik)/6;
        result = (average>=60)?"gecti":"kaldi";

        System.out.println(result);

    }
}
