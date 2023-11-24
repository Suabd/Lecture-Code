package week8GUIs.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame{
    private JTextField dollarstextField;
    private JButton convertButton;
    private JLabel eurosResultLabel;
    private JPanel mainPanel;
    private JComboBox<String> currencyucomboBox;

    private double dollarsToEurosExchangeRate = 0.84;

    private String EUROS = "Euros";
    private String POUNDS = "Pounds";

    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.84, POUNDS, 0.75);
    CurrencyConverter() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(400, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getRootPane().setDefaultButton(convertButton);

        currencyucomboBox.addItem(EUROS);
        currencyucomboBox.addItem(POUNDS);
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // what was typed in the JTextField dollarsTextField?
                String dollarString = dollarstextField.getText();
                try {
                    // convert to numbers
                    double dollars = Double.parseDouble(dollarString); // TODO handle exceptions
                    String toCurrency = (String) currencyucomboBox.getSelectedItem();

                    double exchangeRate = exchangeRates.get(toCurrency);
                    // convert to Euros
                    double convertedValue = dollars * exchangeRate;
                    // display result in euroResultLabel JLabel
                    String resultString = String.format("%.2f dollars is equivalent to %.2f euros",
                            dollars, convertedValue, toCurrency);

                    eurosResultLabel.setText(resultString);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(CurrencyConverter.this,
                            "Please enter a number without any $ or other characters.");
                }
            }
        });
    }
}
