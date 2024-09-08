package interview.practiceQues;

public class stringIndex {
    static int getIndexByCharacter(String inputString, char charToBeFind) {
        for (int i = 0;i<inputString.length();i++){
            if(inputString.charAt(i)== charToBeFind){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

      System.out.println(getIndexByCharacter("Noida Sector Sixteen", 'i'));
     System.out.println(getIndexByCharacter("Jatin", 'i'));
        System.out.println(getIndexByCharacter("Nitin", 'n'));

    }
}
