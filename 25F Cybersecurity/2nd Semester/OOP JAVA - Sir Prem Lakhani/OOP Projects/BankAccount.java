public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Default constructor
    public BankAccount() {
        this.accountNumber = "0000";
        this.accountHolderName = "Unknown";
        this.balance = 0.0;
    }

    // Parameterized constructor (2 params)
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    // Parameterized constructor (3 params)
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("ACC-001", "Alice");
        BankAccount b3 = new BankAccount("ACC-002", "Bob", 5000.75);

        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
    }
}
