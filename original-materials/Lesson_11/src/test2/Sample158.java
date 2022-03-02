package test2;

public class Sample158 {

  public static void main(String[] args) {
    iMachine[] imc;
    imc = new iMachine[2];

    imc[0] = new Boat(200, "yellow");
    imc[1] = new SpaceShip(232);

    for(int i=0; i<imc.length; i++){
      imc[i].show();
    }
  }
}
