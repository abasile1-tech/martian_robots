package main.java.org.example;

public class Main {
  public static void main(String[] args) {
    System.out.print("Hello and welcome!\n");
    Robot c3po = new Robot("C-3PO", 1, 1, 'E', "RFRFRFRF");
    Robot r2d2 = new Robot("R2-D2", 3, 3, 'N', "FRRFLLFFRRFLL");
    Robot hk47 = new Robot("HK-47", 0, 3, 'W', "LLFFFLFLFL");
    c3po.printName();
    System.out.print(c3po.followInstructions());
    System.out.print("\n");
    r2d2.printName();
    System.out.print(r2d2.followInstructions());
    System.out.print("\n");
    hk47.printName();
    System.out.print(hk47.followInstructions());
  }
}