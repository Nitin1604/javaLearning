package interview.problemSolving;

public class arrayReverse {
    public static int[] arrRev(int[] reverseArray) {
        int arrItemStart = 0;
        int arrItemsEnd = reverseArray.length - 1;

        while (arrItemStart < arrItemsEnd) {
            int storedVal = reverseArray[arrItemStart];
            reverseArray[arrItemStart] = reverseArray[arrItemsEnd];
            reverseArray[arrItemsEnd] = storedVal;

            arrItemStart++;
            arrItemsEnd--;
        }

        return reverseArray;
    }

    public static void main(String[] args) {
        int[] arrOld = {1, 2, 3, 4, 5};
        int[] arrRevResult = arrRev(arrOld);

        System.out.print("Reversed array is: ");
        for (int arrItems : arrRevResult) {
            System.out.print(arrItems + " ");
        }
    }
}

