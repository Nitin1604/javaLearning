import org.w3c.dom.ls.LSOutput;

public class Lec32_methodOverloading {

    static void greeting(){
        System.out.println("Passing no parameters:-");
        System.out.println("Good Morning Sir!");
        System.out.println();
    }

    static void greeting(String a){
        System.out.println("Passing one parameters:-");
        System.out.println("Good morning " + a + " bro!");
        System.out.println();
    }

    static void greeting(String a, String b){
        System.out.println("Passing two parameters:-");
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
        System.out.println();
    }

    static void greeting(String a, String b, String c){
        System.out.println("Passing three parameters:-");
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
        System.out.println();
    }

    static void change(int a){
        System.out.println("Intiliazing value of a:-");
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
        System.out.println();
    }
    static void tellJoke(){
        System.out.println("Printing Joke:-");
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
        System.out.println();
    }

    public static void main(String[] args) {
         tellJoke();

        // Case 1: Changing the Integer
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is: " + x);
        System.out.println();

        // Case 1: Changing the Array
        System.out.println("Initializing Array:-");
         int [] marks = {52, 73, 77, 89, 98, 94};
         change2(marks);
         System.out.println("The value of x after running change is: " + marks[0]);
        System.out.println();


        // Method Overloading
        greeting();
        greeting("Nitin");
        greeting("Nitin", "Kunal");
        // Arguments are actual!

    }
}
