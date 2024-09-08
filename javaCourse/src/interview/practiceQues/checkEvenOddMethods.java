package interview.practiceQues;

import java.util.Scanner;
public class checkEvenOddMethods {

    public static boolean evenOdd(int num){
        if (num % 2 == 0){
            System.out.println(num + " is an even number.");
        }
        else {
            System.out.println(num + " is a odd number.");
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int numInput = sc.nextInt();
        evenOdd(numInput);

    }

}
