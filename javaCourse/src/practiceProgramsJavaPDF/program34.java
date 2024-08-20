package practiceProgramsJavaPDF;

// Demonstrate method overloading
class overloadDemo {
    // No parameters
    void test(){
        System.out.println("There is no parameters");
    }
    // Overload test for one integer parameter
    void test(int a){
        System.out.println("a: " +a);
    }
    // Overload test for two integer parameter
    void test(int a , int b){
        System.out.println("a and b are: " + a + " " + b);
    }
    // Overload test for double parameter
    double test(double a){
        System.out.println("double a: " + a);
        return a*a;
    }
}
public class program34 {
    // Method overloading example 1
    public static void main(String[] args) {
        overloadDemo ob = new overloadDemo();
        double result;

        // Calling all versions of test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of the ob.test(123.25): " +  result);
    }
}
