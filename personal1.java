import javax.swing.JOptionPane;

public class personal1 {
    String surname;

    public personal1(String surname) {
        this.surname = surname;
    }

    public void doing() {
        JOptionPane.showMessageDialog(null, "is exercising", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}
