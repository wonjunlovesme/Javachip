import javax.swing.*;
import java.util.*;
import java.awt.*;

public class 검색창 extends JFrame{
	
	JLabel searchAllLb2;
	JTextField searchAllTf2;
	JButton searchAllBt2;
	JList searchAllList2;
	JButton searchAllstorageBt2;
	
	public 검색창() {
		setTitle("searchAll");
		
		Container c = getContentPane();
		c.setLayout(null);
		
		searchAllLb2 = new JLabel("전체검색");
		searchAllTf2 = new JTextField();
		searchAllBt2 = new JButton("검색");
		searchAllList2 = new JList();
		searchAllstorageBt2 = new JButton("담기");
		
		c.add(searchAllLb2);
		c.add(searchAllTf2);
		c.add(searchAllBt2);
		c.add(searchAllList2);
		c.add(searchAllstorageBt2);
		
		searchAllLb2.setSize(150,20);
		searchAllLb2.setLocation(20,20);
		searchAllTf2.setSize(200,20);
		searchAllTf2.setLocation(120,20);
		searchAllBt2.setSize(100,20);
		searchAllBt2.setLocation(350,20);
		searchAllstorageBt2.setSize(100 ,50);
		searchAllstorageBt2.setLocation(350,500);
		
		setSize(500, 650);
		setVisible(true);
	}
	public static void main(String[] args) {
		new 검색창();
	}

}