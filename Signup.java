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
        panel.setBackground(Color.white);
        add(panel);
        panel.setLayout(null);

        setVisible(true);


    }
    public static void main(String[] args) {
        new Signup();
    }
}
