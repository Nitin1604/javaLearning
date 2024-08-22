class Cylinder {
    private int radius;
    private int height;

    // Constructor with parameters
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    // Question 3 Solution
    public Cylinder() {
        this.radius = 1;
        this.height = 1;
    }

    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Question 2 Solution
    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }

}

class Sphere {
    private int radius;
    private int height;

    public Sphere(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}

class Rectangles{
    // Question 4 Solution
    private int length;
    private int breadth;

    public Rectangles() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangles(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class Lec44_Ch9_PS {
    public static void main(String[] args) {
        // Question 1 : Create a class cylinder and use getter and setters to set its radius and height
        System.out.println("Question 1:-");
        Cylinder myCylinder = new Cylinder(9, 12);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
        System.out.println("");

        // Question 2 : use question 1 to calculate surface and volume of the cylinder
        System.out.println("Question 2:-");
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
        System.out.println("");


        // Question 4 : Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
        System.out.println("Question 4:-");
        Rectangles r = new Rectangles(12, 56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        System.out.println("");

        // Question 5 : Repeat question 1 for a sphere
        System.out.println("Question 5:-");
        Sphere mySphere = new Sphere(2, 4);
        System.out.println(mySphere.getHeight());
        System.out.println(mySphere.getRadius());




    }
}
