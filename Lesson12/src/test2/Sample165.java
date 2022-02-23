package test2;


public class Sample165 {

  public static void main(String[] args) {
    Boat boat1 = new Boat("Boat No.1");
    boat1.start();

    Boat boat2 = new Boat("Boat No.2");
    boat2.start();

    for(int i=0; i<15; i++){
       System.out.println("Processing main()");
    } 
  }

}


