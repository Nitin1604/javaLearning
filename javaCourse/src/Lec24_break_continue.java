public class Lec24_break_continue {
    public static void main(String[] args) {
        // Break and continue using loops!
        for (int i=0;i<5;i++){
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        int B=0;
        do{
            System.out.println(B);
            System.out.println("Java is great");
            if(B==2){
                System.out.println("Ending the loop");
                break;
            }
            B++;
        }while(B<5);
        System.out.println("Loop ends here");


            for(int C=0;C<10;C++){
            if(C==2){
                System.out.println("Ending the loop");
                continue;
            }
                System.out.println(C);
                System.out.println("Java is great");
        }
        int CD=0;
        do{
            CD++;
            if(CD==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(CD);
            System.out.println("Java is great");

        }while(CD<5);
        System.out.println("Loop ends here");
    }
}
