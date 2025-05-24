import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class quiz extends JFrame {

    JLabel l = new JLabel("Enter daw kung sure jud ka");
    JButton b = new JButton("Enter");

    quiz() {
        setTitle("quiz");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(3, 1));
        setSize(300, 200);
        setLocationRelativeTo(rootPane);

        add(l);
        add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new quiz1();

                new quiz2();

            }
        });

    }

    public static void main(String[] args) {
        new quiz();

    }

    public class quiz1 extends JFrame {
        JLabel L = new JLabel("sure jud diay");
        JLabel l = new JLabel("Click the:");

        JButton B = new JButton("tuploka ang pang motivition");

        quiz1() {
            setTitle("quiz");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            setLayout(new GridLayout(1, 0));
            setSize(150, 100);
            setLocationRelativeTo(null);
            add(L);
            add(l);
            add(B);

        }
    }

    public class quiz2 extends JFrame {
        JLabel La = new JLabel("Believe you can and you're halfway there. - Theodore Roosevelt" +
                "The only way to do great work is to love what you do. - Steve Jobs" +
                "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill"
                +
                "Your limitation—it's only your imagination." +
                "Push yourself, because no one else is going to do it for you." +
                "Great things never come from comfort zones." +
                "Dream it. Wish it. Do it." + "Success doesn’t just find you. You have to go out and get it." +
                "The harder you work for something, the greater you'll feel when you achieve it." +
                "Don't stop when you're tired. Stop when you're done.");

        quiz2() {
            setTitle("quiz");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            setLayout(new GridLayout(1, 0));
            setSize(500, 500);
            setLocationRelativeTo(null);
            add(La);

        }
    }
}
