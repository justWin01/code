import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class hp extends JFrame implements ActionListener {
    hp() {
        Button butt = new Button("I Click mo!");
        butt.setBounds(200, 220, 100, 60);
        butt.addActionListener(this);
        add(butt);
        setSize(500, 500);
        setTitle("Program ni cleentsson");
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(rootPane, e, "Clicked", ABORT);
    }

    public static void main(String[] args) {
        hp a = new hp();
    }
}
