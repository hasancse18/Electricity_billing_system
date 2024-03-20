package ElectricityBillingSystem;
import javax.swing.*;
import javax.swing.border.*;


import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Signup extends JFrame implements ActionListener{
    JButton create,back;
    Choice accountType;
    JTextField meter, username,name,pass;
    Signup()
    {
        //new Conn();
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

        accountType = new Choice();
        accountType.add("Customer");
        accountType.add("Admin");
        accountType.setBounds(260,50,150,20);
        panel.add(accountType);

        JLabel lblmeter= new JLabel("Meter Number");
        lblmeter.setBounds(100,90,140,20);
        lblmeter.setForeground(Color.GRAY);
        lblmeter.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(lblmeter);

        meter = new JTextField();
        meter.setBounds(260,90,150,20);
        panel.add(meter);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(100,130,140,20);
        lblusername.setForeground(Color.GRAY);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(lblusername);

        username = new JTextField();
        username.setBounds(260,130,150,20);
        panel.add(username);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(100,170,140,20);
        lblname.setForeground(Color.GRAY);
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(lblname);

        name = new JTextField();
        name.setBounds(260,170,150,20);
        panel.add(name);


        JLabel lblpass= new JLabel("Password");
        lblpass.setBounds(100,210,140,20);
        lblpass.setForeground(Color.GRAY);
        lblpass.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(lblpass);
        

        pass = new JTextField();
        pass.setBounds(260,210,150,20);
        panel.add(pass);
        
        //Create Button
        create= new JButton("Create");
        create.setBackground(Color.BLACK);
        create.setForeground(Color.WHITE);
        create.setBounds(130,260,120,25);
        create.addActionListener(this);
        panel.add(create);
        
        
        //Back Button
        back = new JButton("Back");
        back.setBounds(290,260,120,25);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        panel.add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon/signupImage.png"));
        //ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon/elect.jpg"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(410,30,250,250);
        panel.add(image);
        
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back)
        {
            new Login();
            setVisible(false);
        }
        else if(e.getSource()==create)
        {
            
            String atype = (String) accountType.getSelectedItem();
            String susername = username.getText();
            String sname = name.getText();
            String spassword = pass.getText();
            String smeter = meter.getText();

            try {
                Conn c = new Conn();
                String query = "insert into login values('"+smeter+"', '"+susername+"', '"+sname+"', '"+spassword+"', '"+atype+"')";
                c.s.executeUpdate(query);        
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                new Login();
                setVisible(false);
            } catch (Exception eb) {
                eb.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        new Signup();
    }
    
}
