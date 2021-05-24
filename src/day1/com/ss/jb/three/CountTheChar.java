package com.ss.jb.three;

import java.io.File;
import java.util.Scanner;

public class CountTheChar {
  /*
   * Assignment 3 Write a Java program that counts the number of times a
   * particular character, such as 'e', appears in a file. The character can be
   * specified at the command line. take in user input
   * 
   */
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Welcome to Count the Char!");
    System.out.println();
    /*
     * File class represents a single file or directory. File construtor accepts a
     * directory path as parameter and creates object that represents specified
     * directory .exists() comes from File class to confirm if the specified
     * directory path exists or not.
     */
    // ask user if they want to slect a file or use default file
    File fileToRead = getUserFile().exists() ? getUserFile() : new File("sample.txt");
    char charToCount = getUserChar();

    countCharInFile(fileToRead, charToCount);

  }

  private static File getUserFile() {

    return new File("test file");
  }

  private static char getUserChar() {
    System.out.println("Which character would you like me to count for you?");
    char userChar = sc.next().charAt(0);

    return userChar;
  }

  public static int countCharInFile(File f, char c) {
    System.out.println(f);
    System.out.println(c);
    return 1;
  }
}
