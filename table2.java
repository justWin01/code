import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class table2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Date Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) {
            days[i - 1] = String.valueOf(i);
        }

        String[] months = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };

        String[] years = new String[100];
        for (int i = 1900; i <= 1999; i++) {
            years[i - 1900] = String.valueOf(i);
        }

        JComboBox<String> dayComboBox = new JComboBox<>(days);
        JComboBox<String> monthComboBox = new JComboBox<>(months);
        JComboBox<String> yearComboBox = new JComboBox<>(years);

        panel.add(dayComboBox);
        panel.add(monthComboBox);
        panel.add(yearComboBox);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedDay = (String) dayComboBox.getSelectedItem();
                String selectedMonth = (String) monthComboBox.getSelectedItem();
                String selectedYear = (String) yearComboBox.getSelectedItem();
                JOptionPane.showMessageDialog(frame,
                        "Selected Date: " + selectedDay + " " + selectedMonth + " " + selectedYear);
            }
        });

        panel.add(submitButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
