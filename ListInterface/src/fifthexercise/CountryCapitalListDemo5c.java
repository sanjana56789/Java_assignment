package fifthexercise;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CountryCapitalListDemo5c extends JFrame {
    private JList<String> countryList;
    private Map<String, String> countryCapitalMap;

    public CountryCapitalListDemo5c() {
        setTitle("Country Capital List Demo");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize countries and their capitals
        countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Vietnam", "Hanoi");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Denmark", "Copenhagen");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Great Britain", "London");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Africa", "Pretoria (executive)"); // Africa is a continent, but using Pretoria as example
        countryCapitalMap.put("Greenland", "Nuuk");
        countryCapitalMap.put("Singapore", "Singapore");

        // Create JList with countries
        String[] countries = countryCapitalMap.keySet().toArray(new String[0]);
        countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add listener to handle selection changes
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();

                    System.out.println("Selected countries and their capitals:");
                    for (String country : selectedCountries) {
                        String capital = countryCapitalMap.get(country);
                        System.out.println(country + " : " + capital);
                    }
                    System.out.println("-------------------");
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(countryList);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CountryCapitalListDemo5c().setVisible(true);
        });
    }
}
