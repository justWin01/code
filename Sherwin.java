import javax.swing.JOptionPane;

public class Sherwin extends personal1 {
  public Sherwin(String surname) {
    super(surname);
  }

  public void exercizing() {
    JOptionPane.showMessageDialog(null, "Sherwin is exercising", "Success", JOptionPane.INFORMATION_MESSAGE);
    int choice = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);

    // Check user's choice
    if (choice == JOptionPane.YES_OPTION) {
      JOptionPane.showMessageDialog(null, "Yes MR.Sherwin is Exercising wala jud diay ka kalimot bai");
    } else if (choice == JOptionPane.YES_NO_CANCEL_OPTION) {
      JOptionPane.showMessageDialog(null, "sure naka?");
    } else {
      JOptionPane.showMessageDialog(null, "dili nata amigo kalimot naman ka!!!!");
    }
  }
}
