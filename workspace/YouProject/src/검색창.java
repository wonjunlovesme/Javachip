import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.*;
import java.awt.*;

public class �˻�â extends JFrame{
	
	JLabel searchAllLb2;
	JTextField searchAllTf2;
	JButton searchAllBt2;
	JList searchAllList2;
	JButton searchAllstorageBt2;
	LineBorder b1;
	
	public �˻�â() {
		setTitle("searchAll");
		
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(null);
		
		searchAllLb2 = new JLabel("��ü�˻�");
		searchAllTf2 = new JTextField();
		searchAllBt2 = new JButton("�˻�");
		searchAllList2 = new JList();
		searchAllstorageBt2 = new JButton("���");
		b1 = new LineBorder(new Color(000,000,204) ,2);
		
		c.add(searchAllLb2);
		c.add(searchAllTf2);
		c.add(searchAllBt2);
		c.add(new JScrollPane(searchAllList2));
		c.add(searchAllstorageBt2);
		
		searchAllLb2.setSize(100,30);
		searchAllLb2.setLocation(30,30);
		searchAllLb2.setFont(new Font("���ʷյ���",Font.PLAIN,14));
		searchAllTf2.setSize(230,30);
		searchAllTf2.setLocation(100,30);
		searchAllTf2.setFont(new Font("���ʷյ���",Font.PLAIN,15));
		searchAllBt2.setSize(100,30);
		searchAllBt2.setLocation(350,30);
		searchAllBt2.setBorder(b1);
		searchAllBt2.setBackground(Color.WHITE);
		searchAllBt2.setFont(new Font("���ʷյ���",Font.PLAIN,15));
		searchAllstorageBt2.setSize(100 ,50);
		searchAllstorageBt2.setLocation(350,500);
		searchAllstorageBt2.setBorder(b1);
		searchAllstorageBt2.setBackground(Color.WHITE);
		searchAllstorageBt2.setFont(new Font("���ʷյ���",Font.PLAIN,17));
		
		setSize(500, 650);
		setVisible(true);
		setResizable(false);
	}
	public static void main(String[] args) {
		new �˻�â();
	}

}