package bersaglio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Bersaglio {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Il mio bersaglio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JBersaglio panel = new JBersaglio();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

    }

}

class JBersaglio extends JPanel {

    public JBersaglio() {
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 300));
    }

    // Tracciamento della grafica
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        int cerchi = 500; 
        int x = 0, y = 0, diametro = 300, delta = (int)(Math.random()*100);
        for (int i = 0; i < cerchi; i++) {
            if (i % 4*(int)(Math.random()*100) == 0) {
                page.setColor(Color.lightGray);

            } else {
                page.setColor(Color.yellow);
            }
            page.fillOval(x, y, diametro, diametro);
           y = x += delta;
   
            diametro -= 2 * delta;
        }

    }
    

}
