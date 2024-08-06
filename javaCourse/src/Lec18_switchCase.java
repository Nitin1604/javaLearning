import java.util.Scanner;
public class Lec18_switchCase {
    public static void main(String[] args) {
        String var = "15";

        switch (var) {
            case "15" -> {
                System.out.println("You are going to become an Adult!");
            }
            case "21" -> System.out.println("You are going to join a Job!");
            case "60" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");


        int age;
        System.out.print("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("Your age is greater then 56");
        }
        else if(age>46){
            System.out.println("Your age is greater then 46");
        }
        else if(age>36){
            System.out.println("Your age is greater then 36");
        }
        else{
            System.out.println("You have enter you age less then above given age");
        }
        if(age>2){
            System.out.println("Your age is greater then 2");
        }
    }
}
