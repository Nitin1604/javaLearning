package practiceProgramsJavaPDF;

class Boxes {
    double width;
    double height;
    double depth;
}

public class program28 {
  // Example based on Class Part 2

  public static void main(String[] args) {
        Boxes box1 = new Boxes();
        Boxes box2 = new Boxes();
        double vol;

     // assign values to box1's instance variables
      box1.width = 10;
      box1.height = 20;
      box1.depth = 15;

      // assign the different values to box2's instance variables
      box2.width = 3;
      box2.height = 6;
      box2.depth = 9;

      // Compute volume of the first box
      vol = box1.width * box1.height * box1.depth;
      System.out.println("Volume of the box1 is: " + vol);

      // Compute volume of the second box
      vol = box2.width * box2.height * box2.depth;
      System.out.println("Volume of the box2 is: " + vol);

  }
}
