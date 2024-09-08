package interview.practiceQues;

public class oddSum {
    public static void main(String[] args) {
        int sumOf_odd = 0;
        int numInput = 10;
        for (int i = 1;i<=numInput;i++){
            if (i % 2 != 0){
                sumOf_odd += i;
            }
        }
        System.out.println("Sum of odd number is: "+ sumOf_odd);
    }
}
