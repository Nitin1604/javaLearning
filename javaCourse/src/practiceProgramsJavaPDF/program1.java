package practiceProgramsJavaPDF;

public class program1 {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // appoximate speed of light in miles per second
        lightspeed = 186000;

        days = 1000; // specify the number of days here

        seconds = days * 24 * 60 * 60; // convert to seconds

        distance = lightspeed * seconds;

        System.out.println(" In " + days + " days light will travel about " + distance + " miles.");
    }
}
