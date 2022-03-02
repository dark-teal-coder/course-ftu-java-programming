package test;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Sample212 extends Applet {

  public void paint(Graphics g) {
     g.drawLine(10, 10, 110, 110);
     
     g.setColor(Color.red);
     g.drawArc(10,10,50,50,0,90);
     
     g.setColor(Color.green);
     g.drawRect(10, 10, 50, 50);
     
     g.setColor(Color.blue);
     g.drawOval(10, 10, 100, 100);
     g.fillOval(10, 120, 100, 50);
     
     g.setColor(Color.orange);
     int[] xx = {15,60,10};
     int[] yy = {20,80,100};
     g.drawPolygon( xx,yy,3);
     
     g.setColor(Color.cyan);
     g.setFont(new Font("Tahoma",Font.BOLD,18));
     g.drawString("Welcome to Java Applet!", 10, 150);
  }

}
