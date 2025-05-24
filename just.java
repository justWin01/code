import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class just extends Frame implements ActionListener {
    Button launchButton;

    public just() {
        launchButton = new Button("Launch Excel");
        launchButton.addActionListener(this);

        setLayout(new FlowLayout());
        add(launchButton);

        setTitle("Excel Launcher");
        setSize(300, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == launchButton) {
            try {
                Runtime.getRuntime().exec("cmd /c start excel");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new just();
    }
}
