package test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Sample203 {

  public static void main(String[] args) {
    JFrame myApp = new JFrame();

    myApp.setTitle("My App 2015");
    myApp.setSize(440, 220);   
    myApp.setLocationRelativeTo(null);
    myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myApp.setLayout(null);

    JLabel jlbl1 = new JLabel("Input Inch:", JLabel.RIGHT);
    jlbl1.setBounds(20,20,80,20);
    myApp.add(jlbl1);

    JLabel jlbl2 = new JLabel("Output cm:", JLabel.RIGHT);
    jlbl2.setBounds(20,60,80,20);
    myApp.add(jlbl2);
    
    JTextField jtxt1 = new JTextField("10");
    jtxt1.setBounds(110, 20, 100, 20);
    myApp.add(jtxt1);
    
    JTextField jtxt2 = new JTextField();
    jtxt2.setBounds(110, 60, 100, 20);
    jtxt2.setEditable(false);
    myApp.add(jtxt2);
    
    JButton jbtn1 = new JButton("Calc");
    jbtn1.setBounds(20, 120, 80, 30);
    myApp.add(jbtn1);
    
    JButton jbtn2 = new JButton("Clear");
    jbtn2.setBounds(110, 120, 80, 30);
    myApp.add(jbtn2);
    
    myApp.setVisible(true);
  }

}
