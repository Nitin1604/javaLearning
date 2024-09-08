package interview.practiceQues;

import java.util.Scanner;

public class palindromeString {
    static String reversingString(String stringRevInput) {
        if(stringRevInput == null || stringRevInput.isEmpty()) return stringRevInput;

        String strRev = "";
        for (int i = stringRevInput.length() - 1; i >= 0; i--) {
            strRev += stringRevInput.charAt(i);
        }
        return strRev;
    }
    static boolean isPalindrome(String str) {

        String palindromeStr = reversingString(str);
        return str.equals(palindromeStr);
    }

    public static void main(String[] args) {
        Scanner palindStr = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String palindromeStrCheck  = palindStr.next();
        System.out.println("Reversed string: " + reversingString(palindromeStrCheck));
        System.out.println("String is palindrome: " + isPalindrome(palindromeStrCheck));
    }
}
