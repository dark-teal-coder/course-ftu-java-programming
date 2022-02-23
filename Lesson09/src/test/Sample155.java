package test;

public class Sample155 {

  public static void main(String[] args) {
    Boat[] boats;
    boats = new Boat[4];
    
    boats[0] = new Boat();
    boats[1] = new QuickBoat();
    boats[3] = new Boat();
    boats[2] = new QuickBoat();
   
    for ( int i=0; i < boats.length ; i++){
      System.out.println("boat[" + i + "] is '" + boats[i].getClass() + "' class.");
    }
  }
}

