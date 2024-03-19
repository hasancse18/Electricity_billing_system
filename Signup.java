package ElectricityBillingSystem;
import javax.swing.*;
import javax.swing.border.*;


import java.awt.*;
public class Signup extends JFrame{
    Signup()
    {
        //create window
        setBounds(400,200,700,400);//left,top,length,width
        getContentPane().setBackground(Color.white);
        setLayout(null);
        

        //create Jpanel

        JPanel panel = new JPanel();
        panel.setBounds(30,30,650,300);
        
        panel.setBorder(new TitledBorder(new LineBorder(new Color(173,216,230),2),"Create Account",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(173,216,230)));
        panel.setLayout(null);
        panel.setBackground(Color.white);
        panel.setForeground(new Color(34,139,34));
        add(panel);


        JLabel heading = new JLabel("Create Account");
        heading.setBounds(100,50,140,20);
        heading.setForeground(Color.GRAY);
        heading.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(heading);

        Choice accountType = new Choice();
        accountType.add("Customer");
        accountType.add("Admin");
        accountType.setBounds(260,50,150,20);
        panel.add(accountType);

        JLabel lblmeter= new JLabel("Meter Number");
        lblmeter.setBounds(100,90,140,20);
        lblmeter.setForeground(Color.GRAY);
        lblmeter.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(lblmeter);

        JTextField meter = new JTextField();
        meter.setBounds(260,90,150,20);
        panel.add(meter);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(100,130,140,20);
        lblusername.setForeground(Color.GRAY);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(lblusername);

        JTextField username = new JTextField();
        username.setBounds(260,130,150,20);
        panel.add(username);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(100,170,140,20);
        lblname.setForeground(Color.GRAY);
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(lblname);

        JTextField name = new JTextField();
        name.setBounds(260,170,150,20);
        panel.add(name);


        JLabel lblpass= new JLabel("Password");
        lblpass.setBounds(100,210,140,20);
        lblpass.setForeground(Color.GRAY);
        lblpass.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(lblpass);
        

        JTextField pass = new JTextField();
        pass.setBounds(260,210,150,20);
        panel.add(pass);
        
        //Create Button
        JButton create= new JButton("Create");
        create.setBackground(Color.BLACK);
        create.setForeground(Color.WHITE);
        create.setBounds(130,260,120,25);
        panel.add(create);
        
        //Back Button
        JButton back = new JButton("Back");
        back.setBounds(290,260,120,25);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        panel.add(back);
        
        
        setVisible(true);


    }
    public static void main(String[] args) {
        new Signup();
    }
}
