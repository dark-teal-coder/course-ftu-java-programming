package test2;

import javax.swing.JFrame;

public class Sample201 {

  public static void main(String[] args) {
    JFrame myApp = new JFrame();
    JFrame myApp2 = new JFrame("New Wave 1048");
    
    myApp.setTitle("My App 2015");
    myApp.setLocation(250, 50);
    myApp.setSize(440, 440);   
    myApp.setVisible(true);
    myApp.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    
    myApp2.setBounds(50, 150, 440, 440);   
    myApp2.setVisible(true);
  }

}
