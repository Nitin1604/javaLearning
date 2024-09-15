package interview.practiceQues;

import java.util.Scanner;

public class characterCount {

    public static void charCount(String stringInput) {
        boolean[] counted = new boolean[stringInput.length()];
        int repeatCount = 0;

        for (int i = 0; i < stringInput.length(); i++) {
            if (!counted[i]) {
                char charEval = stringInput.charAt(i);
                int count = 0;

                for (int j = 0; j < stringInput.length(); j++) {
                    if (stringInput.charAt(j) == charEval) {
                        count++;
                        counted[j] = true;
                    }
                }

                if (count > 1) {
                    System.out.println(charEval + " is coming " + count + " times.");
                    repeatCount++;
                }
            }
        }

        System.out.println("Count is: " + repeatCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String strInput = sc.nextLine();
        charCount(strInput);
    }

}
