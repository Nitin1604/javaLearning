package practiceProgramsJavaPDF;

public class program5 {

  // Booleans's examples

    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is : " + b);
        b = true;
        System.out.println("b is : " + b);

        // a boolean value can control the if statement
        if(b) System.out.println("It will executed");

        b = false;
        if(b) System.out.println("It will not executed");

        // Outcome of the relational operator is a boolean value
        System.out.println("10 > 9 is : " + (10 > 9));
    }

}
