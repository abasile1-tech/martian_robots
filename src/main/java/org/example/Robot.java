package main.java.org.example;

public class Robot {
  private String name;
  private int xPosition;
  private int yPosition;
  private char orientation;
  private String instructions;

  public Robot(String name, int xPosition, int yPosition, char orientation, String instructions) {
    this.name = name;
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.orientation = orientation;
    this.instructions = instructions;
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
