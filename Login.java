package ElectricityBillingSystem;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JButton login,cancel,signup;
    Login()
    {
        super("LogIn Page");//window heading


        //I want to change the color of my window//
        //getcontentpane function puro window er access dei//
        getContentPane().setBackground(Color.WHITE);
        //backgorund color white kora hoilo//
        setLayout(null);//customize layout use korar jonne


        JLabel lblusername = new JLabel("User Name");
        lblusername.setBounds(300,20,100,20); //location ,size
        add(lblusername);

        // Adding Input field
        JTextField username = new JTextField();
        username.setBounds(400,20,150,20);//lblusername.x+ lblusername.size
        add(username);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(300,60,100,20);
        add(lblpassword);

        //adding input field
        JTextField password = new JTextField();
        password.setBounds(400,60,150,20);
        add(password);

        JLabel loginas= new JLabel("Log in as");
        loginas.setBounds(300,100,100,20);
        add(loginas);
        //Add choice field
        Choice logginin = new Choice();
        logginin.add("Admin");
        logginin.add("Customer");
        logginin.setBounds(400,100,150,20);
        add(logginin);

        //Button field
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon/login.png"));
        Image i2 = i1.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        login = new JButton("Login",new ImageIcon(i2));
        login.setBounds(330,160,100,20);
        login.addActionListener(this);
        add(login);

        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icon/icon/cancel.jpg"));
        Image i4= i3.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        cancel = new JButton("Cancel",new ImageIcon(i4));
        cancel.setBounds(450,160,100,20);//330+100 = 430+20 =450 gap between signup and cancel = 20;
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon/signup.png"));
        Image i6 = i5.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        signup = new JButton("Signup",new ImageIcon(i6));
        signup.setBounds(380,200,100,20);
        signup.addActionListener(this);
        add(signup);

        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/icon/second.jpg"));
        Image i8 = i7.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel img= new JLabel(i9);
        img.setBounds(0,0,250,250);
        add(img);

        //SIZE AND LOCATION OF THE WINDOW//
        setSize(640,300);
        setLocation(400,200);
        setVisible(true);
    }
    //login,cancel,signup
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==cancel)
      {
        setVisible(false);
      }
      else if (e.getSource()==signup){
        new Signup();
        setVisible(false);

      }
      else if(e.getSource()==login)
      {

      }

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    public static void main(String[] args) {
        new Login();
    }

    
}
