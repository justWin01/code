import java.awt.*;
import java.awt.event.*;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Quiz1 extends JFrame {
    Action A = new Action(this);

    JLabel l1 = new JLabel("Convert from:");
    ButtonGroup b1 = new ButtonGroup();
    JPanel p1 = new JPanel(new FlowLayout());
    JRadioButton check1 = new JRadioButton("Fahreheit");
    JRadioButton check2 = new JRadioButton("Celsius");
    JRadioButton check3 = new JRadioButton("Kelvin");

    JLabel l2 = new JLabel("Enter Numeric Temperature:");
    JTextField t1 = new JTextField();

    JLabel l3 = new JLabel("Convert:");
    ButtonGroup b2 = new ButtonGroup();
    JPanel p2 = new JPanel(new FlowLayout());
    JRadioButton check4 = new JRadioButton("Fahreheit");
    JRadioButton check5 = new JRadioButton("Celsius");
    JRadioButton check6 = new JRadioButton("Kelvin");

    JLabel l4 = new JLabel("Comparable Temperature:");
    JTextField t2 = new JTextField();

    Quiz1() {
        setTitle("Temperature Conversion");
        setSize(300, 300);
        setLayout(new GridLayout(8, 1));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(l1);
        add(p1);
        p1.add(check1);
        p1.add(check2);
        p1.add(check3);
        b1.add(check1);
        b1.add(check2);
        b1.add(check3);
        add(l2);
        add(t1);
        add(l3);
        add(p2);
        p2.add(check4);
        p2.add(check5);
        p2.add(check6);
        b2.add(check4);
        b2.add(check5);
        b2.add(check6);
        add(l4);
        add(t2);
        t2.setEditable(false);
        check1.addActionListener(A);
        check2.addActionListener(A);
        check3.addActionListener(A);
        check4.addActionListener(A);
        check5.addActionListener(A);
        check6.addActionListener(A);
    }

    public static void main(String[] args) {
        new Quiz1();
    }
}

class Action implements ActionListener {

    Quiz1 obj;

    Action(Quiz1 quiz1) {
        this.obj = quiz1;
    }

    public void actionPerformed(ActionEvent e) {
        double inputTemperature;
        try {
            inputTemperature = Double.parseDouble(obj.t1.getText());
        } catch (NumberFormatException ex) {
            // Handle invalid input
            obj.t2.setText("Invalid input");
            return;
        }

        if (obj.check1.isSelected()) {
            if (obj.check5.isSelected()) { // Fahrenheit to Celsius
                obj.t2.setText(String.valueOf((inputTemperature - 32) / 1.8));
            } else if (obj.check6.isSelected()) { // Fahrenheit to Kelvin
                obj.t2.setText(String.valueOf((inputTemperature - 32) / 1.8 + 273.15));
            }
        } else if (obj.check2.isSelected()) {
            if (obj.check4.isSelected()) { // Celsius to Fahrenheit
                obj.t2.setText(String.valueOf(inputTemperature * 1.8 + 32));
            } else if (obj.check6.isSelected()) { // Celsius to Kelvin
                obj.t2.setText(String.valueOf(inputTemperature + 273.15));
            }
        } else if (obj.check3.isSelected()) {
            if (obj.check4.isSelected()) { // Kelvin to Fahrenheit
                obj.t2.setText(String.valueOf(inputTemperature * 1.8 - 459.67));
            } else if (obj.check5.isSelected()) { // Kelvin to Celsius
                obj.t2.setText(String.valueOf(inputTemperature - 273.15));
            }
        }
    }
}