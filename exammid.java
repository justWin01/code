import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

class exammid extends JFrame implements ActionListener {
    Label label;
    Button fah, cel;
    Frame f;

    exammid() {
        label = new Label("Choose:");
        fah = new Button("Fahrenheit to Celsius");
        cel = new Button("Celsius to Fahrenheit");

        fah.addActionListener(this);
        cel.addActionListener(this);

        setLayout(new FlowLayout());
        add(label);
        add(fah);
        add(cel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Temperature Converter");
        setSize(300, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fah) {

            f = new Frame("Fahrenheit to Celsius Converter");
            TextField inputField = new TextField(10);
            Button btnConvert = new Button("Convert");

            btnConvert.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double fahrenheit = Double.parseDouble(inputField.getText());
                    double celsius = (fahrenheit - 32) / 1.8;
                    showResult("Celsius", celsius);
                }
            });

            f.setLayout(new FlowLayout());
            f.add(new Label("Enter temperature in Fahrenheit:"));
            f.add(inputField);
            f.add(btnConvert);

            f.setSize(300, 100);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        } else if (e.getSource() == cel) {

            f = new Frame("Celsius to Fahrenheit Converter");
            TextField inputField = new TextField(10);
            Button btnConvert = new Button("Convert");

            btnConvert.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double celsius = Double.parseDouble(inputField.getText());
                    double fahrenheit = (celsius * 1.8) + 32;
                    showResult("Fahrenheit", fahrenheit);
                }
            });

            f.setLayout(new FlowLayout());
            f.add(new Label("Enter temperature in Celsius:"));
            f.add(inputField);
            f.add(btnConvert);

            f.setSize(300, 100);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        }
    }

    private void showResult(String unit, double inputField) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame resultFrame = new Frame("Result");
        Label resultLabel;

        if (unit.equals("Celsius")) {

            f = new Frame();
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            double f = (inputField * 1.8) + 32;
            resultLabel = new Label("Equivalent : " + unit + " " + inputField);
        } else {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // f.setLocationRelativeTo(null);
            f = new Frame();
            double c = (inputField - 32) / 1.8;
            resultLabel = new Label("Equivalent : " + unit + " " + inputField);
        }

        resultFrame.add(resultLabel);
        resultFrame.setSize(300, 100);
        f.setLocationRelativeTo(null);
        resultFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new exammid();
    }
}
