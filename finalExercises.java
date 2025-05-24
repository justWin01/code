
import java.awt.*;
import javax.swing.*;

public class finalExercises extends JFrame {
    finalExercises() {
        JPanel westPanel = new JPanel(new FlowLayout());
        JLabel L1 = new JLabel();
        JButton[] b = new JButton[5];

        String[] s = { "name", "surname", "lastname", null, null };
        for (int i = 0; i < 5; i++) {
            b[i] = new JButton();
            westPanel.add(b[i]);
            b[i].setText(s[i]);
            b[i].setSize(westPanel.getX(), 100);
        }

        JToolBar bar = new JToolBar("Class");
        bar.setBackground(Color.darkGray);
        bar.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        bar.setBounds(105, 5, 400, 250);

        westPanel.setBackground(Color.GRAY);
        westPanel.setPreferredSize(new Dimension(100, 300));

        Panel centerPanel = new Panel();
        centerPanel.setBackground(Color.black);

        add(westPanel, BorderLayout.WEST);
        add(bar);
        add(centerPanel, BorderLayout.CENTER);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(NORMAL);
        setLocationRelativeTo(null);
        setTitle("Sherwin");
    }

    public static void main(String[] args) {

        new finalExercises();
    }
}