package practiceProgramsJavaPDF;

// Here milkBox defines three constructors to initialize the dimensions of the box in various ways
class milkBox {
    int price;
    int liters;
    int numberOfPackets;

    // Constructor used when all dimensions specified
    milkBox(int rs, int l, int np){
        price = rs;
        liters = l;
        numberOfPackets = np;
    }
    // Constructor used when no dimensions were specified
    milkBox(){
        // use -1 to indicate an uninitialized milkBox
        price = -1;
        liters = -1;
        numberOfPackets = -1;
    }
    // Constructor used when cube is created
    milkBox(int len){
        price = liters = numberOfPackets = len;
    }
    // Compute and return the values
    int totalPrice(){
        return price + liters + numberOfPackets;
    }
}
public class program36 {
    public static void main(String[] args) {
        // Create milkBox using the various constructors
        milkBox milkBox1 = new milkBox(60,2,100);
        milkBox milkBox2 = new milkBox();
        milkBox banana = new milkBox(7);

        int totalPrice;

        // Get the total price of quantity
        totalPrice = milkBox1.totalPrice();
        System.out.println("Total price of milk are: " + totalPrice);

        // Calculating price of banana
        totalPrice = banana.totalPrice();
        System.out.println("Total price of banana is: " + totalPrice);

    }
}
