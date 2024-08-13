package practiceProgramsJavaPDF;

class container {
    int width;
    int height;
    int depth;

    // Compute and return the value
    int volume(){
        return width * height * depth;
    }

    // Setting the dimension of the container
    void setDimension(int w, int h, int dep){
        width = w;
        height = h;
        depth = dep;

    }
}

public class program31 {
    // Example based on Adding a Method That Takes Parameters
    public static void main(String[] args) {
        container cont1 = new container();
        container cont2 = new container();
        int vol;

        // Initialize each container
        cont1.setDimension(20,15,25);
        cont2.setDimension(29,55,35);

        // Get Volume of the first container
        vol = cont1.volume();
        System.out.println("Volume of the first container is: " + vol);

        // Get Volume of the second container
        vol = cont2.volume();
        System.out.println("Volume of the second container is: " + vol);

    }
}
