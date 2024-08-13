package practiceProgramsJavaPDF;

class boxContent {
    double width;
    double height;
    double depth;

    // Compute and return value
    double volume(){
        return width * height * depth;
    }
}

public class program30 {
    // Returning a Value based example
    public static void main(String[] args) {
      boxContent boxClass1 = new boxContent();
      boxContent boxClass2 = new boxContent();
      double vol;

      // Assign value to boxClass1's instance variables
        boxClass1.width = 20;
        boxClass1.height = 30;
        boxClass1.depth = 50;


      // Assign value to boxClass2's instance variables
        boxClass2.width = 60;
        boxClass2.height = 80;
        boxClass2.depth = 20;

      // Get Volume of the first box
        vol = boxClass1.volume();
        System.out.println("Volume of the first box is: " + vol);

      // Get Volume of the second box
        vol = boxClass2.volume();
        System.out.println("Volume of the second box is: " + vol);

      }

    }
