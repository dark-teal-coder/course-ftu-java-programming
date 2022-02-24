package test;

public class Sample152 {

  public static void main(String[] args) {
    Boat[] boats;
    boats = new Boat[2];
    
    boats[0] = new Boat();
    boats[0].setSeatColor(50,"Green");

    boats[1] = new QuickBoat();
    boats[1].setSeatColor(44,"Yellow");
   
    for ( int i=0; i < boats.length ; i++){
      boats[i].show();
    }
    
  }
}

