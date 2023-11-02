// package assignment_3.p_7;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class p_7 {
    public static void main(String [] args) {
        JFrame jf = new JFrame("Color");
        JButton jb = new JButton("Red");
        JButton jb2 = new JButton("Black");
        jb.addActionListener(new ActionListener() {
            // ActionListener.actionPerformed(ActionEvent)
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.getContentPane().setBackground(Color.RED);
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.getContentPane().setBackground(Color.BLACK);
            }
        });

        jf.setLayout(new GridLayout(1,2));
        jf.add(jb);
        jf.add(jb2);
        jf.setVisible(true);
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
