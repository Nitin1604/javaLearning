package practiceProgramsJavaPDF;

// Automatic type conversions apply to overloading
class methodOverload {
    // No parameters
    void test(){
        System.out.println("No parameters were given");
    }

    // Overload test for two integer parameters
    void test(int a, int b){
        System.out.println("a and b are: " + a + " and " + b);
    }

    // Overload test for double parameters
    void test(double a){
        System.out.println("Inside test(double) a: " + a);
    }
}
public class program35 {
    public static void main(String[] args) {
        methodOverload mOver = new methodOverload();
        int i = 89;

        mOver.test();
        mOver.test(10, 20);

        mOver.test(i); // this will invoke test(double)
        mOver.test(123.2); // this will invoke test(double)

    }
}
