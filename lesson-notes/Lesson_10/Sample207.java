package test2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Sample207 {

  public static void main(String[] args) {
    MyForm myApp1 = new MyForm();
  }
  
}

class MyForm extends JFrame implements ActionListener {
  JLabel jlbl1 = new JLabel("Input Inch:");
  JLabel jlbl2 = new JLabel("Output CM:");
  JTextField jtxt1 = new JTextField("10");
  JTextField jtxt2 = new JTextField();
  JButton jbtn1 = new JButton("Calc");
  JButton jbtn2 = new JButton("Clear");

  MyForm() {
    super("My App 2015 Calc v1.0");
    
    setLocation(50, 50);
    setSize(440, 240);   
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    
    jlbl1.setBounds(20, 20, 100, 20);
    add(jlbl1);
    jlbl2.setBounds(20, 60, 100, 20);
    add(jlbl2);
    jtxt1.setBounds(90, 20, 100, 20);
    add(jtxt1);
    jtxt2.setBounds(90, 60, 100, 20);
    jtxt2.setEditable(false);
    add(jtxt2);  
    jbtn1.setBounds(20,120,80,30);
    add(jbtn1);
    jbtn2.setBounds(110,120,80,30);
    add(jbtn2);
    
    jtxt1.addActionListener(this);
    jbtn1.addActionListener(this);
    jbtn2.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == jbtn1 || e.getSource() == jtxt1) {
      double answer = Double.parseDouble(jtxt1.getText()) * 2.54;
      String answerS = String.valueOf(answer);
      
      jtxt2.setText(answerS);         
    }
    if (e.getSource() == jbtn2) {
      jtxt1.setText("10");
      jtxt2.setText(""); 
    }
  }

}  


