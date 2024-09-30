// Practice Questions : https://www.w3resource.com/java-exercises/array/index.php
package interview.problemSolving;

// Ques 2. Write a Java program to sum values of an array.
public class sumArray {
    public static int sumArrayCalc(int [] arrayItemsCalculation){
        int sum = 0;
        for (int i = 0; i < arrayItemsCalculation.length; i++) {
            sum += arrayItemsCalculation[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] sumArr = {44,22,21,75,65};
        int sumNumResult = sumArrayCalc(sumArr);
        System.out.println("Sum is: " + sumNumResult);
    }
}
