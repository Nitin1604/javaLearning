public class Lec29_Ch6_PS {
    public static void main(String[] args) {

        // Question 1 : Create an array of 5 floats and calculate their sum.
        System.out.println("Question 1:-");
         float [] marksFloat = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marksFloat){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);


        // Question 2 : Write a program to find out whether a given integer is present in an array or not.
        System.out.println("Question 2:-");
        int [] marks = {45, 69, 64, 92, 100};
        int num = 45;
        boolean isInArray = false;
        for(int element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }


        // Question 3 : Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
        System.out.println("Question 3:-");

        int [] marksInt = {57, 68, 74, 100, 200};
        int summation = 0;
        for(int element:marks){
            summation = summation + element;
        }
        System.out.println("The value of average marks is " + summation/marksInt.length);


        // Question 4 : Create a Java program to add two matrices of size 2x3.
        System.out.println("Question 4:-");
        int [][] matrix1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] matrix2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0;i<matrix1.length;i++){ // row number of times
            for (int j=0;j<matrix1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<matrix1.length;i++){ // row number of times
            for (int j=0;j<matrix1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            System.out.println(""); // Prints a new line
        }

        // Question 5 : Write a Java program to reverse an array.
        System.out.println("Question 5:-");
        int [] arrSwap = {1, 21, 3, 4, 5, 34, 67};
        int l = arrSwap.length;
        int n = Math.floorDiv(l, 2);
        int tempValue;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   tempValue
            // |4| |3| ||
            tempValue = arrSwap[i];
            arrSwap[i] = arrSwap[l-i-1];
            arrSwap[l-i-1] = tempValue;
        }

        for(int element: arrSwap){
            System.out.print(element + " ");
        }
        System.out.println();

        // Question 6 : Write a Java program to find the maximum element in an array.
        System.out.println("Question 6:-");
        int [] arrMax = {1, 2100, 3, 455, 5, 34, 67};
        int max = 0;
        for(int maxArrIteration:arrMax){
            if(maxArrIteration>max){
                max = maxArrIteration;
            }
        }

        System.out.println("the value of the maximum element in this array is: "+ max);

        System.out.println(max);

        // Question 7 : Write a Java program to find the minimum element in a Java array.
        System.out.println("Question 7:-");
        int[] arrMin = {100, 2100, 3, 455, 5, 34, 67};

        // Initialize 'min' to the first element of the array
        int min = arrMin[0];

        // Loop through the array to find the minimum element
        for (int minArrIteration : arrMin) {
            if (minArrIteration < min) {
                min = minArrIteration;
            }
        }

        System.out.println("The value of the minimum element in this array is: " + min);

        System.out.println(min);

        // Question 8 : Write a Java program to find whether an array is sorted or not.
        System.out.println("Question 8:-");
        boolean isSorted = true;
        int [] arrSorted = {1, 2, 3, 4, 5, 34, 67};
        for(int i=0;i<arrSorted.length-1;i++){
            if(arrSorted[i] > arrSorted[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }
}
