package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sec
{
    JFrame jf2;

    public   sec()
    {   //frame

        JFrame jf2= new JFrame();
        jf2.setTitle("O N L I N E   E X A M I N A T I O N");
        jf2.setVisible(true);
        jf2.setBounds(0, 0, 800, 600);
        jf2.setVisible(true);
        jf2.setLayout(null);
        jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf2.getContentPane().setBackground(Color.decode("#36454F"));
        JOptionPane op =new JOptionPane();
        op.showMessageDialog(jf2,"Login Success!!");


        //label
        JLabel l2= new JLabel("Choose your exam.");
        l2.setFont(new Font("Source code pro",Font.PLAIN,25));
        l2.setForeground(Color.decode("#D3D3D3"));
        jf2.add(l2);
        l2.setBounds(120,100,600,40);

        //list or radio button
        JRadioButton jr1= new JRadioButton("JEE");
        jr1.setBounds(420,140,50,15);
        JRadioButton jr2= new JRadioButton("NDA");
        jr2.setBounds(420,170,50,15);
        JRadioButton jr3= new JRadioButton("SAT");
        jr3.setBounds(420,200,50,15);
        jf2.add(jr1);
        jf2.add(jr2);
        jf2.add(jr3);
        jr1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
              jee j = new jee();
                     j.jee1();

            }
        });

        jr2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                new ndaselect();

            }
        });

        jr3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                new satselect();

            }
        });







    }

}
