package practiceProgramsJavaPDF;

class MyBox{
    double width;
    double height;
    double depth;

    // Display Volume of the box
    void volume(){
        System.out.println("Volume is: ");
        System.out.println(width * height * depth);
    }

}
public class program29 {
    // Examples based on Method
    public static void main(String[] args) {
        MyBox bOX1 = new MyBox();
        MyBox bOX2 = new MyBox();

        // Assign values to bOX1's instance variables
        bOX1.width = 15;
        bOX1.height = 200;
        bOX1.depth = 10;

        // Assign different values to bOX2's instance variables
        bOX2.width = 19;
        bOX2.height = 16;
        bOX2.depth = 3;

        // Display the volume for bOX1
        bOX1.volume();

        // Display the volume for bOX2
        bOX2.volume();

    }
}
