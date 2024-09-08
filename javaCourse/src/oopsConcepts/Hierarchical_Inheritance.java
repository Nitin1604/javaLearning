package oopsConcepts;

class fruitss {
    void Mangoes() {
        System.out.println("fruitss are good for health");
    }
}

class bananas  extends fruitss  {
    void bananas() {
        System.out.println("bananas make the bone strong");

    }
}

class Pineapple  extends fruitss {
    void apples() {
        System.out.println("Pineapples is also good for health");
    }
}
class HierarchicalInheritance {
    public static void main(String[] args) {

        System.out.println("Child 1:");
        bananas ban = new bananas();
        ban.Mangoes();
        ban.bananas();

        System.out.println();
        System.out.println("Child 2");
        Pineapple pa = new Pineapple();
        pa.Mangoes();
        pa.apples();
    }
}
