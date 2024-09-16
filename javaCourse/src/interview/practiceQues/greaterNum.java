package interview.practiceQues;

import java.util.Scanner;

public class greaterNum {

    public static void main(String[] args) {
      Scanner num1 = new Scanner(System.in);
      System.out.print("Enter 1st number: ");
      int numInput1 = num1.nextInt();

      Scanner num2 = new Scanner(System.in);
      System.out.print("Enter 2nd number: ");
      int numInput2 = num2.nextInt();

      Scanner num3 = new Scanner(System.in);
      System.out.print("Enter 3rd number: ");
      int numInput3 = num3.nextInt();

      if (numInput1 > numInput2){
          if (numInput1 > numInput3){
              System.out.println(numInput1 + " is a greater number.");
          }
      }
      if (numInput2 > numInput1){
          if (numInput2 > numInput3){
              System.out.println(numInput2 + " is a greater number.");
          }
      }
      if (numInput3 > numInput1){
          if (numInput3 > numInput2){
              System.out.println(numInput3 + " is a greater number.");
          }
      }
      if (numInput1 == numInput2 || numInput2 == numInput3){
          System.out.println("All numbers are equal..greater number not found");
      }
    }
}
