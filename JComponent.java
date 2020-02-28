import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JComponent extends JFrame{
    JComponent(){
    super("JComponent의 공통 메소드 예제");
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    JButton jb1 = new JButton("Magenta/Yellow Button");
    JButton jb2 = new JButton("Disabled Button");
    JButton jb3 = new JButton("getX(), getY()");
    jb1.setBackground(Color.YELLOW);
    jb1.setForeground(Color.MAGENTA);
    jb1.setFont(new Font("Arial", Font.ITALIC, 20));
    jb2.setEnabled(false);
    jb3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            JButton jb = (JButton)e.getSource();
            setTitle(jb.getX() + "," + jb.getY());
            }
        });
    c.add(jb1);
    c.add(jb2);
    c.add(jb3);
    setSize(260, 200);
    setVisible(true);
    }
    
    public static void main(String[] args){
        new JComponent();
    }
}