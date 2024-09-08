package interview.practiceQues;


public class detectingEvenOddMethods {
    public static boolean evenNumber(int num){
        return num % 2 == 0;
    }


    public static void main(String[] args) {
       int numInput = 1000;
       int evenNum = 0;
       int oddNum = 0;

       for(int i = 1; i<=numInput;i++){
           if (evenNumber(i)){
               evenNum++;
           }
          else {
              oddNum++;
           }
       }
        System.out.println("Even is: " + evenNum + " and Odd is: " + oddNum);

    }

}
