import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Rules extends JFrame implements ActionListener{

       String name;
       JButton start,back;


    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading= new JLabel("Welcome"+name+"to Simple Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,20));
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel rules= new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer, answer point to point" + "<br><br>" +
                "2. all the questions are compulsory" + "<br><br>" +
                "3. Every question has four options and select only one option." + "<br><br>" +
                
            "<html>"
        );
        add(rules);
        
        back =new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        start =new JButton("start");
        start.setBounds(400,500,100,30);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new quiz(name);
        }else{
            setVisible(false);
            new LogIn();
        }
    } 
    public static void main(String[] args){
       new Rules("User");
    }
}
