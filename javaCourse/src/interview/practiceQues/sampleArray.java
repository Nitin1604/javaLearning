package interview.practiceQues;

public class sampleArray {
    public static void main(String[] args) {
        int[] sampleArr = {3, 4, 5, 12, 21 , 48, 51, 88, 33 , 22};
        int evenCount = 0;
        for (int i = 0; i <sampleArr.length; i++) {
            if (sampleArr[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even count is: " + evenCount);
    }
}
