package practiceProgramsJavaPDF;

// Here , Box uses a constructor to initialize the dimensions of the box
class containers {
    int width;
    int height;
    int depth;

    // This is the constructor of the containers
    containers(){
        System.out.println("Constructing containers");
        width = 10;
        height = 45;
        depth = 36;
    }
    // Compute the return volume
    int volume(){
        return width * height * depth;
    }
}

public class program32 {
    // Example based on Constructors
    public static void main(String[] args) {

        // Declare , allocate and initialize containers objects.
        containers containers1 = new containers();
        containers containers2 = new containers();

        int vol;

        // Get the volume of the first box
        vol = containers1.volume();
        System.out.println("Volume of the first container containers1 is: " + vol);
        // Get the volume of the second box
        vol = containers2.volume();
        System.out.println("Volume of the first container containers2 is: " + vol);

    }
}
