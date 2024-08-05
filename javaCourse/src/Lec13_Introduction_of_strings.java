import java.util.Scanner;
public class Lec13_Introduction_of_strings {
    public static void main(String[] args) {
         String name = new String("Nitin");
         String Name = "Nitin";
         System.out.println("The name is: " + name + " and is written with new keyword");
         System.out.println("The name is: " + Name + " and is not written with new keyword");
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        System.out.println();
        System.out.format("The value of a is %d and value of b is %f", a, b);
        System.out.println();
        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        System.out.println(st);
        String st1 = sc.nextLine();
        System.out.println(st1);
    }
}
