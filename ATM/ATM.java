import java.util.Scanner;

public class ATM {
    private double balance;
    private int accountNumber;
    private int pin;

    public ATM(int accountNumber, int pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = initialBalance;
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");
    }

    public void checkBalance() {
        System.out.println("Your balance is $" + balance);
    }

    public void withdrawFunds(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. You have withdrawn $" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void depositFunds(double amount) {
        balance += amount;
        System.out.println("Deposit successful. You have deposited $" + amount);
    }

    public static void main(String[] args) {
        ATM atm = new ATM(12345, 6789, 1000.0); // Replace with your account number, PIN, and initial balance

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdrawFunds(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    atm.depositFunds(depositAmount);
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you for using our services.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
