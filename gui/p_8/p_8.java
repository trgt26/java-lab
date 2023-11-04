package gui.p_8;
// package assignment_3.p_8;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class p_8 {
    public static void main(String [] args) {
        JFrame jf = new JFrame("Menu");

        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setSize(400, 400);

        JMenu jm = new JMenu("test");
        JMenuBar jmb = new JMenuBar();
        JMenuItem jmi1 = new JMenuItem("item 1");
        JMenuItem jmi2 = new JMenuItem("item 2");
        JMenuItem jmi3 = new JMenuItem("item 3");
        jmi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jf.getContentPane().setBackground(Color.GREEN);
            }
        });
        jm.add(jmi1);
        jm.add(jmi2);
        jm.add(jmi3);
        jmb.add(jm);
        jf.setJMenuBar(jmb);

    }
}
