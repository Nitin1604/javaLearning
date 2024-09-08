package interview.practiceQues;

public class sampleArr2 {
    public static void main(String[] args) {
        int[] sampleArr = {7, 3, 5, 4, 8, 9, 88, 21, 71};
        int count = 0;

        for (int i = 0; i <sampleArr.length-1 ; i++) {
            if ((sampleArr[i] + sampleArr[i + 1]) % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of even pairs are: " + count);
    }
}
