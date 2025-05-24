import java.awt.*;
import java.awt.event.*;

public class data extends Frame {
    public data() {
        setTitle("Attendance Management System");
        setSize(600, 400);

        Panel panel = new Panel();
        add(panel);
        panel.setLayout(new BorderLayout());

        // Creating components
        TextField batchText = new TextField(20);
        panel.add(batchText, BorderLayout.NORTH);

        TextArea textArea = new TextArea();
        panel.add(textArea, BorderLayout.CENTER);

        Label studentLabel = new Label("Student");
        panel.add(studentLabel, BorderLayout.WEST);

        Label classLabel = new Label("Class");
        panel.add(classLabel, BorderLayout.WEST);

        Label reportLabel = new Label("Report");
        panel.add(reportLabel, BorderLayout.WEST);

        Label settingLabel = new Label("Setting");
        panel.add(settingLabel, BorderLayout.WEST);

        Label exitLabel = new Label("Exit");
        panel.add(exitLabel, BorderLayout.WEST);

        setVisible(true);

        // Handle closing the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new data();
    }

    @Override
    public String toString() {
        return "data []";
    }
}