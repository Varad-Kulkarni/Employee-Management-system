import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class View_Employee implements ActionListener{

    JFrame f;
    JTextField t;
    JLabel l1,l2;
    JButton b,b2;

    View_Employee(){
        f=new JFrame("View");
        f.getContentPane().setBackground(Color.DARK_GRAY);
        f.setLayout(null);

        l1=new JLabel();
        l1.setBounds(0,0,500,270);
        l1.setLayout(null);
//        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/view.jpg"));
//        l1.setIcon(img);


        l2=new JLabel("Employee Id");
        l2.setVisible(true);
        l2.setBounds(40,60,250,30);
        l2.setForeground(Color.white);
        Font F1 = new Font("serif",Font.BOLD,30);
        l2.setFont(F1); 
        l1.add(l2);
        f.add(l1);


        t=new JTextField();
        t.setBounds(240,60,220,30);
        f.add(t);

        b=new JButton("Search");
        b.setBackground(new Color(51,153,255));
        b.setForeground(Color.black);
        b.setBounds(240,150,100,30);
        b.addActionListener(this);
        f.add(b);

        b2=new JButton("Cancel");
        b2.setBackground(new Color(255,102,102));
        b2.setForeground(Color.black);
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        f.add(b2);

        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b2){
            f.setVisible(false);
            new Details();
        }
        if(ae.getSource()==b){
            f.setVisible(false);
            new Print_Data(t.getText());
        }

    }

    public static void main(String[]ar){
        new View_Employee();
    }
}