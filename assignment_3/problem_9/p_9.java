// package assignment_3.problem_9;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import javax.swing.*;

public class p_9 {
    public static void main(String [] args) {
        JFrame jf = new JFrame("converter");
      
        jf.setLayout(new GridLayout(3, 1));
        // jf.setLayout(new FlowLayout());

        JLabel lb1 = new JLabel("in Cel");
        JLabel lb2 = new JLabel("in fr");
        JTextField jtf1 = new JTextField();
        jtf1.setColumns(10);
        JTextField jtf2 = new JTextField(10);
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        jp1.setLayout(new FlowLayout());
        jp2.setLayout(new FlowLayout());
        jp1.add(lb1);
        jp1.add(jtf1);



        jp2.add(lb2);
        jp2.add(jtf2);
        
        jf.add(jp1);
        jf.add(jp2);

        jf.setVisible(true);
        jf.setSize(800, 800);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
