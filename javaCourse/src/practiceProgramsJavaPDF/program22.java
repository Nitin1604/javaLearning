package practiceProgramsJavaPDF;

public class program22 {
    // Arithmetic Compound Assignment Operators's examples
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a += 5;
        System.out.println(a);
        b *= 4;
        System.out.println(b);
        c += a * b;
        System.out.println(c);
        c %= 6;
        System.out.println("a is: " + a);
        System.out.println("b is: " + b);
        System.out.println("c is: " + c);
    }
}
