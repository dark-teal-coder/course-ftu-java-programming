package test;

public class Sample157 {

  public static void main(String[] args) {
    Machine[] mc;
    mc = new Machine[2];

    mc[0] = new Boat(200, "yellow");
    mc[1] = new SpaceShip(232);

    for(int i=0; i<mc.length; i++){
      if(mc[i] instanceof Boat)
        System.out.println("Object [" + i + "] is Boat Class");
      else
        System.out.println("Object [" + i + "] is not Boat Class");
    }
  }
}
