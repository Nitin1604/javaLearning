package interview.practiceQues;
import java.util.Scanner;
public class checkingEven_odd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scan.nextInt();

        if (a % 2 == 0) {
            System.out.println(a + " is an even number.");
        }
        else{
            System.out.println(a + " is a odd number. ");
        }

    }
}
