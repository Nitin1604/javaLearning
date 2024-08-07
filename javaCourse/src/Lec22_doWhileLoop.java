public class Lec22_doWhileLoop {
    public static void main(String[] args) {
            System.out.println("While Loop: ");
        int a = 0;
        while(a<5){
            System.out.println(a);
              a++;
            }
        int b = 10;
        do {
            System.out.println("Do while loop output start here");
            System.out.println(b);
            System.out.println("Do while loop output ends here");
            b++;
        }while(b<5);

        int c = 1;
        do{
            System.out.println(c);
            c++;
        }while(c<=10);
    }
}
