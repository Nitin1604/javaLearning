class Circles{
    // Ques 1 Solution
    public int radius;
    Circles(){
        System.out.println("I am non param of circle");
    }
    Circles(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class rectangles {
    // Ques 2 Solution
    private int length;
    private int breadth;

    // Non-parameterized constructor
    rectangles() {
        System.out.println("I am a non-parameterized constructor of rectangle");
    }

    // Parameterized constructor
    rectangles(int l, int b) {
        this.length = l;
        this.breadth = b;
        System.out.println("I am rectangle parameterized constructor");
    }

    // Getter and Setter for Length
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Getter and Setter for Breadth
    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Method to calculate area of the rectangle
    public double area() {
        return this.length * this.breadth;
    }
}


class cuboid extends rectangles {
    private int height;

    // Parameterized constructor for cuboid
    cuboid(int l, int b, int h) {
        super(l, b);  // Calling the constructor of rectangle
        this.height = h;
        System.out.println("I am cuboid parameterized constructor");
    }

    // Getter and Setter for Height
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Method to calculate volume of the cuboid
    public double volume() {
        return this.getLength() * this.getBreadth() * this.height;
    }
}


// Ques 3 Solution
class Cylinders extends Circles{
    public int height;
    Cylinders(int r, int h){
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Lec52_ps_ch10 {
    public static void main(String[] args) {
        // Ques 1 : Create a class circle and use inheritance to create another class cylinder from it
         Circles objC = new Circles(12);
         Cylinders obj = new Cylinders(12, 4);

        // Ques 2 : Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible
        rectangles objR = new rectangles(5, 10);
        System.out.println("Area of rectangle: " + objR.area());

        cuboid objCuboid = new cuboid(5, 10, 15);
        System.out.println("Volume of cuboid: " + objCuboid.volume());

        // Ques 3 : Create a method for area and volume in 1
        Circles obj_circle = new Circles(7);
        System.out.println("Area of circle: " + obj_circle.area());

        Cylinders objCy = new Cylinders(7, 10);
        System.out.println("Volume of cylinder: " + objCy.volume());

        // Ques 4 : create methods for area & volume in 2 also create getters and setters
        objCuboid.setHeight(20);
        objCuboid.setLength(7);
        System.out.println("New Volume of cuboid after setting new dimensions: " + objCuboid.volume());

        /*
        Ques 5 : What is the order of constructor execution for the following inheritance hierarchy
                    Base

                    Derived 1

                    Derived 2

        Derived obj = new Derived 2( );
        Which constructor(s) will be executed & in what order?
         */
        System.out.println("In an inheritance hierarchy, when an object of the most derived class is created, the constructors are executed in the order from the base class to the most derived class. This means:\n" +
                "\n" +
                "The Base class constructor is executed first.\n" +
                "Then the Derived 1 class constructor is executed.\n" +
                "Finally, the Derived 2 class constructor (the class whose object is being created) is executed.");

        class Base {
            Base() {
                System.out.println("Base class constructor");
            }
        }

        class Derived1 extends Base {
            Derived1() {
                System.out.println("Derived1 class constructor");
            }
        }

        class Derived2 extends Derived1 {
            Derived2() {
                System.out.println("Derived2 class constructor");
            }
        }

    }
}
