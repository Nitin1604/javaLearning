package interview.practiceQues;
import java.util.Scanner;
public class primeNumbers  {
    static boolean isPrime(int primeInput){

        if (primeInput <= 1) {
        return false;
    }
        for (int i = 2; i < primeInput; i++) {
        if (primeInput % i == 0)
            return false;
    }
        return true;
}

    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number: ");
             int primeResult = sc.nextInt();

             if (isPrime(primeResult)) {
                System.out.println("It is a prime number");
                }
             else{

                System.out.println("It is not a prime number");
             }
    }
}
