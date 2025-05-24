import java.util.Scanner;
import javax.swing.JOptionPane;

public class loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = a + b;

        System.out.println(b);
        for (int i = 0; i < num; i++) {

            c = a + b;
            a = b;
            b = c;

            System.out.println(c);

        }
        sc.close();
    }

}
