import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        } else {
            System.out.println("Invalid withdraw amount.");
            return false;
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("\nATM Menu:");
                   System.out.println("1. Check Balance");
              System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
              System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    account.checkBalance();
                    break;
                case "2":
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = Double.parseDouble(scanner.nextLine());
                    account.deposit(depositAmount);
                    break;
                case "3":
                    System.out.print("Enter withdrawal amount: ");
                       double withdrawalAmount = Double.parseDouble(scanner.nextLine());
                        account.withdraw(withdrawalAmount);
                    break;
                case "4":
                    System.out.println("Thank you for using the ATM");
                       scanner.close();
                    return;
                default:
                       System.out.println("Invalid option.  try again.");
            }
        }
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(6000.00);
        ATM atm = new ATM(account);
        atm.start();
    }
}

