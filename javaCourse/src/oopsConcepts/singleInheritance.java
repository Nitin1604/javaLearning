package oopsConcepts;

class fruits {
    void fruitItems() {
        System.out.println("Fruits are good for health");
    }
}

class vegetables extends fruits {
    void vegetablesItem() {
        System.out.println("Chapati and vegetables are combined");
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        vegetables veg = new vegetables();
        veg.fruitItems();
        veg.vegetablesItem();
    }
}