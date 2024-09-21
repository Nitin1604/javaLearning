package interview.problemSolving;

public class arrayReverse {
    public static int[] arrRev(int[] reverseArrObtained) {
        int arrItemInitial = 0;
        int arrItemsEnding = reverseArrObtained.length - 1;

        while (arrItemInitial < arrItemsEnding) {
            int storedVal = reverseArrObtained[arrItemInitial];
            reverseArrObtained[arrItemInitial] = reverseArrObtained[arrItemsEnding];
            reverseArrObtained[arrItemsEnding] = storedVal;

            arrItemInitial++;
            arrItemsEnding--;
        }

        return reverseArrObtained;
    }

    public static void main(String[] args) {
        int[] arrBeforeReverse = {1, 2, 3, 4, 5};
        int[] arrRevResult = arrRev(arrBeforeReverse);

        System.out.print("Reversed array is: ");
        for (int arrItems : arrRevResult) {
            System.out.print(arrItems + " ");
        }
    }
}

