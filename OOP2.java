import java.util.Scanner;

public class OOP2 {
    public int num1;
    public int num2;

    public OOP2(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    public int getnum1() {
        return num1;
    }

    public int getnum2() {
        return num2;
    }

    public int getSum() {
        return num1 + num2;
    }

    public int getMinus() {
        return num1 - num2;
    }

    public int getMult() {
        return num1 * num2;
    }

    public int getDiv() {
        return num1 / num2;
    }

    public int getMod() {
        return num1 % num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a First Number:");
        int num1 = sc.nextInt();

        System.out.print("Enter a Second Number:");
        int num2 = sc.nextInt();

        OOP2 obj = new OOP2(num1, num2);
        System.out.println("num1: " + obj.getnum1());
        System.out.println("num2: " + obj.getnum2());
        System.out.println("  \n");
        System.out.println("Add all Number:" + obj.getSum());
        System.out.println("Minus all Number:" + obj.getMinus());
        System.out.println("Mult all Number:" + obj.getMult());
        System.out.println("Div all Number:" + obj.getDiv());
        System.out.println("Mod all Number:" + obj.getMod());
    }
}