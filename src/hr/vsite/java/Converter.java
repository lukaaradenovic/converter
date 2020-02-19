package hr.vsite.java;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Converter {
    private JTabbedPane tabbedPane;
    private JPanel converter;
    private JTextField textBrzina;
    private JTextField textTemp;
    private JTextField textDuljina;
    private JButton btnBrzina;
    private JButton btnTemp;
    private JButton btnDuljina;

    Converter() {
        btnBrzina.addActionListener(this::convertBrzina);
        btnTemp.addActionListener(this::convertTemp);
        btnDuljina.addActionListener(this::convertDuljina);
    }

    private void convertBrzina(ActionEvent e) {
        double metarUKm = Double.parseDouble(textBrzina.getText());
        double kilometri = metarUKm*0.62137119;
        String metar = Double.toString(kilometri);
        textBrzina.setText(metar);
    }

    private void convertTemp(ActionEvent e) {
        double tempC = Double.parseDouble(textTemp.getText());
        double farenhajt = tempC*1.8+32;
        String rezFarenhajt = Double.toString(farenhajt);
        textTemp.setText(rezFarenhajt);
    }

    private void convertDuljina(ActionEvent e) {
        double metar = Double.parseDouble(textDuljina.getText());
        double kilometar = metar/1000;
        String rezKilometar = Double.toString(kilometar);
        textDuljina.setText(rezKilometar);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Converter App");
        frame.setContentPane(new Converter().tabbedPane);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
