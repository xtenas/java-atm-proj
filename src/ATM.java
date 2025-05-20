import java.util.Scanner;
class ATM {
    private BankAccount account;
    private Scanner scanner;
    // Constructor to initialize ATM with an account
    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
    // Display the ATM menu and handle user actions
    public void showMenu() {
        int choice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
    // Method to check the balance of the account
    private void checkBalance() {
        System.out.println("Current balance: $" +
                account.getBalance());
    }
    // Method to deposit money into the account
    private void depositMoney() {
        System.out.print("Enter deposit amount: $");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }
    // Method to withdraw money from the account
    private void withdrawMoney() {
        System.out.print("Enter withdrawal amount: $");
        double amount = scanner.nextDouble();
        if (!account.withdraw(amount)) {
            System.out.println("Withdrawal failed.");
        }
    }
}
