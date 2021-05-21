import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
  static Scanner sc = new Scanner(System.in);
  static Random rand = new Random();
  static int secretNum = rand.nextInt(100);
  static int guessLimit = 5;

  public static void main(String[] args) {
    System.out.println(secretNum);
    greetUser();
  }

  public static void greetUser() {
    System.out.println("Welcome to Guess the Number!");
    getUserGuess();
  }

  public static void getUserGuess() {

    // String output = String.format("Pick a number from %d - %d", minusTen,
    // plusTen);
    // User is asked to guess a number 1-100. (Program chooses randomly.)
    while (guessLimit > 0) {
      System.out.println("Pick a number from 1 - 100");
      int userGuess = sc.nextInt();
      checkGuess(userGuess);
      guessLimit--;
    }
  }

  public static void checkGuess(int userGuess) {

    final int minusTen = secretNum - 10;
    final int plusTen = secretNum + 10;

    // getUserGuess();
    // If the guess is within 10 of the correct answer, plus or minus, output the
    // correct answer and exit.
    if (userGuess >= minusTen && userGuess <= plusTen) {
      String closeGuessMsg = String.format("The correct answer is %d", secretNum);
      System.out.println(closeGuessMsg);
      System.exit(0);
      // If the number is not within 10 of the correct answer, ask the user to keep
      // guessing.
    } else if (userGuess <= minusTen && userGuess >= plusTen) {

      System.out.println("tryagain");
      getUserGuess();

    } else if (guessLimit == 0) {
      String gameOver = String.format("Sorry, the correct answer is %d", secretNum);
      System.out.println(gameOver);
      System.exit(0);
    }

  }
}
