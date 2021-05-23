package com.ss.jb.two;

import java.util.Scanner;

public class SumOfInput {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Welcome to to Sum Machine!");
    System.out.println();
    System.out.println("Give me three numbers and I'll give you the sum!");

    getUserInput();
  }

  public static void getUserInput() {
    int addendOne = sc.nextInt();
    System.out.println(addendOne + " + ...");
    int addendTwo = sc.nextInt();
    System.out.println(addendOne + " + " + addendTwo + " + ...");
    int addendThree = sc.nextInt();
    System.out.println(addendOne + " + " + addendTwo + " + " + addendThree + "...");
    calcSum(addendOne, addendTwo, addendThree);
  }

  public static void calcSum(int first, int second, int third) {
    int sum = first + second + third;
    System.out.println(sum);
  }
}
