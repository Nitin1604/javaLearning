package interview.problemSolving;

/*
Ques 3. Write a Java program to print the following grid.
Expected Output :
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
 */

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
