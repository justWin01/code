
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class application extends JFrame implements ActionListener {
    private static final Object Button = null;
    TextField tf;
    String name = "programmer";

    application() {
        tf = new TextField();
        tf.setBounds(105, 150, 100, 20);
        Button button = new Button("Click me");
        button.setBounds(10, 150, 100, 20);

        button.addActionListener(this);

        add(button);
        add(tf);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Program");
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Button) {
            String inputUsername = name;

        }
    }

    public static void main(String[] args) {
        application app = new application();
    }
}
