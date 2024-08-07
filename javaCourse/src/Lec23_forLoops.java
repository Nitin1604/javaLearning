public class Lec23_forLoops {
    public static void main(String[] args) {
        System.out.println("Printing the 10 numbers:-");
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("Printing the odd numbers:-");
        int n = 3;
        for (int i =0; i<n; i++){
            System.out.println(2*i+1);
        }

        // Chapter 5 Quick Quiz
        System.out.println("");
        for(int i=5; i!=0; i--){
            System.out.println(i);
        }
    }
}
