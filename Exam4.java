import java.awt.*;
import javax.swing.*;

public class Exam4 extends JFrame {
    JMenu m, sub;
    JMenuItem l, l1, l2, l3, l4, l5;
    JButton b1, b2, b3;

    Exam4() {
        // Create menu items
        m = new JMenu("MENU");
        sub = new JMenu("Action State");

        // Create menu bar and add menus to it
        JMenuBar menubar = new JMenuBar();
        menubar.add(m);
        menubar.add(sub);
        setJMenuBar(menubar);

        b1 = new JButton("Go Left");
        b2 = new JButton("Do Something");
        b3 = new JButton("Go right");

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);

        add(buttonPanel, BorderLayout.WEST);

        setTitle("ActionDemo");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exam4();
    }
}
