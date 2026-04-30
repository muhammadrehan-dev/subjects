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

    // Parameterized constructor (2 params) - balance defaults to 0.0
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
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : Rs. " + balance);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Default constructor
        BankAccount b1 = new BankAccount();

        // 2-param constructor
        BankAccount b2 = new BankAccount("HBL-10234", "Zainab Hussain");

        // 3-param constructor
        BankAccount b3 = new BankAccount("MCB-50871", "Sana Rehman", 75000.50);

        // Extra accounts
        BankAccount b4 = new BankAccount("UBL-30912", "Maryam Nawaz", 120000.00);

        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
        b4.displayInfo();
    }
}
