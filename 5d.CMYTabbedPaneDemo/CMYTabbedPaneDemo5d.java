// 5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and display the concerned color whenever the specific tab is selected in the Pan

package swingprg5abcd;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CMYTabbedPaneDemo5d extends JFrame {
    private JTabbedPane tabbedPane;

    public CMYTabbedPaneDemo5d() {
        setTitle("CMY Tabbed Pane Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabbedPane = new JTabbedPane();

        // Create empty panels for each tab
        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel yellowPanel = new JPanel();

        // Add tabs to tabbedPane
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add ChangeListener to update panel color on tab selection
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();

                // Reset all to default
                cyanPanel.setBackground(null);
                magentaPanel.setBackground(null);
                yellowPanel.setBackground(null);

                switch (index) {
                    case 0:
                        cyanPanel.setBackground(Color.CYAN);
                        break;
                    case 1:
                        magentaPanel.setBackground(Color.MAGENTA);
                        break;
                    case 2:
                        yellowPanel.setBackground(Color.YELLOW);
                        break;
                }
            }
        });

        // Set initial tab and background color
        tabbedPane.setSelectedIndex(0);
        cyanPanel.setBackground(Color.CYAN);

        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CMYTabbedPaneDemo5d().setVisible(true);
        });
    }
}

