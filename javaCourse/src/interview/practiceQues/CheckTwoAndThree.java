package interview.practiceQues;

public class CheckTwoAndThree {

    public static boolean isDivideBy2(int num1){
        return num1 % 2 == 0;
    }

    public static boolean isDivideBy3(int num2){
        return num2 % 3 == 0;
    }

    public static void main(String[] args) {
        int numInput = 1000000;
        int divisibleNum2Count = 0;
        int divisibleNum3Count = 0;


        for (int i = 1; i <= numInput; i++){
            if (isDivideBy2(i)){
                divisibleNum2Count++;
            }

            if (isDivideBy3(i)){
                divisibleNum3Count++;
            }
        }
    }
}
