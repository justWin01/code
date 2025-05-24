import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class card extends JFrame implements ActionListener {
    JPanel cards; // a panel that uses CardLayout
    final static String PANEL1 = "Panel 1";
    final static String PANEL2 = "Panel 2";
    JButton switchButton;

    public card() {
        setTitle("CardLayout Example");
        switchButton = new JButton("Switch Panel");
        switchButton.addActionListener(this);

        // Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());

        // Panel 1
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("This is Panel 1"));

        // Panel 2
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("This is Panel 2"));

        // Add panels to card layout
        cards.add(panel1, PANEL1);
        cards.add(panel2, PANEL2);

        getContentPane().add(cards, BorderLayout.CENTER);
        getContentPane().add(switchButton, BorderLayout.SOUTH);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(300, 300);
    }

    public void actionPerformed(ActionEvent e) {
        CardLayout cardLayout = (CardLayout) (cards.getLayout());
        cardLayout.next(cards);
    }

    public static void main(String[] args) {

        new card();

    }
}
