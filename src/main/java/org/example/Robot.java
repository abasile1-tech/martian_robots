package main.java.org.example;

public class Robot {
  private String name;
  private int xPosition = 0;
  private int yPosition = 0;
  private char orientation = 'N';

  public Robot(String name) {
    this.name = name;
  }

  public void printName() {
    System.out.println(this.name);
  }

  public int getXPosition() {
    return this.xPosition;
  }

  public int getYPosition() {
    return this.yPosition;
  }

  public int getOrientation() {
    return this.orientation;
  }

  public void setXPosition(int xPosition) {
    this.xPosition = xPosition;
  }

  public void setYPosition(int yPosition) {
    this.yPosition = yPosition;
  }

  public void setOrientation(char orientation) {
    this.orientation = orientation;
  }
}
