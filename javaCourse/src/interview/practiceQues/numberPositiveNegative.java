package interview.practiceQues;

import java.util.Scanner;

public class numberPositiveNegative {
    public static void positiveNegative(int numInput){
        if (numInput > 0){
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is negative");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int numberInput = sc.nextInt();
        positiveNegative(numberInput);
    }
}
