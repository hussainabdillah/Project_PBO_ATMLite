package Test;

import Test.RoundedButton;

import javax.swing.*;

public class MyGUI {
    public static void main(String[] args) {
        // Create the frame and panel
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        // Create the rounded button
        RoundedButton button = new RoundedButton("Click me");

        // Add the button to the panel
        panel.add(button);

        // Add the panel to the frame and display the frame
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
