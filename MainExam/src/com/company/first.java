package com.company;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class first extends JFrame
{
    JFrame jf1= new JFrame();
    JTextField user =new JTextField("Enter Username");
    JPasswordField pass =new JPasswordField("password");

    first()
    {
        //Frame
        jf1.setTitle("O N L I N E   E X A M I N A T I O N");
        //jf1.setUndecorated(true);
        jf1.setBounds(0, 0, 800, 600);
        jf1.setVisible(true);
        jf1.setLayout(null);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.getContentPane().setBackground(Color.decode("#36454F"));


        //Login button
        JButton b = new JButton("LOGIN");
        jf1.add(b);
        b.setBounds(360,280,80,25);
        b.setBackground(Color.decode("#303030"));
        b.setBorderPainted(false);
        b.setForeground(Color.decode("#D3D3D3"));

        //progressbar
        JProgressBar pb = new JProgressBar();
        pb.setBounds(300,350,200,15);
        pb.setStringPainted(true);
        pb.setVisible(true);
        jf1.add(pb);



        //button function
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {


                int i = 0;
                try {
                    for(i=0;i<=100;i++)
                    {
                        Thread.sleep(20);
                        pb.setValue(i+10);
                        Thread.sleep(20);
                    }
                }
                catch (Exception e) {
                }


                String ps= pass.getText();
                String id =user.getText();
                if(id.equals("Enter Username")&&ps.equals("password") )
                    {
                    sec s = new sec();
                    }
                else
                    {
                    JOptionPane.showMessageDialog(jf1,"Login Failed!. Please retry");
                    }
            }
        });


        //Txtfields

        jf1.add(user);
        user.setBounds(300,200,200,20);
        //user.setBackground(Color.decode("#421C52"));
        user.setFont(new Font("Source code pro",Font.ITALIC,12));
        user.setBorder(BorderFactory.createEmptyBorder());


        jf1.add(pass);
        pass.setBounds(300,230,200,20);
      // pass.setBackground(Color.decode("#421C52"));
        pass.setFont(new Font("Source code pro",Font.ITALIC,12));
        pass.setBorder(BorderFactory.createEmptyBorder());


        //labels
        JLabel l1= new JLabel("Welcome to Online Examination.");
        l1.setFont(new Font("Source code pro",Font.PLAIN,25));
        l1.setForeground(Color.white);
        jf1.add(l1);
        l1.setBounds(180,130,600,40);


    }
}

