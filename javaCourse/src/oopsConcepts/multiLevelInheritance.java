package oopsConcepts;

class mangoes extends fruits {
    void Mangoes() {
        System.out.println("Mangoes are of two types:-");
        System.out.println("Branarshi Aam");
        System.out.println("Chosha Aam");
    }
}

class banana extends mangoes {
    void Banana() {
        System.out.println("Banana makes the bone strong.");
    }
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        banana ft = new banana();
        ft.fruitItems();
        ft.Mangoes();
        ft.Banana();
    }
}
