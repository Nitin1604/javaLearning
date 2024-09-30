// Ques 4. Write a Java program to calculate the average value of array elements.
package interview.problemSolving;

public class avgNumArray {
    public static double avgNumCalc(int [] avgNumCalcuation){
        int sum = 0;
        for (int i = 0; i < avgNumCalcuation.length; i++) {
            sum += avgNumCalcuation[i];
        }
        double arrAverage = (double) sum / avgNumCalcuation.length;
        return arrAverage;
    }
    public static void main(String[] args) {
        int[] avgNum = {4,2,3};
        double avgNumResult = avgNumCalc(avgNum);
        System.out.println("Average is: " + avgNumResult);
    }
}
