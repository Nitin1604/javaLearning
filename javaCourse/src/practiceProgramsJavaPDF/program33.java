package practiceProgramsJavaPDF;

// Here dibba uses a parameterized constructors to initialize the dimensions of a dibba.
class dibba {
    int width;
    int height;
    int depth;

    // This is the constructor of the dibba
    dibba(int w, int h, int dep){
        width = w;
        height = h;
        depth = dep;
    }

    // Compute and return volume
    int volume(){
        return width * height * depth;
    }
}

public class program33 {
    // Example based on Parameterized Constructors
    public static void main(String[] args) {
        // Declare , Allocate and initialize dibba object
        dibba meraDibba1 = new dibba(10,20,30);
        dibba meraDibba2 = new dibba(45,46,47);

        int vol;

        // Get the volume of phele wala dibba
        vol = meraDibba1.volume();
        System.out.println("Phele wale dibba ka volume hai: " + vol);

        // Get the volume of dusre wala dibba
        vol = meraDibba2.volume();
        System.out.println("Dusre wale dibba ka volume hai: " + vol);

    }
}
