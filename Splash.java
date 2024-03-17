package ElectricityBillingSystem;


import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread t;
    Splash()
    {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon/elect.jpg"));//
        //imageicon class image ke frame er upor bosai
        // image ke computer theke load korar jonne baki function lage
        Image i2 = i1.getImage().getScaledInstance(730, 550, Image.SCALE_SMOOTH);//image window te fit hobe ar image class er object jlabel e use kora jai na
        //that's why it pass to the imageicon class again
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);//image object ke jlabel class e pathanor por jlabel er object add function pass korlei image window te dekha jabe
        add(image);//directly image object pass kora jai na tai jlabel class lagbe
        //setSize(730,550);//Set the size of the window length and width
        //setLocation(350,150);// Location of the window left 500 and top 200
        setVisible(true);// To visible the window 
        //frame slowly will larger
        int x=1;
        for(int i=2;i<600;i+=4,x+=1)
        {
            setSize(i+x,i);
            setLocation(700-((i+x)/2),400-(i/2));
            //sleep function use korle try catch use kora lagbe//
            try {
                Thread.sleep(10);//window ta slowly large hobe

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        t = new Thread(this);
        t.start();//ai start function internelly run function call kore//
        setVisible(true);
    }
    //window ta kicu time hold korar jonne ai function use kora hoi
    public void run(){
        try {
            Thread.sleep(7000);// 7 second por window vanish hoe jabe
            setVisible(false);
            
        } catch (Exception e) {
            System.out.println("Error in the run functipn \n");
        }
    }
    public static void main(String[] args) {
        new Splash();
    }

}
