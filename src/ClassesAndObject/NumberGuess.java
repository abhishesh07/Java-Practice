package ClassesAndObject;

import java.util.Random;
import java.util.Scanner;
class Game {
    private int number;
    private int noOfGuesses=0;
    private int userInput;
    Game(){
        Random r=new Random();
        number=r.nextInt(100)+1;
    }
    void takeuserInput(){
        Scanner sc=new Scanner((System.in));
        System.out.println("Guess the number: ");
        this.userInput=sc.nextInt();
    }
    boolean isCorrectGuess(){
        noOfGuesses++;
        if(number==userInput){
            System.out.println("Yay !! You guessed it..");
            System.out.println("Number of Guesses = "+noOfGuesses);
            return true;
        }
        else if(number<userInput)
            System.out.println("Too High...");
        else
            System.out.println("Too Low...");
        return false;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
}
public class NumberGuess{
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while(!b){
            g.takeuserInput();
            b=g.isCorrectGuess();
        }
    }

}
