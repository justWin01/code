import javax.swing.*;
import java.awt.*;

public class app extends JFrame {
    app() {
        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.GRAY);

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.GREEN);
        northPanel.setPreferredSize(new Dimension(400, 50)); // Set preferred size for north panel

        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.add(westPanel, BorderLayout.WEST); // Add west panel to the west of the container
        containerPanel.add(northPanel, BorderLayout.NORTH); // Add north panel to the north of the container

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.BLACK);

        setLayout(new BorderLayout());
        add(containerPanel, BorderLayout.WEST); // Add container panel to the west of the frame
        add(centerPanel, BorderLayout.CENTER);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Sherwin");
    }

    public static void main(String[] args) {
        new app();
    }
}
