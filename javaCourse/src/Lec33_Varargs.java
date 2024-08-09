public class Lec33_Varargs {

    static int add(int ...arr){
        int result = 0;
        for (int a : arr){
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println("The sum of add(1,2) is: " + add(1,2));
        System.out.println("The sum of add(2,3,4) is: " + add(2,3,4));
        System.out.println("The sum of add(4,5,6) is: " + add(4,5,6));
    }
}
