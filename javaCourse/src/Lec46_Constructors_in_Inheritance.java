class baseClass{
    baseClass(){
        System.out.println("This is a constructor");
    }
    baseClass(int x){
        System.out.println("This is an overloaded constructor with value of x as: " + x);
    }
}

class derivedClass extends baseClass{
    derivedClass(){
        super(0);
        System.out.println("This is a derived class constructor");
    }
    derivedClass(int x, int y){
        super(x);
        System.out.println("This is an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends  derivedClass{
    ChildOfDerived(){
        System.out.println("This is a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("This is an overloaded constructor of Derived with value of z as: " + z);
    }
}
public class Lec46_Constructors_in_Inheritance {
    public static void main(String[] args) {
         baseClass b = new baseClass();
         derivedClass dc = new derivedClass();
         derivedClass dc1 = new derivedClass(14, 9);
         ChildOfDerived cd = new ChildOfDerived();
         ChildOfDerived cd1 = new ChildOfDerived(12, 13, 15);
    }
}
