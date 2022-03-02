package test;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Sample213 extends Applet implements MouseListener {
  int x = 10;
  int y = 10;

  public void init() {
     addMouseListener(this);
  }

  public void mouseClicked(MouseEvent e) {
    Graphics g = getGraphics();
    
    g.setColor(Color.blue);
    g.drawOval(x-25, y-25, 50, 50);
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
    repaint();
  }

  public void mousePressed(MouseEvent e) {
      x = e.getX();
      y = e.getY();
      //repaint();
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void paint(Graphics g) {
     g.fillOval(x, y, 10, 10);
  }
  
}
