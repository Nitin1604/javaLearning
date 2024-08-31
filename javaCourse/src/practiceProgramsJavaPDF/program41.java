package practiceProgramsJavaPDF;

class accessModifiers {
    int a; //  default access
    public int b;  //  public access
    private int c;  // private access

 // methods to access c
    void set_C (int i){
     c =i;
    }

    int get_C(){  // get c's value
    return  c;
    }
}
public class program41 {
    public static void main(String[] args) {
        accessModifiers aM = new accessModifiers();

        // These are OK, a and b may be accessed directly
        aM.a= 10;
        aM.b= 20;

        // This is not OK and produce and error
        // aM.c = 30;  // Error because variable c has private access

        // Variable c must be accessed through its methods
        aM.set_C(30);  // Alright no error in this line
        System.out.println("a is: " + aM.a + " ," + " b is: " + aM.b + " ," + " and c is: " + aM.get_C());
    }
}
