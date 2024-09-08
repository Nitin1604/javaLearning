package interview.practiceQues;
import java.util.Scanner;
    public class evenOddMethods {
    public static boolean evenNumber(int evenNum){
        return evenNum % 2 == 0;
   }

   public static  boolean oddNumber(int oddNum){
        return  oddNum % 2 != 0;
   }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int checkingEvenOdd = sc.nextInt();
            if(evenNumber(checkingEvenOdd)){
                System.out.println(checkingEvenOdd + " is an even number.");
            }
            else {
                System.out.println(checkingEvenOdd + " is a odd number.");
            }
        }
}
