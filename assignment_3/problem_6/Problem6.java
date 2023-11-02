import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Problem6 {
    Problem6() {

        JFrame jf = new JFrame("My Frame");

        JButton jb = new JButton("OK");
        
        JTextField jtf = new JTextField("Hello Java Click 0");
        
        jb.addActionListener(new ActionListener() {
            
            int cnt = 0;
            public void actionPerformed(ActionEvent e) {
                cnt++;
                String rs = Integer.toString(cnt);
                jtf.setText(rs);
            }
        });
        
        
        jb.setVisible(true);
        JTextArea jta = new JTextArea("null");
        // jta.setLineWrap(true);
        jta.setBounds(200, 200, 300, 300);
        Font fnt = new Font(Font.SANS_SERIF, Font.BOLD, 28);
        jta.setSize(323, 333);
        jta.setFont(fnt);

        jf.setLayout(new BorderLayout());
        jf.add(jb, BorderLayout.LINE_START);
        jf.add(jtf, BorderLayout.LINE_END);

        jf.add(jb);
        // jf.setLayout(null);
        jf.setVisible(true);
        jf.setSize(400, 400); 
    }
}
