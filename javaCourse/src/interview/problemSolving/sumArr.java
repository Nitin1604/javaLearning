package interview.problemSolving;

public class sumArr {
    public static int sumArr(int [] sumArray){
        int sum = 0;
        // Iterate over all the items of the array.
        for (int i = 0; i< sumArray.length; i++){
            sum+= sumArray[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arrayItems = {1,2,3,4,5};
        int arrSumCalc = sumArr(arrayItems);
        System.out.println("The sum of the array items is: " + arrSumCalc);

    }
}
