package practiceProgramsJavaPDF;

// Demonstrate the inner class
class OuterClass {
    int outer_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    // This is the inner class
    class Inner {
        void display(){
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
public class program44 {
    // Nested and Inner Classes based example
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.test();
    }
}
