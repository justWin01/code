import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class moti {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Frame frame = new Frame("Motivational Quote " + (i + 1));
            Label label = new Label(getMotivationalMessage());
            frame.add(label);
            frame.setSize(500, 700);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        }
    }

    private static String getMotivationalMessage() {
        String[] messages = {
                "Believe you can and you're halfway there. - Theodore Roosevelt",
                "The only way to do great work is to love what you do. - Steve Jobs",
                "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
                "Your limitation—it's only your imagination.",
                "Push yourself, because no one else is going to do it for you.",
                "Great things never come from comfort zones.",
                "Dream it. Wish it. Do it.",
                "Success doesn’t just find you. You have to go out and get it.",
                "The harder you work for something, the greater you'll feel when you achieve it.",
                "Don't stop when you're tired. Stop when you're done."
        };
        int randomIndex = (int) (Math.random() * messages.length);
        return messages[randomIndex];
    }
}
