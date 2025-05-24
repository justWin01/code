import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Timer;

public class table extends Frame {
    private Label timeLabel;

    public table() {
        super("Digital Clock");
        setSize(300, 100);
        setLayout(new FlowLayout());

        timeLabel = new Label();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(timeLabel);

        // Update time every second
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        });
        timer.start();

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    private void updateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String currentTime = dateFormat.format(new Date());
        timeLabel.setText(currentTime);
    }

    public static void main(String[] args) {
        new table();
    }
}
