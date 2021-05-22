package com.ss.jb.two;

public class Triangle implements Shape {

  int sideOne;
  int sideTwo;
  int sideThree;

  public Triangle(int x, int y, int z) {
    sideOne = (int) x;
    sideTwo = (int) y;
    sideThree = (int) z;
  }

  public static void main(String[] args) {
    Triangle triangle = new Triangle(7, 2, 9);
    triangle.display();
  }

  @Override
  public int calculateArea() {
    // add all sides then devide by 2 to get semi-perimeter
    int sp = (sideOne + sideTwo + sideThree) / 2;
    //
    int area = (int) Math.pow((sp * (sp - sideOne) * (sp - sideTwo) * (sp - sideThree)), 0.5);
    return area;
  }

  @Override
  public void display() {
    System.out.println(String.format("Triangle area: %d", this.calculateArea()));
  }

}
