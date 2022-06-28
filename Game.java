
package com.codewithchetan;
import java.util.*;
public class Game {
    public int num;
    public int n;
   public int noOfGuesses = 0;
    public Game() {
        Random rand = new Random();
        this.num = rand.nextInt(100);
        //this.num=new Random().nextInt(100); it can also be used
    }
    public void takeUserInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the Number:");
        n= scan.nextInt();
    }
    public void isCorrectNumber() {
        noOfGuesses++;
        if (n == num){
            System.out.format("Your Guess is correct.You have guessed in %d attempts",noOfGuesses);
            System.exit(0);
        }
        else if (n<num)
            System.out.println("Too low...");
        else if (n>num)
            System.out.println("Too High...");
    }
    public static void main(String[] args) {
        Game obj = new Game();
            while (true) {
                obj.takeUserInput();
                obj.isCorrectNumber();
            }
    }
}
