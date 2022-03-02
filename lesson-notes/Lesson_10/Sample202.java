package test;

import javax.swing.JFrame;

public class Sample202 {

  public static void main(String[] args) {
    MyForm myApp1 = new MyForm();
    MyForm myApp2 = new MyForm();
    
    myApp2.setTitle("New Map");
    myApp2.setBounds(400,100,250,250);
    myApp2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }

}

class MyForm extends JFrame {
  MyForm() {
    super("MyApp 2015");
    setLocation(10, 10);
    setSize(440, 440);   
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}