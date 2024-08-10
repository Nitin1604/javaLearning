package practiceProgramsJavaPDF;

public class program14 {
    // One-Dimensional Arrays's example 3
    public static void main(String[] args) {
        double nums[] = {10.1 , 11.11, 12.12, 15.15, 16.16};
        double result = 0;
        int i;
        for (i=0;i<5;i++){
            result+= nums[i];
            System.out.println("Average is: " + result / 5);

        }
    }
}
