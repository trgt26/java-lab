import javax.swing.JFrame;

public class SOLUTION {
    SOLUTION() {
        JFrame parent = new JFrame("Click to Close Everything");
        parent.setSize(400, 400);
        parent.setVisible(true);
        parent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JFrame child = new JFrame("Click to Close Just This");
        child.setSize(300, 300);
        child.setVisible(true);
        child.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
