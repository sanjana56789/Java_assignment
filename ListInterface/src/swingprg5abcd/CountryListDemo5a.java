package swingprg5abcd;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo5a extends JFrame {
    private JList<String> countryList;

    public CountryListDemo5a() {
        setTitle("Country List Demo");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Country names
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark", 
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Create JList with countries
        countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add listener to handle selection changes
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Ignore intermediate events
                if (!e.getValueIsAdjusting()) {
                    // Get selected values
                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();

                    // Print to console
                    System.out.println("Selected countries:");
                    for (String country : selectedCountries) {
                        System.out.println(country);
                    }
                    System.out.println("-------------------");
                }
            }
        });

        // Add JList to scroll pane for better UI
        JScrollPane scrollPane = new JScrollPane(countryList);

        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CountryListDemo5a().setVisible(true);
        });
    }
}
