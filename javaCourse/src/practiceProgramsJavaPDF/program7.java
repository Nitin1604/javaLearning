package practiceProgramsJavaPDF;

public class program7 {
    // The Scope and Lifetime of Variables's example 1
    public static void main(String[] args) {
        int x; // know to all code within main

        x = 10;
        if(x==10){ // start new scope
            int y = 20; // only know to this block

            // x and y are both known here
            System.out.println("x and y: " +  x + " " + y);
            x = y * 2;
        }
        // y = 100;  // Error as y is not known here

        // x is still known here
        System.out.println("x is " + x);
    }
}
