package test4;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sample208 {

  public static void main(String[] args) {
    MyFormKey myApp1 = new MyFormKey();
  }

}

class MyFormKey extends JFrame implements KeyListener {
  ImageIcon icon1 = new ImageIcon("C:/demo.jpg");
  JLabel jlbl1 = new JLabel(icon1);
  int pos_x = 70, pos_y = 30;

  MyFormKey() {
    jlbl1.setBounds(pos_x, pos_y, 150, 160);
    add(jlbl1);

    addKeyListener(this);        
    setTitle("Picture Move");
    setLayout(null);
    setBounds(100, 100, 300, 250);
    setLocationRelativeTo(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }  

  public void keyPressed(KeyEvent e) {
    switch(e.getKeyCode()) {
    case KeyEvent.VK_UP:     
      pos_y -= 4;
      break;
    case KeyEvent.VK_DOWN:   
      pos_y += 4; 
      break;   
    case KeyEvent.VK_LEFT:   
      pos_x -= 4;
      break;  
    case KeyEvent.VK_RIGHT:  
      pos_x += 4;
      break;  
    case KeyEvent.VK_ENTER:  
      pos_x = 70;
      pos_y = 30;
      break;  

    case KeyEvent.VK_HOME:  
      pos_x = -14;
      break;  

    case KeyEvent.VK_END:  
      pos_x = 150;
      break;  

    }

    jlbl1.setLocation(pos_x, pos_y);
    setTitle("Picture Move [" + pos_x + "," + pos_y +"]");

  }

  public void keyTyped(KeyEvent e) {
    //
  }    
  public void keyReleased(KeyEvent e) {
    //
  }
}

