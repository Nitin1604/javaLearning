import java.util.Scanner;
public class Lec25_Ch5_PS {
    public static void main(String[] args) {
        /*
        Question 1 : Write a program to print the following pattern
                    ****
                    ***
                    **
                    *
        */
        System.out.println("Question 1:-");
        int n = 4;
        for (int i=n; i>0; i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Question 2 : Write a program to sum first n even numbers using a while loop.
        System.out.println("Question 2:-");
        int sum=0;
        int num=4;
        for(int i=0;i<num;i++){
            sum = sum + (2*i);
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);

        // Question 3 : Write a program to print the multiplication table of a given number n.
        System.out.println("Question 3:-");
        int num1 = 5;
        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n", num1, i, n*i);
        }

        // Question 4 :  Write a program to print a multiplication table of 10 in reverse order.
        System.out.println("Question 4:-");
        int num2 = 10;
        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for(int i=10;i>=1;i--){
            System.out.printf("%d X %d = %d\n", num2, i, n*i);
        }

        // Question 5: Write a program to find the factorial of a given number using for loops.
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter any number: ");
            int numInput = scn.nextInt();
            int factorial = 1;
            for (int factR = 1; factR <= numInput; factR++){
                factorial *= factR;
            }
        System.out.println("Factorial is: " + factorial);

        // Question 6 : Repeat problem 5 using a while loop.
        System.out.println("Question 6:-");
        int num3 = 5;
        int i = 1;
        int factorialResult = 1;
        while(i<=num3){
            factorialResult *= i;
            i++;
        }
        System.out.println(factorialResult);

        // Question 7: Repeat problem 1 using for/while loop.
        System.out.println("Printing pattern using while loop:-");
        int rows = 4;
        int currentRow = 1;

        while (currentRow <= rows) {
            int stars = rows - currentRow + 1;

            int currentStar = 1;
            while (currentStar <= stars) {
                System.out.print("*");
                currentStar++;
            }

            System.out.println();
            currentRow++;
        }

        // Question 8:
        System.out.println("Ques 8 : What can be done using one type of loop can also be done using the other two types of loops - True or False.");
        System.out.println("Ans 8: " + true);

        // Question 9 : Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        System.out.println("Question 9:-");
        int num4 = 8;
        int addition = 0;
        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for(int I=1;I<=10;I++){
            addition += num4*I;
        }
        System.out.println(addition);
    }
}
