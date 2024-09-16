package interview.practiceQues;

public class stringReverse {
    static String reversingString(String stringRevInput) {
        // base case handling
        if(stringRevInput == null || stringRevInput.isEmpty()) return stringRevInput;

        // actual code handling
        String strRev = "";
        for (int i = stringRevInput.length() - 1; i >= 0; i--) {
            strRev += stringRevInput.charAt(i);
        }
        return strRev;
    }


    public static void main(String[] args) {
        System.out.println(reversingString("sokhal"));
        System.out.println(reversingString("nitin"));
        System.out.println(reversingString("karan"));
        System.out.println(reversingString("jitesh"));

        System.out.println(reversingString(""));
        System.out.println(reversingString(null));


    }
}

