package test;

public class Sample146 {

  public static void main(String[] args) {
    Boat[] boats;
    boats = new Boat[3];

    for (int i=0; i<boats.length; i++){
      boats[i] = new Boat();
    }

    boats[0].setSeatColor(12, "Navy");
    boats[1].setSeatColor(24, "Red");
    boats[2].setSeatColor(18, "White");

//    for(int i=0; i< boats.length; i++){
//      boats[i].show();
//    }
    
    for (Boat x : boats){
      x.show();
    }

  }
}


