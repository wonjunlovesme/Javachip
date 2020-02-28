import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
    public BorderLayoutEx(){
        setTitle("BorderLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();

        c.setLayout(new BorderLayout(30, 20));
        c.add(new JButton("Calculate"), BorderLayout.CENTER);
        c.add(new JButton("Mul"), BorderLayout.EAST);
        c.add(new JButton("Div"), BorderLayout.WEST);
        
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args){
        new BorderLayoutEx();
    }
}