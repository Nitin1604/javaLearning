package interview.problemSolving;

public class gridPrinter {
    public static void main(String[] args) {
        int numInput = 10;
        for (int innerCont = 0; innerCont < 10; innerCont++){
            System.out.println();
            for(int i = 0; i<=numInput;i++){
                System.out.print("-" + " ");
            }
        }
    }
}
