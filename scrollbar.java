import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class scrollbar extends JFrame implements AdjustmentListener {
    private Scrollbar scrollbar, s;
    private JPanel p;
    private JButton b;

    public scrollbar() {
        p = new JPanel();
        p.setBackground(Color.gray);
        p.setBounds(40, 400, 400, 350);
        b = new JButton("CM");
        b.setLayout(null);
        b.setBounds(5, 10, 20, 20);
        scrollbar = new Scrollbar(Scrollbar.VERTICAL, 0, 50, 0, 100);
        scrollbar.setPreferredSize(new Dimension(20, 500));
        scrollbar.addAdjustmentListener(this);

        s = new Scrollbar(Scrollbar.HORIZONTAL, 0, 50, 0, 100);
        scrollbar.setPreferredSize(new Dimension(20, 500));
        scrollbar.addAdjustmentListener(this);
        add(scrollbar);

        add(s, BorderLayout.SOUTH);
        add(scrollbar, BorderLayout.EAST);
        p.add(b);
        add(p);
        setTitle("                     AccessibleScrollDemo");
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void adjustmentValueChanged(AdjustmentEvent e) {

    }

    public static void main(String[] args) {
        new scrollbar();
    }
}
