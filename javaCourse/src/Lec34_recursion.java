import java.util.Scanner;
public class Lec34_recursion {

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i=1;i<=n;i++){ // 1 to n
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int factorialResult;
        System.out.print("Enter a number: ");
        factorialResult = sc.nextInt();
        System.out.println("The value of factorial(factorialResult) is: " + factorial(factorialResult));
        System.out.println("The value of factorial_iterative(factorialResult) is: " + factorial_iterative(factorialResult));
    }
}
