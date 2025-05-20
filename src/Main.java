

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345678", 500.00);

        // Create an ATM object and pass the bank account
        ATM atm = new ATM(account);

        // Show the ATM menu to the user
        atm.showMenu();
    }
}



