package interview.practiceQues;

import java.util.Scanner;

public class middleString {
    public static void midStr(String middleStr){
        int length = middleStr.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            System.out.println("Middle of the string is: " + middleStr.charAt(middleIndex - 1) + " and " + middleStr.charAt(middleIndex));
        } else {
            System.out.println("Middle of the string is: " + middleStr.charAt(middleIndex));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String strInput = sc.next();
        midStr(strInput);
    }
}
