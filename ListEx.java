import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame{
    String [] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};

    ListEx(){
        setTitle("List make up Ex");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JList strList = new JList(fruits);
        c.add(strList);

        JList scrollList = new JList(fruits);
        c.add(new JScrollPane(scrollList));

        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args){
        new ListEx();
    }
}