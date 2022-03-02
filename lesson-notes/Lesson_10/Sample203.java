package test;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Sample203 {

	public static void main(String[] args) {
		JFrame myApp = new JFrame();

		myApp.setTitle("My App 2015");
		myApp.setLocation(50, 50);
		myApp.setSize(440, 440);   
		myApp.setVisible(true);
		myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myApp.setLayout(null);

		JLabel jlbl1 = new JLabel("Input Inch:");
		jlbl1.setBounds(20,20,80,20);
		myApp.add(jlbl1);

		JLabel jlbl2 = new JLabel("Output cm:");
		jlbl2.setBounds(20,60,80,20);
		myApp.add(jlbl2);
		

	}

}
