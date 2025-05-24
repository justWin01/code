
import javax.swing.*;
import java.awt.*;

public class example extends JFrame {

    public example() {
        setTitle("Attendance Panel");
        setSize(800, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(NORMAL);
        setLocationRelativeTo(null);

        JPanel westPanel = new JPanel();
        westPanel.setBackground(new Color(0, 0, 128));
        westPanel.setPreferredSize(new Dimension(115, 293));
        westPanel.setLayout(new GridLayout(5, 1, 20, 50));

        JButton b1 = new JButton("Student");
        b1.setPreferredSize(new Dimension(100, 50));
        JButton b2 = new JButton("Class");
        b2.setPreferredSize(new Dimension(100, 50));
        JButton b3 = new JButton("Report");
        b3.setPreferredSize(new Dimension(100, 50));
        JButton b4 = new JButton("Setting");
        b4.setPreferredSize(new Dimension(100, 50));
        JButton b5 = new JButton("Exit");
        b5.setPreferredSize(new Dimension(100, 50));

        westPanel.add(b1);
        westPanel.add(b2);
        westPanel.add(b3);
        westPanel.add(b4);
        westPanel.add(b5);

        JTextArea jlabel = new JTextArea("Class Attendance");
        jlabel.setBackground(Color.WHITE);
        jlabel.setEditable(false);
        jlabel.setBounds(120, 5, 661, 15);

        JPanel jpanel = new JPanel();
        jpanel.setBackground(new Color(0, 0, 51));
        jpanel.setLayout(null);
        jpanel.setBounds(120, 20, 661, 640);

        JLabel label = new JLabel("Batch Code");
        label.setForeground(Color.WHITE);
        label.setBounds(115, 50, 150, 20);
        jpanel.add(label);

        JTextField T1 = new JTextField();
        T1.setBounds(367, 50, 250, 40);
        jpanel.add(T1);

        add(westPanel, BorderLayout.WEST);
        add(jlabel, BorderLayout.NORTH);
        add(jpanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new example());
    }
}
