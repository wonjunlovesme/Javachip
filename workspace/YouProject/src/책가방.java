import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.*;

class 책가방 extends JFrame{
    JPanel panel1;
    JPanel panel2;

    JLabel storageLb;
    JLabel completeLb;

    JList storageList;
    JList completeList;

    JButton searchCategoryBt;
    JButton searchAllBt;
    JButton deleteBt;
    
    LineBorder b1;
    LineBorder b2;
    LineBorder b3;

    public 책가방(){
        setTitle("책가방");
        
        Container c = getContentPane();
        
        b1 = new LineBorder(Color.GREEN,2);
        b2 = new LineBorder(Color.RED,2);
        b3 = new LineBorder(Color.BLUE,1);
        
        
        JSplitPane js1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        js1.setLeftComponent(panel1 = new JPanel(new FlowLayout()));//borderlayout
        js1.setResizeWeight(0.80);
        storageLb = new JLabel("담기");
        storageList = new JList();
        completeLb = new JLabel("수강신청 과목");
        completeList = new JList();    
        panel1.add(storageLb);
        panel1.add(storageList);
        panel1.add(completeLb);
        panel1.add(completeList);
        panel1.setBackground(Color.WHITE);
        js1.setRightComponent(panel2 = new JPanel());
        panel2.setLayout(null);
        searchCategoryBt = new JButton("카테고리");
        searchAllBt = new JButton("검색");
        deleteBt = new JButton("삭제");
        panel2.add(searchCategoryBt);
        panel2.add(searchAllBt);
        panel2.add(deleteBt);
        panel2.setBackground(Color.WHITE);
        
        searchAllBt.setSize(120, 80);
        searchAllBt.setLocation(30, 50);
        searchAllBt.setBorder(b1);
        searchAllBt.setBackground(Color.WHITE);
        
        searchCategoryBt.setSize(120, 80);
        searchCategoryBt.setLocation(30, 175);
        searchCategoryBt.setBorder(b1);
        searchCategoryBt.setBackground(Color.WHITE);
        
        deleteBt.setSize(120, 50);
        deleteBt.setLocation(30, 300);
        deleteBt.setBorder(b2);
        deleteBt.setBackground(Color.WHITE);
        c.add(js1);

        setSize(1000, 800);
        setVisible(true);
        js1.setDividerSize(2);
        setResizable(false);
    }
    
    public static void main(String[] args) {
    	new 책가방();
    }
}