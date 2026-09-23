import java.util.Scanner;
public class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit() {

        System.out.print("Enter the amount of money you are depositing 💰: ");
        Scanner inDepMoney = new Scanner(System.in);
        double depMoney = inDepMoney.nextDouble();
        System.out.println("You have deposited $" + depMoney + " 🤩");
        System.out.println();

        System.out.println("Your account balance is $" + (balance + depMoney) + " 💹");
        System.out.println();
    }

    public void withdraw() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Balance: " + balance);


        System.out.println();
        System.out.print("Enter the amount of money you are withdrawing 💸: ");
        Scanner inWithMoney = new Scanner(System.in);
        double withMoney = inWithMoney.nextDouble();
        System.out.println("You have withdrawn $" + withMoney + " 🙂");
        System.out.println();

        System.out.println("Your account balance is $" + (balance - withMoney) + " 🫰");
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1, "Kavindu Darshana", 1000000.00);

        account1.withdraw();
        account1.deposit();

        BankAccount account2 = new BankAccount(2, "Imesh Kavinda", 100000);
        account2.withdraw();
        account2.deposit();

        BankAccount account3 = new BankAccount(3, "Naween Madhumal", 124582.00);

        account3.withdraw();
        account3.deposit();

        BankAccount account4 = new BankAccount(4, "Kalana Kularathne", 958625.00);

        account4.withdraw();
        account4.deposit();

        BankAccount account5 = new BankAccount(5, "Thilini Jayawickrama", 254685.00);

        account5.withdraw();
        account5.deposit();

        BankAccount account6 = new BankAccount(6, "Ashan Shanaka", 425876.00);

        account6.withdraw();
        account6.deposit();

    }


}