package test2;

public class SpaceShip implements iMachine {
  private int code;
  
  public SpaceShip(int f) {
    code = f;
    System.out.println("Set Code to:" + code);
  }
   
  public void show() {
    System.out.println("Code:" + code);
  }
}
