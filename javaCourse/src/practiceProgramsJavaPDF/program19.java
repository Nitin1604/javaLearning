package practiceProgramsJavaPDF;

public class program19 {
    // Introducing Type Inference with Local Variables's examples
    public static void main(String[] args) {

        // Use type inference to determine the type of the variable named avg. In this case, double is inferred.
        var avg = 10.02;
        System.out.println("Value of avg: " + avg);

        // In the following context , var is not a predefined identifier. It is simply user defined variable name.
        int var = 1;
        System.out.println("Value of var: " + var);

        // Interesting, in the following sequence, var is used as both the type of the declaration and as a variable name.
        var k = -var;
        System.out.println("Value of k: " + k);
    }
}
