package interview.problemSolving;

public class arrayPrime {
    public static boolean arrPrime(int arrPrimeNumChecking){

        if (arrPrimeNumChecking <= 1) {
            return false;
        }
        for (int i = 2; i < arrPrimeNumChecking; i++) {
            if (arrPrimeNumChecking % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arrayPrimeCount = 0;
        int[] arrayPrimeNumber = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        for(int i=1;i<=arrayPrimeNumber.length;i++) {
            if(arrPrime(i)) {
                arrayPrimeCount++;
            }
        }

        System.out.print("Total Prime number count is : " + arrayPrimeCount);
    }
}
