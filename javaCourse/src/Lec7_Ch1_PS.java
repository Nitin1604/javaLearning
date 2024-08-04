import java.util.Scanner;
public class Lec7_Ch1_PS {
    public static void main(String[] args){
        // Question 1 : Write a program to sum three numbers in Java.
        int a = 69;
        int b = 98;
        int c = 63;
        int sum = a + b + c;
        System.out.println(sum);
        System.out.println();

        // Question 2 : Write a program to calculate CGPA using marks of three subjects (out of 100)
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;
        float cgpa = (subject1 + subject2 +subject3)/30;
        System.out.println(cgpa);

        // Question 3 : Write a Java program that asks the user to enter his/her name and greets
        // them with “Hello <name>, have a good day” text.
        System.out.println("What is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");

        // Question 4 : Write a Java program to convert Kilometers to miles.
       //   1*0.621371 | 1 KM --> 0.621371 miles
        float kiloMeter = 3;
        Scanner scan = new Scanner(System.in);
        float miles = 0.621371f;
        float conversion = kiloMeter * miles;
        System.out.println(conversion);

        // Question 5 : Write a Java program to detect whether a number entered by the user is an integer or not.
        System.out.println("Enter your number");
        Scanner sc2 = new Scanner(System.in);
        System.out.println(sc2.hasNextInt());
    }
}
