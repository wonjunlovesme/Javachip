import javax.swing.*;
import java.util.*;
import java.awt.*;

public class 로그인 extends JFrame{
	
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JLabel adressLb;
	JLabel idLb;
	JLabel passwordLb;
	JTextField idTf;
	JPasswordField passwordPf;
	JButton loginBt;
	JButton singupBt;
	JButton findoutBt;
	
	public 로그인() {
		setTitle("Login");
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		panel1 = new JPanel();
		panel1.add(adressLb = new JLabel("환영합니다. 여기는 명지대 수강신청 홈페이지입니다!"));
		
		c.add(panel1, BorderLayout.NORTH);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.add(idLb = new JLabel("ID"));
		panel2.add(idTf = new JTextField());
		panel2.add(passwordLb = new JLabel("PW"));
		panel2.add(passwordPf = new JPasswordField());
		panel2.add(loginBt = new JButton("로그인"));
		
		idLb.setSize(100, 35);
		idLb.setLocation(50, 75);
		idTf.setSize(150, 35);
		idTf.setLocation(100, 75);
		passwordLb.setSize(100,35);
		passwordLb.setLocation(50, 175);
		passwordPf.setSize(150, 35);
		passwordPf.setLocation(100, 175);
		loginBt.setSize(100, 100);
		loginBt.setLocation(300, 90);
		
		
		c.add(panel2, BorderLayout.CENTER);
		
		panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		panel3.add(singupBt = new JButton("회원가입"));
		panel3.add(findoutBt = new JButton("ID/PW 찾기"));
		
		c.add(panel3, BorderLayout.SOUTH);
		
		setSize(450, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new 로그인();
	}

}