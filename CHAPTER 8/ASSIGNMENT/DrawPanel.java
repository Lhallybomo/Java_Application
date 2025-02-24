
package Chapter_8.Assignment;


import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    private final SecureRandom randomNumbers = new SecureRandom();
    private final MyLine[] lines; // array of lines

    // constructor, creates a panel with random shapes
    public DrawPanel() {
        setBackground(Color.WHITE);

        lines = new MyLine[5 + randomNumbers.nextInt(5)];

        // create lines
        for (int count = 0; count < lines.length; count++) {
            // generate random coordinates
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            // generate a random color
            Color color = new Color(randomNumbers.nextInt(256),
                randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            // add the line to the list of lines to be displayed
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }
    }

    // for each shape array, draw the individual shapes

    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // draw the lines
        for (MyLine line : lines)
            line.draw(g);
    }

    private static class MyLine {

        public MyLine(int x1, int y1, int x2, int y2, Color color) {
        }

        private void draw(Graphics g) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
} // end class DrawPanel

