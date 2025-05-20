package swingmessage4abc;

import javax.swing.*;
import java.awt.*;

public class HelloSwing4a {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Swing Hello Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLocationRelativeTo(null); // Center the frame

        // Create JLabel with the message
        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming", SwingConstants.CENTER);
        label.setForeground(Color.BLUE); // Set text color to blue
        label.setFont(new Font("Serif", Font.PLAIN, 32)); // Plain font, size 32

        // Add label to frame
        frame.add(label);

        // Make frame visible
        frame.setVisible(true);
    }
}

