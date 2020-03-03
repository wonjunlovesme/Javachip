import javax.swing.*;
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

    public 책가방(){
        setTitle("책가방");
        
        Container c = getContentPane();
        
        JSplitPane js1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        js1.setLeftComponent(panel1 = new JPanel(new FlowLayout()));
        js1.setDividerLocation(850);
        storageLb = new JLabel("담기");
        storageList = new JList();
        completeLb = new JLabel("수강신청 과목");
        completeList = new JList();    
        panel1.add(storageLb);
        panel1.add(storageList);
        panel1.add(completeLb);
        panel1.add(completeList);
        js1.setRightComponent(panel2 = new JPanel());
        panel2.setLayout(null);
        searchCategoryBt = new JButton("카테고리");
        searchAllBt = new JButton("검색");
        deleteBt = new JButton("삭제");
        panel2.add(searchCategoryBt);
        panel2.add(searchAllBt);
        panel2.add(deleteBt);
        
        searchAllBt.setSize(100, 100);
        searchAllBt.setLocation(10, 50);
        
        searchCategoryBt.setSize(100,100);
        searchCategoryBt.setLocation(10,200);
        
        deleteBt.setSize(100, 50);
        deleteBt.setLocation(10, 800);
        c.add(js1);

        setSize(1000, 1000);
        setVisible(true);
    }
    
    public static void main(String[] args) {
    	new 책가방();
    }
}