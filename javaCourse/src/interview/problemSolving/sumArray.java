package interview.problemSolving;

public class sumArray {
    public static int sumArrayCalc(int [] arrayItemsCalcualation){
        int sum = 0;
        for (int i = 0; i < arrayItemsCalcualation.length; i++) {
            sum += arrayItemsCalcualation[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] sumArr = {44,22,21,75,65};
        int sumNumResult = sumArrayCalc(sumArr);
        System.out.println("Sum is: " + sumNumResult);
    }
}
