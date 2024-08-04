    /*
    Problem Statement:-
      Write a program to calculate the percentage of a given student in the CBSE board exam.
      His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)
    */
    import java.util.Scanner;
public class Lec6_javaEx1 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter subject 1 marks");
         float sub1 = sc.nextFloat();
         System.out.println("Enter subject 2 marks");
         float sub2 = sc.nextFloat();
         System.out.println("Enter subject 3 marks");
         float sub3 = sc.nextFloat();
         System.out.println("Enter subject 4 marks");
         float sub4 = sc.nextFloat();
         System.out.println("Enter subject 5 marks");
         float sub5 = sc.nextFloat();

         float result = (sub1 + sub2 + sub3 + sub4 + sub5)/500*100;
         System.out.println(result);

     }
}
