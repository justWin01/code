import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class choose extends JFrame {

    JPanel loginPanel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;
    JLabel statusLabel;

    JPanel userMainFrame;
    JComboBox<String> batchComboBox;
    JButton nextButton;
    JButton studentButton;
    JButton classButton;

    Map<String, String> userCredentials;
    Map<String, String[]> userBatches;

    public choose() {
        setTitle("Attendance Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        userCredentials = new HashMap<>();
        userCredentials.put("user1", "password1");
        userCredentials.put("user2", "password2");

        userBatches = new HashMap<>();
        userBatches.put("user1", new String[] { "Batch1", "Batch2" });
        userBatches.put("user2", new String[] { "Batch3", "Batch4" });

        loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(4, 1));
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        statusLabel = new JLabel();
        loginPanel.add(new JLabel("Username:"));
        loginPanel.add(usernameField);
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginPanel.add(statusLabel);

        userMainFrame = new JPanel();
        userMainFrame.setLayout(new GridLayout(2, 1));
        batchComboBox = new JComboBox<>();
        nextButton = new JButton("Next");
        studentButton = new JButton("Student");
        classButton = new JButton("Class");
        userMainFrame.add(batchComboBox);
        userMainFrame.add(nextButton);
        studentButton.setEnabled(false);
        classButton.setEnabled(false);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
                    statusLabel.setText("Welcome, " + username + "!");
                    loginPanel.setVisible(false);
                    userMainFrame.setVisible(true);
                    String[] batches = userBatches.get(username);
                    batchComboBox.setModel(new DefaultComboBoxModel<>(batches));
                } else {
                    statusLabel.setText("Error: Incorrect username or password.");
                }
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedBatch = (String) batchComboBox.getSelectedItem();
                if (selectedBatch != null) {
                    studentButton.setEnabled(true);
                    classButton.setEnabled(true);
                }
            }
        });

        setLayout(new BorderLayout());
        add(loginPanel, BorderLayout.CENTER);
        add(userMainFrame, BorderLayout.CENTER);

        userMainFrame.setVisible(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new choose();
    }
}