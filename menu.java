import java.awt.*;
import javax.swing.*;

public class menu extends JFrame {
    JMenu m, sub;
    JMenuItem l, l1, l2, l3, l4, l5;
    JButton b1, b2, b3, b4;

    menu() {

        m = new JMenu("MENU");
        sub = new JMenu("SubMenu");
        JMenuBar menubar = new JMenuBar();

        l = new JMenuItem("Labe");
        l1 = new JMenuItem("Labe");
        l2 = new JMenuItem("Labe");
        l3 = new JMenuItem("Labe");
        l4 = new JMenuItem("Sherwin");
        l5 = new JMenuItem("Sherwin");

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        m.add(l);
        m.add(l1);
        m.add(l2);
        m.add(l3);

        sub.add(l4);
        sub.add(l5);
        m.add(sub);

        menubar.add(m);

        setJMenuBar(menubar);
        setTitle("Menu");
        setVisible(true);
        setSize(300, 300);
        setLayout(new GridLayout(2, 2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        new menu();
    }
}
