package gui.problem_3;
import javax.swing.*;
import java.awt.*;

public class A {
    A() {
        JFrame jf = new JFrame("hello");
        // JPanel chld = new JPanel();
        jf.setSize(400,400);
        jf.setLayout(new BorderLayout());
        
        JButton jb = new JButton("Send");
        JButton jb2 = new JButton("Send_2");
        JButton jb3 = new JButton("Send_3");
        JTextField jtf = new JTextField(null, "Write here", 23);
        JLabel jlbl = new JLabel("Label: ");
        // chld.add(jb2);
        // chld.add(jtf);
        
        // jf.add(jtf, BorderLayout.NORTH);
        jf.add(jtf, BorderLayout.);
        jf.add(jb, BorderLayout.PAGE_END);
        // jf.add(jb, BorderLayout.EAST);


        jf.setVisible(true);

    }
}
