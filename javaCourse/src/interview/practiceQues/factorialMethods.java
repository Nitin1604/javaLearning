package interview.practiceQues;

import java.util.Scanner;

public class factorialMethods {

    public static int factorialNum(int number){
        if(number == 0){
            return 1;
        }
        else {
            return number * factorialNum(number -1);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int factNum = scan.nextInt();
        int result = factorialNum(factNum);
        System.out.println("Factorial of " + factNum + " is: " + result);

    }
}
