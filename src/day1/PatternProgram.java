
public class PatternProgram {
  public static void main(String[] args) {
    printPatternOne();

  }

  public static void printPatternOne() {

    System.out.println("1)");
    for (int i = 0; i < 4; i++) {
      printStar(i);
      System.out.println();
    }

  }

  public static void printStar(int stars) {
    for (int i = 0; i < stars; i++) {
      System.out.print("*");
    }
  }

}