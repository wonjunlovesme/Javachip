import javax.swing.*;

public class MyFrame extends JFrame{
    public MyFrame(){
        setTitle("300*300 swing Frame");
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
    }
}