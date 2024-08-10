package practiceProgramsJavaPDF;

public class program8 {
    // The Scope and Lifetime of Variables's example 2
    public static void main(String[] args) {

        int x;

        for (x = 0; x < 3; x++){
            int y = -1; // y is initialized each time block is entered
            System.out.println("y is : " + y); // y is -1 here
            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}
