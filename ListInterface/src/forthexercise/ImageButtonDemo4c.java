package forthexercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo4c extends JFrame implements ActionListener {
    private JButton digitalClockButton;
    private JButton hourGlassButton;
    private JLabel messageLabel;

    public ImageButtonDemo4c() {
        setTitle("Image Button Demo");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Load icons (make sure images exist in the project folder or provide full path)
        ImageIcon digitalClockIcon = new ImageIcon("C:\\Users\\Sanjana M\\Downloads\\digitalwatch.jpg");
        ImageIcon hourGlassIcon = new ImageIcon("C:\\Users\\Sanjana M\\Downloads\\hourglass.jpg");

        // Create buttons with icons
        digitalClockButton = new JButton("Digital Clock", digitalClockIcon);
        hourGlassButton = new JButton("Hour Glass", hourGlassIcon);

        // Set vertical text position below icon
        digitalClockButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        digitalClockButton.setHorizontalTextPosition(SwingConstants.CENTER);

        hourGlassButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        hourGlassButton.setHorizontalTextPosition(SwingConstants.CENTER);

        // Register action listeners
        digitalClockButton.addActionListener(this);
        hourGlassButton.addActionListener(this);

        messageLabel = new JLabel("Press a button", SwingConstants.CENTER);

        // Layout
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(digitalClockButton);
        buttonPanel.add(hourGlassButton);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.CENTER);
        add(messageLabel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == digitalClockButton) {
            messageLabel.setText("Digital Clock is pressed");
        } else if (e.getSource() == hourGlassButton) {
            messageLabel.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ImageButtonDemo4c().setVisible(true);
        });
    }
}
