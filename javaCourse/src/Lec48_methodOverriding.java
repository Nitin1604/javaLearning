class A1_Class{
    public int a;
    public int nitin(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A1_Class");
    }
}

class bestClass extends A1_Class{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class bestClass");
    }
    public void meth3(){
        System.out.println("I am method 3 of class bestClass");
    }
}
public class Lec48_methodOverriding {
    public static void main(String[] args) {
        A1_Class a = new A1_Class();
        a.meth2();

        bestClass b = new bestClass();
        b.meth2();
        b.meth3();
    }
}