package Test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class RunningTextGUI {

    public static void main(String[] args) {
        // Create the frame and set the layout
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());

        // Create the label and add it to the frame
        JLabel label = new JLabel("Hello, World!");
        frame.add(label);

        // Create a timer to update the text of the label at regular intervals
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the text of the label
                label.setText("Running text: " + System.currentTimeMillis());
            }
        });

        // Start the timer
        timer.start();

        // Display the frame
        frame.pack();
        frame.setVisible(true);
    }
}