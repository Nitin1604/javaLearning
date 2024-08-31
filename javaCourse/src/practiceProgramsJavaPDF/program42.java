package practiceProgramsJavaPDF;

class program42 {
    static int a =  3;
    static int b;

static void meth(int x){
    System.out.println("x is: " + x + " ," + " a is: " + a + " ," + " and b is: " + b );
  }
static {
    System.out.println("Static block initialized");
    b = a * 4;
 }
    public static void main(String[] args) {
        meth(42);
    }
}
