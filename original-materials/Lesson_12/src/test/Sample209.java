package test;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sample209 {

  public static void main(String[] args) {
    MyFormMouse myApp1 = new MyFormMouse();
  }

}

class MyFormMouse extends JFrame {
  ImageIcon icon1 = new ImageIcon("C:/demo.jpg");
  ImageIcon icon2 = new ImageIcon("C:/demo2.jpg");
  JLabel jlbl1 = new JLabel(icon1);
  int pos_x = 70, pos_y = 30;

  MyFormMouse() {
    jlbl1.addMouseListener(new ClblPic());
    jlbl1.setBounds(pos_x, pos_y, 150, 160);
    add(jlbl1);
                        
    setTitle("Change Picture");
    setLayout(null);
    setBounds(100,100,300,250);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }  
   
  class ClblPic extends MouseAdapter {
      public void mouseClicked(MouseEvent e){
        setTitle(e.getX()+","+e.getY());
        if (e.getX()<75)
          jlbl1.setIcon(icon2);
        else
          jlbl1.setIcon(icon1);
        
//        if (jlbl1.getIcon() == icon1) 
//          jlbl1.setIcon(icon2);
//        else
//          jlbl1.setIcon(icon1);
      }
  
//    public void mousePressed(MouseEvent e){
//      jlbl1.setIcon(icon2);
//    }
    
//    public void mouseReleased(MouseEvent e){
//      jlbl1.setIcon(icon1);
//    }
//    
//    public void mouseEntered(MouseEvent e){
//      jlbl1.setIcon(icon2);
//      
//    }
//    
//    public void mouseExited(MouseEvent e){
//      jlbl1.setIcon(icon1);
//    }
  } 
}

