import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {

    private JTextField passcodeField;
    private StringBuilder passcodeBuilder;
    private String correctPasscode = "09464600614";
    private Button button;

    public login() {
        setTitle("        Login ");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 3));

        passcodeField = new JTextField();
        passcodeField.setEditable(false);
        passcodeBuilder = new StringBuilder();

        button("1");
        button("2");
        button("3");
        button("4");
        button("5");
        button("6");
        button("7");
        button("8");
        button("9");

        add(button, BorderLayout.CENTER);
        add(passcodeField, BorderLayout.SOUTH);

        JButton zeroButton = new JButton("0");
        zeroButton.addActionListener(new NumberButtonListener(0));
        add(zeroButton);

        JButton enterButton = new JButton("Enter");
        enterButton.addActionListener(new EnterButtonListener());
        add(enterButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ClearButtonListener());
        add(clearButton);
    }

    private void button(String digit) {
        JButton button = new JButton(digit);
        button.addActionListener(new NumberButtonListener(Integer.parseInt(digit)));

    }

    private class NumberButtonListener implements ActionListener {
        private int number;

        public NumberButtonListener(int number) {
            this.number = number;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            passcodeBuilder.append(number);
            passcodeField.setText(passcodeField.getText() + "*");
        }
    }

    private class EnterButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String enteredPasscode = passcodeBuilder.toString();
            if (enteredPasscode.equals(correctPasscode)) {
                startApp();
            } else {
                passcodeField.setText("");
                passcodeBuilder.setLength(0);
                JOptionPane.showMessageDialog(login.this, "Wrong passcode", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            passcodeField.setText("");
            passcodeBuilder.setLength(0);
        }
    }

    private void startApp() {
        JOptionPane.showMessageDialog(this, "Tama ang iyung nilagay na password");
    }

    public static void main(String[] args) {
        login loginApp = new login();
        loginApp.setVisible(false);

    }
}
