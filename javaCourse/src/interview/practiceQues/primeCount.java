package interview.practiceQues;

public class primeCount {
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

    public static void main(String[] args) {
        int primeCounting = 0;
        int primeNumberInput = 10;

        for(int i=1;i<primeNumberInput;i++) {
            if(isPrime(i)) {
                primeCounting++;
            }
        }

        System.out.println("Prime Count " + primeCounting);
    }
}
