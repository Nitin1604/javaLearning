package practiceProgramsJavaPDF;

class Tester {
    int a;

    Tester(int i){
        a = i;
    }
    Tester incrByTen(){
        Tester temp = new Tester(a+10);
        return  temp;
    }
}

public class program38 {
    // Returning Objects Example
    public static void main(String[] args) {
        Tester obj1 = new Tester(2);
        Tester obj2;

        obj2 = obj1.incrByTen();
        System.out.println("obj1.a: " + obj1.a);
        System.out.println("obj2.a: " + obj2.a);

        obj2 = obj2.incrByTen();
        System.out.println("obj2.a after second increase: "+ obj2.a);
    }
}
