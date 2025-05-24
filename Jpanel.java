import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jpanel extends JFrame {
    private JPanel jPanel;

    public Jpanel() {
        setTitle("Date Picker Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPanel = new JPanel();
        jPanel.setLayout(null);

        String[] months = { "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December" };
        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i + 1);
        }
        String[] years = { "2010", "2011", "2012", "2013", "2014", "2015", "2016",
                "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" };

        JComboBox<String> jMonth = new JComboBox<>(months);
        jMonth.setBounds(100, 50, 100, 40);
        jPanel.add(jMonth);

        JComboBox<String> jDay = new JComboBox<>(days);
        jDay.setBounds(220, 50, 80, 40);
        jPanel.add(jDay);

        JComboBox<String> jYear = new JComboBox<>(years);
        jYear.setBounds(330, 50, 80, 40);
        jPanel.add(jYear);

        add(jPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Jpanel();
    }
}
