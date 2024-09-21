package interview.problemSolving;

public class arrayEven {
    public static int[] arrEvenFilter(int[] evenArrayObtained){
        int count = 0;
        // Iterative over the array items and filter the even numbers
        for (int i = 0; i < evenArrayObtained.length; i++) {
            if (evenArrayObtained[i] % 2 == 0){
                count++;
            }
        }

        // Making an array of size based on the value of count
        int[] arrSize = new int[count];
        int arrIndex = 0;

        // Placing the value in the mini array obtained from the value of count
        for (int i = 0; i < evenArrayObtained.length; i++) {
            if (evenArrayObtained[i] % 2 == 0) {
                arrSize[arrIndex] = evenArrayObtained[i];
                arrIndex++;
            }
        }

        return arrSize;
    }
    public static void main(String[] args) {
        int[] arrEvenCalc = {11, 42, 62, 7, 5};
        int[] arrEvenResult = arrEvenFilter(arrEvenCalc);
        System.out.println("Even number obtained from array are:- ");
        for (int i = 0; i < arrEvenResult.length; i++) {
            System.out.print(arrEvenResult[i] + " ");
        }
    }
}
