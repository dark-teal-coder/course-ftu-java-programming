package test2;

public class Sample164 {

  public static void main(String[] args) {
    Boat boat1 = new Boat("Boat No.1");
    boat1.start();

    for(int i=0; i<15; i++){
       System.out.println("Processing main()");
    } 
  }
}

class Boat extends Thread {
  private String name;

  public Boat(String message) {
    name = message;
  }
   
  public void run() {
    for(int i=0; i<15; i++){
      System.out.println("Processing" + name );
    }
  }
}