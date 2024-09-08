package interview.practiceQues;

public class sumOfEven {
    public static void main(String[] args) {
        int evenSum = 0;
        int numTerminate = 10;
        for (int i = 1;i<=numTerminate;i++){
            if (i % 2 == 0){
                evenSum += i;
            }
        }
            System.out.println("Sum of even number is: "+ evenSum);
    }

}
