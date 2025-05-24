import java.awt.*;
import javax.swing.*;

public class exam04 extends JFrame {
    JMenu m, sub;
    JCheckBox c, c2, c3;
    JButton b1, b2, b3;

    exam04() {

        m = new JMenu("MENU");

        sub = new JMenu("Action State");

        c = new JCheckBox("First action enabled");
        c2 = new JCheckBox("Second action enabled");
        c3 = new JCheckBox("Third action enabled");

        sub.add(c);
        sub.add(c2);
        sub.add(c3);

        JMenuBar menubar = new JMenuBar();
        menubar.add(m);
        menubar.add(sub);
        add(menubar);

        b1 = new JButton("Go Left");
        b2 = new JButton("Do Something");
        b3 = new JButton("Go right");

        setLayout(new FlowLayout());
        setTitle("ActionDemo");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new exam04();
    }
}
