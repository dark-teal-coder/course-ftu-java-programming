package test;

import javax.swing.JFrame;

public class Sample202 {

  public static void main(String[] args) {
    MyFormA myApp1 = new MyFormA();
    MyFormA myApp2 = new MyFormA();
    
    myApp2.setTitle("New Map");
    myApp2.setBounds(400,100,250,250);
    myApp2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }

}

class MyFormA extends JFrame {
  MyFormA() {
    super("MyApp 2015");
    setLocation(10, 10);
    setSize(440, 440);   
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}