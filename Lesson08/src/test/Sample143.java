package test;

public class Sample143 {

  public static void main(String[] args) {
    Boat.showTotal();    
    
    Boat boat1 = new Boat();
    boat1.setSeatColor(16, "orange");

    Boat.showTotal();    

    Boat boat2 = new Boat();
    boat2.setSeatColor(48, "green");
   
    Boat.showTotal();
    
    Sample139.main(null);
    Sample140.main(null);
    
    Boat.showTotal();
  }
}
