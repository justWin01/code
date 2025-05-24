import java.util.Scanner;

public class OOP {

    private int studentid;
    private String name;
    private String lastname;
    private int gradelevel;
    private double gpa;

    public void OOP(int studentid, String name, String lastname, int gradelevel, double gpa) {
        this.studentid = studentid;
        this.name = name;
        this.lastname = lastname;
        this.gradelevel = gradelevel;
        this.gpa = gpa;
    }

    public int getstudentid() {
        return studentid;
    }

    public void setstudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getlastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public int getgradelevel() {
        return gradelevel;
    }

    public void setgradelevel(int gradelevel) {
        this.gradelevel = gradelevel;
    }

    public double getgpa() {
        return gpa;
    }

    public void setgpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return ("     \n" + "StudentID:" + studentid + "\n" + "        \n" + "First Name:"
                + name + "\n" + "       \n" + "Student Last Name:" + lastname + "\n" +
                "            \n" + "Student Grade Level:" + gradelevel + "\n" + "          \n" +
                "Student GPA:" + gpa + "\n" + "           \n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Id:");
        int StudentID = sc.nextInt();
        System.out.print("Enter Student Name:");
        String name = sc.next();
        System.out.print("Enter Student lastname:");
        String lastname = sc.next();
        System.out.print("Enter Student Grade:");
        int grade = sc.nextInt();
        System.out.print("Enter Student GPA:");
        int gpa = sc.nextInt();

        OOP student = new OOP();
        student.OOP(StudentID, name, lastname, grade, gpa);
        // System.out.println(student.getstudentid());
        System.out.println(student);
        System.out.println("SUMA CUMLAUDE");

    }

}
