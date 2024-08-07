public class Lec26_Arrays {
    public static void main(String[] args) {
       
        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
         int [] obtainedMarks = new int[5];

        // 2. Declaration and then memory allocation
         int [] marks;
        obtainedMarks = new int[5];
        // Initialization
        obtainedMarks[0] = 100;
        obtainedMarks[1] = 60;
        obtainedMarks[2] = 70;
        obtainedMarks[3] = 90;
        obtainedMarks[4] = 86;

        System.out.println("Marks: " + obtainedMarks[0]);
        System.out.println("Marks: " + obtainedMarks[1]);
        System.out.println("Marks: " + obtainedMarks[2]);
        System.out.println("Marks: " + obtainedMarks[3]);
        System.out.println("Marks: " + obtainedMarks[4]);

        // 3. Declaration, memory allocation and initialization together
        int [] Marks = {98, 45, 79, 99, 80};

        // Marks[5] = 96; - throws an error
        System.out.println(Marks[4]);
    }
}
