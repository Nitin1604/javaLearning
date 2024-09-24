package interview.problemSolving;

public class avgNumArray {
    public static double avgNumCalc(int [] avgNumCalcuation){
        int sum = 0;
        for (int i = 0; i < avgNumCalcuation.length; i++) {
            sum += avgNumCalcuation[i];
        }
        double arrAverage = sum / avgNumCalcuation.length;
        return arrAverage;
    }
    public static void main(String[] args) {
        int[] avgNum = {21, 46, 26, 5, 2};
        double avgNumResult = avgNumCalc(avgNum);
        System.out.println("Average is: " + avgNumResult);
    }
}
