public class Student {
    private String studentId;
    private String name;
    private double balance;

    public Student(String studentId, String name, double balance) {
        this.studentId = studentId;
        this.name = name;
        this.balance = balance;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Balance: $" + balance);
    }
}
