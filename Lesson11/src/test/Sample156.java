package test;

public class Sample156 {

  public static void main(String[] args) {
    Machine[] mc;
    mc = new Machine[2];

    mc[0] = new Boat(200, "yellow");
    mc[0].setSpeed(60);

    mc[1] = new SpaceShip(232);
    mc[1].setSpeed(500);

    for(int i=0; i<mc.length; i++){
      mc[i].show();
    }
  }
}


abstract class Machine {
  protected int speed;
  public void setSpeed(int s) {
    speed = s;
    System.out.println("set speed to :" + speed );
  }

  abstract void show();
}


class Boat extends Machine {
  private int seat;
  private String color;

  public Boat(int n, String g) {
    seat = n;
    color = g;
    System.out.println("Set seat to:" + seat + ", set color to:" + color);
  }

  public void show() {
    System.out.println("Seat:" + seat);
    System.out.println("Color:" + color);
    System.out.println("Speed:" + speed);
  }
}

class SpaceShip extends Machine {
  private int code;
  
  public SpaceShip(int f) {
    code = f;
    System.out.println("Set Code to:" + code);
  }
   
  public void show() {
    System.out.println("Code:" + code);
    System.out.println("Speed:" + speed);
  }
}
