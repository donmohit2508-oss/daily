package MiniProject;

class Account {
    private int accountNumber;
    private String holderName;
    protected double balance;

    Account(int accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        }else{
            System.out.println("Invalid Amount");
        }
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal: " + amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }
    void showBalance(){
        System.out.println("Balance: " + balance);
    }
}

//saving account

class SavingAccount extends Account{
    SavingAccount(int accountNumber , String holderName , double balance){
        super (accountNumber, holderName, balance);
    }
    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Saving withdrawal: " + amount);
        }else{
            System.out.println("Saving Account : insufficient balance");
        }
    }
}

//current Account

class CurrentAccount extends Account{
    private double overdraftLimit = 5000;
    CurrentAccount(int accountNumber , String holderName , double balance){
        super (accountNumber, holderName, balance);
    }
    void withdraw(double amount){
        if(amount <= balance + overdraftLimit){
            balance -= amount;
            System.out.println("Current withdrawal: " + amount);
        }else{
            System.out.println("Withdrawal limit exceeded");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingAccount saving = new SavingAccount(101 , "Mohit" , 5000);
        CurrentAccount current = new CurrentAccount(102 , "Sujit" , 1000);

        //Saving

        saving.deposit(2000);
        saving.withdraw(3000);
        saving.showBalance();

        System.out.println();

        //current

        current.deposit(2000);
        current.withdraw(3000);
        current.showBalance();



    }
}
