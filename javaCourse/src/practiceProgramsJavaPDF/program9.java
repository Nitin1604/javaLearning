package practiceProgramsJavaPDF;

public class program9 {
    // The Scope and Lifetime of Variables's example 3
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Outside of the scope and value of a is: " + a);
        {
            // Create new scope
           // int a  = 2; // Compile time error as a is already defined
            System.out.println("Create a new scope and if any variable is created in this scope then error will come!!");
        }
    }
}
