package ElectricityBillingSystem;

import java.awt.*;

import javax.swing.*;

public class Login extends JFrame{
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
        JButton login = new JButton("Login");
        login.setBounds(330,160,100,20);
        add(login);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(450,160,100,20);//330+100 = 430+20 =450 gap between signup and cancel = 20;
        add(cancel);
        JButton signup = new JButton("Signup");
        signup.setBounds(380,200,100,20);
        add(signup);

        //SIZE AND LOCATION OF THE WINDOW//
        setSize(640,300);
        setLocation(400,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}
