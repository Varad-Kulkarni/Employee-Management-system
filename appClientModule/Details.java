import java.awt.*;
import javax.swing.*;


public class Details{
	JFrame f;
    JLabel l2;
    JButton b1,b2,b3,b4;
	
	Details(){
		f=new JFrame();
		f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(450,200);
        f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		
		l2 = new JLabel("Employee Details");
		l2.setForeground(new Color(255,204,51));
        l2.setBounds(430,20,200,40);
//        l2.setFont(new Font("serif",Font.BOLD,25));
        f.add(l2);

        b1=new JButton("Add");
        b1.setBackground(Color.green);
        b1.setForeground(Color.black);
        b1.setBounds(420,80,100,40);
//        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(ae11 ->{
        	f.setVisible(false);
        	new Add_Employee();
        });
        f.add(b1);


        b2=new JButton("View");
        b2.setBounds(530,80,100,40);
        b2.setBackground(new Color(51,153,255));
        b2.setForeground(Color.black);
//        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(ae12 ->{
        	f.setVisible(false);
        	new View_Employee();
        });
        f.add(b2);

        b3=new JButton("Remove");
        b3.setBounds(420,140,100,40);
        b3.setBackground(new Color(255,102,102));
        b3.setForeground(Color.black);
//        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(ae13 ->{
        	f.setVisible(false);
        	new Remove_Employee();
        });
        f.add(b3);

        b4=new JButton("Update");
        b4.setBounds(530,140,100,40);
        b4.setBackground(new Color(255,255,153));
        b4.setForeground(Color.black);
//        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.addActionListener(ae14 ->{
        	f.setVisible(false);
        	new Search_Employee();
        });
        f.add(b4);

    }
	
	public static void main(String args[]) {
		new Details();
	}
}
