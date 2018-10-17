package bersaglio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Bersaglio {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Il mio bersaglio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public class JBersaglio extends JPanel {
        public JBersaglio() {
            setBackground(Color.cyan);
            setPreferredSize(new Dimension (300,300));
        }
    }

}
