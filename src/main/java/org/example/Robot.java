package main.java.org.example;

import java.util.ArrayList;

public class Robot {
  private final String name;
  private int xPosition;
  private int yPosition;
  private char orientation;
  private final String instructions;
  public static ArrayList<Integer> xScents = new ArrayList<Integer>();
  public static ArrayList<Integer> yScents = new ArrayList<Integer>();

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

  public char getOrientation() {
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

  public String followInstructions() {
    for (int i = 0; i < this.instructions.length(); i++) {
      char c = this.instructions.charAt(i);
      if (c == 'R') {
        switch (getOrientation()) {
          case 'N':
            setOrientation('E');
            break;
          case 'E':
            setOrientation('S');
            break;
          case 'S':
            setOrientation('W');
            break;
          case 'W':
            setOrientation('N');
            break;
        }
      } else if (c == 'L') {
          switch (getOrientation()) {
              case 'N' -> setOrientation('W');
              case 'E' -> setOrientation('N');
              case 'S' -> setOrientation('E');
              case 'W' -> setOrientation('S');
          }
      } else if (c == 'F') {
        int newPosition;
        String lostString = " LOST";
        switch (getOrientation()) {
              case 'N' -> {
                  newPosition = getYPosition() + 1;
                  // System.out.println(newPosition);
                  if (!yScents.isEmpty() && newPosition == yScents.get(0)) {
                      System.out.println("hi");
                      break;
                  }
                  if (newPosition >= 4 || newPosition < 0) {
                      yScents.add(getYPosition());
                      return Integer.toString(getXPosition()) + " " + Integer.toString(getYPosition()) + " "
                              + Character.toString(getOrientation()) + lostString;
                  }
                  setYPosition(newPosition);
              }
              case 'E' -> {
                  newPosition = getXPosition() + 1;
                  // System.out.println(newPosition);
                  if (!xScents.isEmpty() && newPosition == xScents.get(0)) {
                      System.out.println("hi");
                      break;
                  }
                  if (newPosition >= 4 || newPosition < 0) {
                      xScents.add(getXPosition());
                      return Integer.toString(getXPosition()) + " " + Integer.toString(getYPosition()) + " "
                              + Character.toString(getOrientation()) + lostString;
                  }
                  setXPosition(newPosition);
              }
              case 'S' -> {
                  newPosition = getYPosition() - 1;
                  // System.out.println(newPosition);
                  if (!yScents.isEmpty() && newPosition == yScents.get(0)) {
                      System.out.println("hi");
                      break;
                  }
                  if (newPosition >= 4 || newPosition < 0) {
                      yScents.add(getYPosition());
                      return Integer.toString(getXPosition()) + " " + Integer.toString(getYPosition()) + " "
                              + Character.toString(getOrientation()) + lostString;
                  }
                  setYPosition(newPosition);
              }
              case 'W' -> {
                  newPosition = getXPosition() - 1;
                  // System.out.println(newPosition);
                  if (!xScents.isEmpty() && newPosition == xScents.get(0)) {
                      System.out.println("hi");
                      break;
                  }
                  if (newPosition >= 4 || newPosition < 0) {
                      xScents.add(getXPosition());
                      return Integer.toString(getXPosition()) + " " + Integer.toString(getYPosition()) + " "
                              + Character.toString(getOrientation()) + lostString;
                  }
                  setXPosition(newPosition);
              }
          }
      }
    }
    return Integer.toString(getXPosition()) + " " + Integer.toString(getYPosition()) + " "
        + Character.toString(getOrientation());
  }
}
