import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Low number..enter higher number!");
        }
        else if(inputNumber>number){
            System.out.println("Higher number..enter lower number!");
        }
        return false;
    }

}
public class Lec50_guessingGame {
    public static void main(String[] args) {

        Game guessGame = new Game();
        boolean b= false;
        while(!b){
            guessGame.takeUserInput();
            b = guessGame.isCorrectNumber();
        }

    }
}
