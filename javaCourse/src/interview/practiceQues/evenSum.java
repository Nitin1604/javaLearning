package interview.practiceQues;

public class evenSum {

    public static void main(String[] args) {
        int sumOf_even = 0;
        int numInput = 10;
        for (int i = 1;i<=numInput;i++){
            if (i % 2 == 0){
                sumOf_even += i;
            }
        }
        System.out.println("Sum of even number is: "+ sumOf_even);
    }
}
