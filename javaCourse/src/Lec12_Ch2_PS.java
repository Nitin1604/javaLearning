import java.util.Scanner;
public class Lec12_Ch2_PS {

    public static void main(String[] args) {
        /*
           Question 1 : What will be the result of the following expression
            Expression: float a = 7/4 * 9/2
        */
        float Result = 7/4.0f * 9/2.0f;
        System.out.println(Result);

        /*
          Question 2 : Write a java program to encrypt a grade by adding 8 to it.
                        Decrypt it to show the correct grade.
         */
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.print("The grade is: ");
        System.out.println(grade);

        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.print("After decrypting the grade is: ");
        System.out.println(grade);

        /*
         Question 3 : Use comparison operators to find out whether a given number
                      is greater than the user entered number or not.
          */
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(A>8);

        /*
         Question 4 : Write the following expression in a java program
           Expression : v2-u2/2as
         */
        // Define the variables
        double v = 10.0; // Example value for final velocity
        double u = 5.0;  // Example value for initial velocity
        double a = 2.0;  // Example value for acceleration
        double s = 3.0;  // Example value for displacement

        // Calculate the expression (v^2 - u^2) / (2as)
        double result = (Math.pow(v, 2) - Math.pow(u, 2)) / (2 * a * s);

        // Print the result
        System.out.println("The result of the expression is: " + result);

        /*
        Question 5 : Find the value of 'a' in expression given below
          Expression :-
                        int x = 7
                        int a = 7*49/7 + 35/7
        */
        System.out.print("The result of the expression in java is: ");
        System.out.println(7*49/7+35/7);

    }
}
