package interview.practiceQues;

public class evenUnique {
    public static void main(String[] args) {
        int[] evenUniquePairs = {7, 3, 5, 4, 8, 10, 16};
        int count = 0;

        for (int i = 0; i < evenUniquePairs.length; i++) {
                if (evenUniquePairs[i] % 2 == 0 && evenUniquePairs[i+1] % 2 == 0) {
                    count++;
                    i++;
                }
        }
        System.out.println("Count of even pairs is: " + count);
    }
}
