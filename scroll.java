import javax.swing.*;
import java.awt.event.*;

public class scroll extends JFrame {

    scroll() {

        setSize(300, 300);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Scrool");
    }

    public static void main(String[] args) {
        new scroll();
    }
}
