class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Base class and setting x now");
        this.x = x;
    }

    public void print(){
        System.out.println("This is a constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Lec45_Inheritance {
    public static void main(String[] args) {

        // Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println("b.getX() value is: " + b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println("d.getY() value is: " + d.getY());
    }
}
