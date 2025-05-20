class BankAccount {

        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber, double intialBalance) {

                this.accountNumber = accountNumber;
                this.balance = intialBalance;

        }

        // Deposit money into the account
        public void deposit(double amount) {
                if (amount > 0) {
                        balance += amount;
                        System.out.println("Deposited: $" + amount);
                } else {
                        System.out.println("Deposit amount must be positive.");
                }
        }

        // Withdraw money from the account
        public boolean withdraw(double amount) {
                if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawn: $" + amount);
                        return true;
                } else {
                        System.out.println("Insufficient funds or invalid amount.");
                        return false;
                }
        }

        // Check the current balance
        public double getBalance() {
                return balance;
        }

        // Get the account number
        public String getAccountNumber() {
                return accountNumber;
        }

}



