package interview.practiceQues;

public class divisibleNumbersMethods {
    public static boolean divisibleNum(int num1){
        return num1 % 2 == 0;
    }

    public static boolean divisibleNumber(int num2){
        return num2 % 3 == 0;
    }

    public static void main(String[] args) {
        int numInput = 10;
        int divisibleNum2 = 0;
        int divisibleNum3 = 0;

        for (int i = 1; i <= numInput; i++){
            if (divisibleNum(i)){
                divisibleNum2++;
            }
            else if (divisibleNumber(i)){
                divisibleNum3++;
            }
        }



        System.out.println("Divisible by 2 are: " + divisibleNum2 + " and Divisible by 3 are: " + divisibleNum3);
    }
}

