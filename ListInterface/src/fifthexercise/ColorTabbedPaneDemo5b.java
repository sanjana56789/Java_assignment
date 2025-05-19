package fifthexercise;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ColorTabbedPaneDemo5b extends JFrame {
    private JTabbedPane tabbedPane;

    public ColorTabbedPaneDemo5b() {
        setTitle("Color Tabbed Pane Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabbedPane = new JTabbedPane();

        // Create empty panels for each tab
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel greenPanel = new JPanel();

        // Add tabs to tabbedPane
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add ChangeListener to respond to tab changes
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();

                switch (selectedIndex) {
                    case 0: // RED tab
                        redPanel.setBackground(Color.RED);
                        bluePanel.setBackground(null);
                        greenPanel.setBackground(null);
                        break;
                    case 1: // BLUE tab
                        bluePanel.setBackground(Color.BLUE);
                        redPanel.setBackground(null);
                        greenPanel.setBackground(null);
                        break;
                    case 2: // GREEN tab
                        greenPanel.setBackground(Color.GREEN);
                        redPanel.setBackground(null);
                        bluePanel.setBackground(null);
                        break;
                }
            }
        });

        // Set initial color for first tab
        tabbedPane.setSelectedIndex(0);
        redPanel.setBackground(Color.RED);

        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ColorTabbedPaneDemo5b().setVisible(true);
        });
    }
}
