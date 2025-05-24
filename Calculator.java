import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class Calculator extends JFrame implements ActionListener {

    TextField text;
    Button bu0, bu1, bu2, bu3, bu4, bu5, bu6, bu7, bu8, bu9, buAdd, buSub, buMul, buDiv, buEqual, buClear;
    String ope;
    double num1, num2, result;

    public Calculator() {
        text = new TextField();
        bu0 = new Button("0");
        bu1 = new Button("1");
        bu2 = new Button("2");
        bu3 = new Button("3");
        bu4 = new Button("4");
        bu5 = new Button("5");
        bu6 = new Button("6");
        bu7 = new Button("7");
        bu8 = new Button("8");
        bu9 = new Button("9");
        buAdd = new Button("+");
        buSub = new Button("-");
        buMul = new Button("*");
        buDiv = new Button("/");
        buEqual = new Button("=");
        buClear = new Button("C");

        setLayout(new BorderLayout());
        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(4, 4));
        p1.add(bu1);
        p1.add(bu2);
        p1.add(bu3);
        p1.add(buAdd);
        p1.add(bu4);
        p1.add(bu5);
        p1.add(bu6);
        p1.add(buSub);
        p1.add(bu7);
        p1.add(bu8);
        p1.add(bu9);
        p1.add(buMul);
        p1.add(buClear);
        p1.add(bu0);
        p1.add(buEqual);
        p1.add(buDiv);

        add(text, BorderLayout.NORTH);
        add(p1, BorderLayout.CENTER);

        bu0.addActionListener(this);
        bu1.addActionListener(this);
        bu2.addActionListener(this);
        bu3.addActionListener(this);
        bu4.addActionListener(this);
        bu5.addActionListener(this);
        bu6.addActionListener(this);
        bu7.addActionListener(this);
        bu8.addActionListener(this);
        bu9.addActionListener(this);
        buAdd.addActionListener(this);
        buSub.addActionListener(this);
        buMul.addActionListener(this);
        buDiv.addActionListener(this);
        buEqual.addActionListener(this);
        buClear.addActionListener(this);

        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            ope = s;
            num1 = Double.parseDouble(text.getText());
            text.setText("");
        } else if (s.equals("=")) {
            num2 = Double.parseDouble(text.getText());
            switch (ope) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            text.setText(String.valueOf(result));
        } else if (s.equals("C")) {
            text.setText("");
        } else {
            text.setText(text.getText() + s);
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}