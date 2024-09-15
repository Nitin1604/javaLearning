package interview.practiceQues;

import java.util.Scanner;


public class characterCount2 {

    public static void charCount(String stringInput){
        for (int i = 0; i<stringInput.length();i++){
            char charEval = stringInput.charAt(i);
            int count = 0;

            for (int j = 0; j <stringInput.length();j++){
                if (stringInput.charAt(j)== charEval){
                    count++;
                }
            }
            if (count >= 0){
                System.out.println(charEval + " is coming " + count + " times.");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String strInput  = sc.next();
        charCount(strInput);
    }

}