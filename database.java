import java.awt.*;

import javax.swing.*;

public class database extends JFrame {
    String type = "sherwin";
    JLabel l = new JLabel("TYPE:");
    JTextField t = new JTextField();
    JButton b = new JButton("Enter");

    database() {

        setTitle("CODING");
        setSize(200, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        setVisible(true);

        add(l);
        add(t);
        add(b);

        b.addActionListener(new actionlis){

        }

    }

    public static void main(String[] args) {
        new database();
    }
}
