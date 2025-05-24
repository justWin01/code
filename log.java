import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class log extends Frame implements ActionListener {
    TextField usernameField, passwordField;
    Button loginButton, logoutButton;
    Label statusLabel;

    String username = "admin";
    String password = "password";
    boolean isLoggedIn = false;

    public log() {
        setTitle("Login/Logout System");
        setSize(500, 200);
        setLayout(new FlowLayout());
        //
        Color darkblue = new Color(173, 216, 230);
        setBackground(darkblue);
        Color lightBlue = new Color(173, 216, 230);
        Color lightGreen = new Color(144, 238, 144);

        passwordField = new TextField(65);
        usernameField = new TextField(65);
        passwordField = new TextField(65);
        passwordField.setEchoChar('*');
        loginButton = new Button("Login");
        logoutButton = new Button("Logout");
        statusLabel = new Label("");

        loginButton.setBackground(lightGreen);
        logoutButton.setBackground(lightGreen);

        add(new Label("Username: "));
        add(usernameField);
        add(new Label("Password: "));
        add(passwordField);
        add(loginButton);
        add(logoutButton);
        add(statusLabel);

        loginButton.addActionListener(this);
        logoutButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String inputUsername = usernameField.getText();
            String inputPassword = passwordField.getText();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                statusLabel.setText("Logged in as " + username);
                isLoggedIn = true;
                JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                statusLabel.setText("Invalid username or password");
                isLoggedIn = false;
                JOptionPane.showMessageDialog(this, "Invalid! Password or username", "Invalid Po!",
                        JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(this, "Plss Check", "Invalid Po!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == logoutButton) {
            isLoggedIn = false;
            usernameField.setText("");
            passwordField.setText("");
            statusLabel.setText("Logged out");
        }
    }

    public static void main(String[] args) {
        new log();
    }
}
