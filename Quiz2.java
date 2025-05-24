
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz2 extends JFrame {

    // Instantiation

    okayAction o = new okayAction();
    cancelAction c = new cancelAction();
    revertAction r = new revertAction();
    JTextField[] tf = new JTextField[16];
    JPanel p1 = new JPanel(new GridLayout(4, 4));
    JPanel p2 = new JPanel(new FlowLayout());
    JButton b1 = new JButton("Ok");
    JButton b2 = new JButton("Cancel");
    JButton b3 = new JButton("Revert");

    Quiz2() {
        // set-up
        for (int i = 0; i < 16; i++) {
            tf[i] = new JTextField();
            p1.add(tf[i]);
        }

        setTitle("Quiz2 Combination Example");
        setVisible(true);
        setSize(900, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        add(p1);
        add(p2, BorderLayout.SOUTH);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);

        tf[0].setText("No.");
        tf[1].setText("Name");
        tf[2].setText("E-mail");
        tf[3].setText("URL");
        tf[4].setText("1");
        tf[8].setText("2");
        tf[12].setText("3");

        tf[0].setEditable(false);
        tf[1].setEditable(false);
        tf[2].setEditable(false);
        tf[3].setEditable(false);
        tf[4].setEditable(false);
        tf[8].setEditable(false);
        tf[12].setEditable(false);

        b1.addActionListener(o);
        b2.addActionListener(c);
        b3.addActionListener(r);
    }

    public static void main(String[] args) {
        new Quiz2();
    }
}

class Okay extends JFrame {
    Okay() {
        setTitle("Okay");
        setVisible(true);
        setSize(900, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel x = new JLabel("OKAY");
        add(x);
    }
}

class Cancel extends JFrame {
    Cancel() {
        setTitle("Cancel");
        setVisible(true);
        setSize(900, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel y = new JLabel("Cancel lng sah");
        add(y);
    }
}

class Revert extends JFrame {
    Revert() {
        setTitle("Revert");
        setVisible(true);
        setSize(900, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel z = new JLabel("AMBOT UNSAON");
        add(z);
    }
}

class okayAction implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        new Okay();
    }
}

class cancelAction implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        new Cancel();
    }
}

class revertAction implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        new Revert();
    }
}