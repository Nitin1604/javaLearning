package practiceProgramsJavaPDF;

class outer {
    int outer_x = 100;
    void test(){
        for (int i = 0; i<10;i++){
            class Inner {
                void display(){
                    System.out.println("display: outer_x = " + outer_x); // Prints 10 times
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
public class program45 {
    public static void main(String[] args) {
        outer outerObj = new outer();
        outerObj.test();
    }
}
