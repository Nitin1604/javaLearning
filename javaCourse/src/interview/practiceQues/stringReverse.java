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
//    static boolean isPalindrome(String str) {
//
//    }

    public static void main(String[] args) {
        System.out.println(reversingString("sokhalllllj"));
        System.out.println(reversingString("nitins"));
        System.out.println(reversingString("jatin"));
        System.out.println(reversingString("abc123"));

        System.out.println(reversingString(""));
        System.out.println(reversingString(null));


    }
}

