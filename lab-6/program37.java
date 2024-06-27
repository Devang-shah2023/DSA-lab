import java.util.Scanner;

class BankAccount {
    public String accountNumber;
    public double balance;
    public String accountHolderName;

    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdraw amount. Check your balance.");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class program37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of bank accounts: ");
        int numberOfAccounts = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        BankAccount[] accounts = new BankAccount[numberOfAccounts];

        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.print("Enter account number for account " + (i + 1) + ": ");
            String accountNumber = scanner.nextLine();
            System.out.print("Enter initial balance for account " + (i + 1) + ": ");
            double balance = scanner.nextDouble();
            scanner.nextLine();  
            System.out.print("Enter account holder name for account " + (i + 1) + ": ");
            String accountHolderName = scanner.nextLine();

            accounts[i] = new BankAccount(accountNumber, balance, accountHolderName);
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nBank Account Management System");
            System.out.println("1. Display account details");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter account number to display details: ");
                    String accountNumber = scanner.nextLine();
                    BankAccount account = findAccount(accounts, accountNumber);
                    if (account != null) {
                        account.displayAccountDetails();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter account number to deposit money: ");
                    accountNumber = scanner.nextLine();
                    account = findAccount(accounts, accountNumber);
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        account.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number to withdraw money: ");
                    accountNumber = scanner.nextLine();
                    account = findAccount(accounts, accountNumber);
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        account.withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number to check balance: ");
                    accountNumber = scanner.nextLine();
                    account = findAccount(accounts, accountNumber);
                    if (account != null) {
                        System.out.println("Current balance: $" + account.checkBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }

        scanner.close();
    }

    private static BankAccount findAccount(BankAccount[] accounts, String accountNumber) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }
}
