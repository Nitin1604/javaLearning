package interview.practiceQues;

public class fibonacciCalc {
    public static void main(String[] args) {
       int a = 0;
       int b = 1;
       int fiboEnd = 26;
        System.out.print(" " + a);
        System.out.print(" " + b);

        for (int i = 2; i< fiboEnd;i++){
            int c =  a+b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
