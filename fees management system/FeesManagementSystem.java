import java.util.ArrayList;
import java.util.Scanner;

public class FeesManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\nFees Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Student Information");
            System.out.println("3. Pay Fees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(students);
                    break;
                case 2:
                    viewStudentInfo(students);
                    break;
                case 3:
                    payFees(students);
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void addStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String studentId = scanner.next();
        System.out.print("Enter Student Name: ");
        String name = scanner.next();
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        Student student = new Student(studentId, name, balance);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public static void viewStudentInfo(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String studentId = scanner.next();

        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                student.displayInfo();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void payFees(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String studentId = scanner.next();

        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                System.out.print("Enter Amount to Pay: ");
                double amount = scanner.nextDouble();
                double currentBalance = student.getBalance();
                if (amount <= currentBalance) {
                    student.setBalance(currentBalance - amount);
                    System.out.println("Payment successful.");
                } else {
                    System.out.println("Insufficient balance. Payment failed.");
                }
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
