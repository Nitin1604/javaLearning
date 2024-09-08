package interview.practiceQues;

public class ReturnTest {
    public static void main(String[] args) {
        boolean flag = true;

        System.out.println("Before return statement");

        if (flag) {
            return;
        }

//         return; // this will throw compile error
        System.out.println("After return statement, uncomment above line to see compile time error");
    }

    public static class checkingPrimeNumbers {
    }
}
