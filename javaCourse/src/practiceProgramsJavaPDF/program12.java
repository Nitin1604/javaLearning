package practiceProgramsJavaPDF;

public class program12 {
    // One-Dimensional Arrays's example 1
    public static void main(String[] args) {
        int[] monthDays;
        monthDays = new int[12];
        monthDays[0] = 31; // January
        monthDays[1] = 28; // February
        monthDays[2] = 31; // March
        monthDays[3] = 30; // April
        monthDays[4] = 31; // May
        monthDays[5] = 30; // June
        monthDays[6] = 31; // July
        monthDays[7] = 31; // August
        monthDays[8] = 30; // September
        monthDays[9] = 31; // October
        monthDays[10] = 30; // November
        monthDays[11] = 31; // December


        System.out.println("March has " + monthDays[2] + " days.");


    }
}
