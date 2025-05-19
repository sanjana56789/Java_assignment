package forthexercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo4b extends JFrame implements ActionListener {
    private JButton srilankaButton;
    private JButton indiaButton;
    private JLabel messageLabel;

    public CountryButtonDemo4b() {
        // Frame setup
        setTitle("Country Button Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Create buttons
        srilankaButton = new JButton("Srilanka");
        indiaButton = new JButton("India");

        // Register ActionListener
        srilankaButton.addActionListener(this);
        indiaButton.addActionListener(this);

        // Label to display messages
        messageLabel = new JLabel("Press a button", SwingConstants.CENTER);

        // Layout setup
        setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(srilankaButton);
        buttonPanel.add(indiaButton);

        add(buttonPanel, BorderLayout.CENTER);
        add(messageLabel, BorderLayout.SOUTH);
    }

    // Handle button click events
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == srilankaButton) {
            messageLabel.setText("Srilanka is pressed");
        } else if (e.getSource() == indiaButton) {
            messageLabel.setText("India is pressed");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CountryButtonDemo4b().setVisible(true);
        });
    }
}
