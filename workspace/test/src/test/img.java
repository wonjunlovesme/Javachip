package test;
import javax.swing.*;
import java.util.*;
import java.awt.*;

public class img extends JFrame{
	
	public img() {
		Container c = getContentPane();
		JPanel jp1 = new JPanel();
		ImageIcon img1 = new ImageIcon("mju.png");
		JLabel imgBox = new JLabel(img1);
		imgBox.setSize(50,50);
		jp1.add(imgBox);
		c.add(jp1);
		setSize(100, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new img();

	}

}
