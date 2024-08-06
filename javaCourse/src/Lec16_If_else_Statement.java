import java.util.Scanner;

public class Lec16_If_else_Statement {
    public static void main(String[] args) {
         // If Else Statement
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of passengers to go into lift: ");
        int liftCase = sc.nextInt();
        if (liftCase>16) {
            System.out.println("Lift is overloaded");
        }
        else if(liftCase == 16){
            System.out.println("Lift is still going to platform");
        }
        else {
            System.out.println("Lift is going to platform");
        }

    }
}
