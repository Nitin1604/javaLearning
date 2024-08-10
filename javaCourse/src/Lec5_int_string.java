import java.util.Scanner;

public class Lec5_int_string {
    public static void main(String[] args) {

        // Checking the int by taking input from user
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        // Printing only one word
        Scanner sc1 = new Scanner(System.in);

        String str = sc1.next();
        System.out.println(str);

        // Printing whole sentence
        Scanner sc2 = new Scanner(System.in);

        String str1 = sc2.nextLine();
        System.out.println(str1);

        // Taking Input From the User Example 1
        System.out.println("Taking Input From the User");
        Scanner sc3 = new Scanner(System.in); // System.in --> Read from the keyboard
        System.out.println("Enter number 1");
        int a = sc3.nextInt();
        System.out.println("Enter number 2");
        int b = sc3.nextInt();

        int sum = a +b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);

        // Taking Input From the User Example 2
        System.out.println("Taking Input From the User");
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter number 1");
        float A = sc4.nextFloat();
        System.out.println("Enter number 2");
        float B = sc4.nextFloat();

        float sum1 = A +B;
        System.out.println("The sum of these numbers is");
        System.out.println(sum1);


    }
}
