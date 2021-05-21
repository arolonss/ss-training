import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    greetUser();
  }

  public static void greetUser() {
    System.out.println("Welcome to Guess the Number!");
    Random rand = new Random();
    int secretNum = rand.nextInt(100);
    int minusTen = secretNum - 10;
    int plusTen = secretNum + 10;
    // String output = String.format("Pick a number from %d - %d", minusTen,
    // plusTen);
    System.out.println("Pick a number from 1 - 100");
    int userGuess = sc.nextInt();
    System.out.println(userGuess);
    System.out.println(secretNum);
    System.out.println(minusTen);
    System.out.println(plusTen);
    // Range secretNumRange = new Range(minusTen, plusTen);
    int guessLimit = 0;
    while (userGuess != secretNum && guessLimit < 5) {
      if (userGuess >= plusTen && userGuess <= minusTen) {
        String closeGuessMsg = String.format("The correct answer is %d", secretNum);
        System.out.println(closeGuessMsg);
      } else {
        System.out.println(secretNum);
      }
      guessLimit++;
    }
  }
}
