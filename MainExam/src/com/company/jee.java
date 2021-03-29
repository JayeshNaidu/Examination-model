package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jee {
   public static String[] ans = new String[3];
    public JFrame jf3 = new JFrame();
    public JPanel p1 = new JPanel();


    public  void  jee1()
    {

        //frame

        p1.setVisible(true);
        p1.setBounds(40, 30, 700, 500);
        jf3.setTitle("O N L I N E   E X A M I N A T I O N");
        jf3.setVisible(true);
        jf3.setBounds(0, 0, 800, 600);
        jf3.setVisible(true);
        jf3.setLayout(null);
        jf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf3.getContentPane().setBackground(Color.decode("#36454F"));

        //questions

        JLabel l = new JLabel("QUESTION NO.1");
        String s = "Two numbers are chosen from 1, 3, 5, 7,… 147, 149 and 151 and multiplied together in all possible ways.\n The number of ways which will give us the product a multiple of 5, is";
        JTextArea jt = new JTextArea(s);
        jt.setEditable(false);
        jt.setBounds(0, 0, 700, 700);
        p1.add(l);
        p1.add(jt);
        jf3.add(p1);

        //options  (I tried making an array of Radiobuttons it dint work)

        JRadioButton jr1 = new JRadioButton("75");
        jr1.setBounds(170, 140, 50, 15);
        JRadioButton jr2 = new JRadioButton("1030");
        jr2.setBounds(170, 170, 70, 15);
        JRadioButton jr3 = new JRadioButton("95");
        jr3.setBounds(170, 200, 50, 15);
        JRadioButton jr4 = new JRadioButton("1140"); // correct ans
        jr4.setBounds(170, 230, 100, 15);
        jf3.add(jr1);
        jf3.add(jr2);
        jf3.add(jr3);
        jf3.add(jr4);

        //saving the answer
        jr1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                 ans[0] = jr1.getText();
                 JOptionPane.showMessageDialog(jf3, "you selected" + ans[0]);
            }
        });

        jr2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ans[0] = jr2.getText();

            }
        });
        jr3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //String ans1 = jr3.getText();
                 ans[0] = jr3.getText().toString();
            }
        });
        jr4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //String ans1 = jr3.getText();
                 ans[0] = jr4.getText().toString();
            }
        });


        // next button

        JButton next = new JButton("Next");
        next.setBounds(420, 280, 70, 30);
        jf3.add(next);

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
             q2(ans);
            }
        });


    }



    //////*******2nd QUESTION****//////*******************************************************************************************************


    public  void q2(String ans[])
    {

        //frame
        JFrame jf4 = new JFrame();
        JPanel p2 = new JPanel();

        p2.setVisible(true);
        p2.setBounds(40, 30, 700, 500);
        jf4.setTitle("O N L I N E   E X A M I N A T I O N");
        jf4.setVisible(true);
        jf4.setBounds(0, 0, 800, 600);
        jf4.setVisible(true);
        jf4.setLayout(null);
        jf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf4.getContentPane().setBackground(Color.decode("#36454F"));

        //question

        JLabel l = new JLabel("QUESTION NO.2");
        String s = "Which of the following atoms has the highest first ionization energy?";
        JTextArea jt = new JTextArea(s);
        jt.setEditable(false);
        jt.setBounds(0, 0, 700, 700);
        p2.add(l);
        p2.add(jt);
        jf4.add(p2);

        //options

        JRadioButton jr5 = new JRadioButton("Sc"); // correct ans
        jr5.setBounds(170, 140, 50, 15);
        JRadioButton jr6 = new JRadioButton("Rb");
        jr6.setBounds(170, 170, 70, 15);
        JRadioButton jr7 = new JRadioButton("Na");
        jr7.setBounds(170, 200, 50, 15);
        JRadioButton jr8 = new JRadioButton("K");
        jr8.setBounds(170, 230, 50, 15);
        jf4.add(jr5);
        jf4.add(jr6);
        jf4.add(jr7);
        jf4.add(jr8);
        //saving

        jr5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //ans[1] = jr1.getText().toString();
                ans[1]= jr5.getText();
            }
        });
        jr6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //ans[1] = jr2.getText().toString();
                ans[1] = jr6.getText();
            }
        });
        jr7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // ans[1] = jr3.getText().toString();
                ans[1] = jr7.getText();
            }
        });
        jr8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //ans[1] = jr4.getText().toString();
                ans[1] = jr8.getText();
            }
        });


        // ok button

        JButton next2 = new JButton("Next");
        next2.setBounds(420, 280, 70, 30);
        jf4.add(next2);

        next2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
               q3();
            }
        });


    }


////// 3RD QUESTION******///////*******************************************************************************************


    public void q3()
    {
        JFrame jf5 = new JFrame();
        JPanel p3 = new JPanel();
        //frame


        p3.setVisible(true);
        p3.setBounds(40, 30, 700, 500);
        jf5.setTitle("O N L I N E   E X A M I N A T I O N");
        jf5.setVisible(true);
        jf5.setBounds(0, 0, 800, 600);
        jf5.setVisible(true);
        jf5.setLayout(null);
        jf5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf5.getContentPane().setBackground(Color.decode("#36454F"));

        //question

        JLabel l = new JLabel("QUESTION NO.3");
        String s = "A pipe open at both ends has a fundamental frequency f in air. The pipe is dipped vertically in water so that half of it is in water. \n The fundamental frequency of the air column is now :-";
        JTextArea jt = new JTextArea(s);
        jt.setEditable(false);
        jt.setBounds(0, 0, 700, 700);
        p3.add(l);
        p3.add(jt);
        jf5.add(p3);

        //options

        JRadioButton jr9 = new JRadioButton("f"); // correct ans
        jr9.setBounds(170, 140, 50, 15);
        JRadioButton jr10 = new JRadioButton("f/2");
        jr10.setBounds(170, 170, 70, 15);
        JRadioButton jr11 = new JRadioButton("3f/4");
        jr11.setBounds(170, 200, 50, 15);
        JRadioButton jr12 = new JRadioButton("2f");
        jr12.setBounds(170, 230, 50, 15);
        jf5.add(jr9);
        jf5.add(jr10);
        jf5.add(jr11);
        jf5.add(jr12);


        //saving


        jr9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //ans[2] = jr9.getText().toString();
                jee.ans[2] = jr9.getText();
            }
        });
        jr10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //ans[2] = jr9.getText().toString();
                jee.ans[2]= jr10.getText();
            }
        });
        jr11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // ans[2] = jr11.getText().toString();
                jee.ans[2] = jr11.getText();
            }
        });
        jr12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //ans[2] = jr12.getText().toString();
                jee.ans[2] = jr12.getText();
            }
        });

        // OK button

        JButton next3 = new JButton("DONE");
        next3.setBounds(420, 280, 70, 30);
        jf5.add(next3);


        next3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                result();

            }
        });








        /////////////RESULT****************////////////////////////*******************************














    }
    void result()
    {
        JFrame jf6 = new JFrame();
        JTextArea ja = new JTextArea();

        jf6.setTitle("O N L I N E   E X A M I N A T I O N");
        jf6.setVisible(true);
        jf6.setBounds(0, 0, 800, 600);
        jf6.setVisible(true);
        jf6.setLayout(null);
        jf6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf6.getContentPane().setBackground(Color.decode("#36454F"));

        ja.setBounds(40, 30, 700, 500);


        // printing answers array
        ja.append("your answer for Q1: "+ans[0]+"\n");
        ja.append("your answer for Q2: "+ans[1]+"\n");
        ja.append("your answer for Q3: "+ans[2]+"\n");



        ja.setEditable(false);
        jf6.add(ja);


        JButton results = new JButton("RESULTS");
        results.setBounds(420, 280, 100, 30);
        ja.add(results);



        results.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {

                marks();


            }
        });




    }




    //////marks********************/////////*******************************************************************************************************






    void marks()
    {
        JFrame jf7 = new JFrame();
        JPanel p4 = new JPanel();
        //frame


        p4.setVisible(true);
        p4.setBounds(40, 30, 700, 500);
        jf7.setTitle("O N L I N E   E X A M I N A T I O N");
        jf7.setVisible(true);
        jf7.setBounds(0, 0, 800, 600);
        jf7.setVisible(true);
        jf7.setLayout(null);
        jf7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf7.getContentPane().setBackground(Color.decode("#36454F"));


        int correct = 0;
        int wrong = 0;
        if(ans[0]=="1140")
        {
            correct++;

        }
        else
        {
            wrong++;
        }

        if (ans[1]=="Sc")
        {
            correct++;
        }
        else
        {
            wrong++;
        }

        if (ans[2]=="f")
        {
            correct++;
        }
        else
        {
            wrong++;
        }

        JLabel l2= new JLabel("result.");
        l2.setFont(new Font("Source code pro",Font.PLAIN,25));
        l2.setForeground(Color.decode("#D3D3D3"));
        jf7.add(l2);
        l2.setBounds(120,100,600,40);
        JLabel l3= new JLabel(correct+"/3");
        l3.setFont(new Font("Source code pro",Font.PLAIN,25));
        l3.setForeground(Color.decode("#D3D3D3"));
        jf7.add(l3);
        l3.setBounds(120,130,600,40);




    }




}