interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blownHorn1();
    void blownHorn2();
}

class AvonCycle implements Bicycle, HornBicycle{
    //public int x = 5;
    void blowHorn(){
        System.out.println("Blowing the horn");
    }
    public void applyBrake(int decrement){
        System.out.println("Brake is applying");
    }
    public void speedUp(int increment){
        System.out.println("Speed is increasing");
    }
    public void blownHorn1(){
        System.out.println("Blowing the horn for first one.");
    }
    public void blownHorn2(){
        System.out.println("Blowing the horn for second one.");
    }
}

public class Lec54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleNitin = new AvonCycle();
        cycleNitin.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println("cycleNitin.a is: " + cycleNitin.a);
        System.out.println("cycleNitin.x is: " + cycleNitin.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleNitin.a = 454;
        //System.out.println(cycleNitin.a);

        cycleNitin.blownHorn1();
        cycleNitin.blownHorn2();
    }
}
