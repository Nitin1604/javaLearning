package practiceProgramsJavaPDF;

class Box {
    double width;
    double height;
    double depth;
}

public class program27 {
    // Example based on Class Part 1
    public static void main(String[] args) {
        Box mybox = new Box();
       double vol;

       // assign variables to mybox's instance variables
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // Compute volumne of the box
        vol =  mybox.width * mybox.height * mybox.depth;

        System.out.println("Volumne is: " + vol);
    }
}
