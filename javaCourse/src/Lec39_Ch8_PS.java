// Question 1 Solution
class Employees{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

// Question 2 Solution
class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }

}

// Question 3 Solution
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

// Question 4 Solution
class Rectangle{
    int length;
    int width;

    public int area(){
        return  length * width;
    }

    public int perimeter(){
        return 2*(length + width);
    }
}

// Question 5 Solution
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

// Question 6 Solution
class Circle {
    int radius;
    public double area(){
        double areaCircle = 3.14 * radius * radius;
        return areaCircle;
    }
    // C=2πr --> Perimeter of circle

    public  double perimeter(){
        double perimeterCircle = 2 * 3.14 * radius;
        return perimeterCircle;
    }

}
public class Lec39_Ch8_PS {
    public static void main(String[] args) {
        /*
         Question 1 : Create a class Employee with the following properties and methods:

                        Salary (property) (int)
                        getSalary (method returning int)
                        name (property) (String)
                        getName (method returning String)
                        setName (method changing name)
         */
        Employees nitin = new Employees();
        nitin.setName("Nitin");
        nitin.salary = 233;
        System.out.println(nitin.getSalary());
        System.out.println(nitin.getName());

        // Question 2 : Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();


        // Question 3 : Create a class Square with a method to initialize its side, calculating area, perimeter etc.
        Square sq = new Square();
        sq.side = 3;
        System.out.println("Area of the square: " + sq.area());
        System.out.println("Perimeter of the square: " + sq.perimeter());

        // Question 4 : Create a class Rectangle & problem 3.
        Rectangle recta = new Rectangle();
        recta.length = 2;
        recta.width = 6;
        System.out.println("Area of the rectangle is: " + recta.area() + " cm^2");
        System.out.println("Perimeter of the rectangle is: " + recta.perimeter() + " feet");


        // Question 5 : Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

        // Question 6 : Repeat problem 4 for a circle.
        Circle circleArea = new Circle();
        circleArea.radius = 4;
        System.out.println("Area of the circle: " + circleArea.area());

        Circle circlePerimeter = new Circle();
        circlePerimeter.radius = 6;
        System.out.println("Perimeter of the circle: " + circlePerimeter.perimeter());

    }
}