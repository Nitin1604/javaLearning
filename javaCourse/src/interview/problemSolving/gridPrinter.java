package interview.problemSolving;

// Ques 4. Write a Java program to calculate the average value of array elements.
public class gridPrinter {
    public static void main(String[] args) {
        int numInput = 10;
        for (int innerCont = 0; innerCont < 5; innerCont++){
            System.out.println();
            for(int i = 0; i<=numInput;i++){
                System.out.print("-" + " ");
            }
        }
    }
}
