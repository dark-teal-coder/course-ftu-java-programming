package test;

public class QuickBoat extends Boat {
  private int model;
  
  public QuickBoat() {
    model = 0;
    System.out.println("quick boat created");
  }

  public QuickBoat(int seat, String color, int c) {
    super(seat, color);
    model = c;
    System.out.println("Model no:" + model);
  }
  
  public void setModel(int code) {
    model = code;
    System.out.println("Model no:" + model);
  }
  
  public void show() {
    super.show();
    System.out.println("Model no:" + model);
 }
  
}

