package Test;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RoundedButton extends JButton {

    public RoundedButton(String label) {
        super(label);

        // Set the background color and border of the button
        setBackground(new Color(0x1BC2D0));
        //setBorder(new LineBorder(new Color(0x1BC2D0), 1, true));


        // Set the size of the button
        setPreferredSize(new Dimension(100, 50));

        // Add an action listener to the button
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });
    }

    // Override the paintComponent method to draw the rounded corners of the button
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Cast the graphics object to a Graphics2D object
        Graphics2D g2d = (Graphics2D) g;

        // Enable anti-aliasing for smooth, rounded corners
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the rounded corners of the button
        g2d.setColor(getBackground());
        g2d.fillRoundRect(100, 100, getWidth() - 1, getHeight() - 1, 200, 200);
    }
}

