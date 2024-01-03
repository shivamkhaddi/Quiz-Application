import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LogIn extends JFrame implements ActionListener{
   JButton rules,back;
   JTextField tfname;
    LogIn(){
        getContentPane().setBackground(Color.WHITE);
        setLayout (null);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/login.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,500,400);
        add(image);

        JLabel heading= new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel name=new JLabel("Enter Name:");
        name.setBounds(810,150,300,20);
        name.setFont(new Font ("Mongolian Baiti", Font.BOLD,10));
        name.setForeground(new Color(30,144,254));
        add(name);

        rules =new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back =new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        tfname=new JTextField();
        tfname.setBounds(735,200,300,25);
        add(tfname);


        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
    }
   public static void main(String [] args){
        new LogIn();
   } 
}
