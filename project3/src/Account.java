public class Account {
    private int balance;
    private int accountNumber;

    public static int numberOfAccounts = 1000;

    public Account(int initDeposit){
        balance = initDeposit;
        numberOfAccounts++;
        accountNumber = numberOfAccounts;
    }

    public void deposit(int money){
        balance = balance + money;
        System.out.println("You deposited: $" + money);
        System.out.println("Updated balance: $" + balance);
    }

    public void withdraw(int money){
        if(money > balance){
            System.out.println("Insufficient funds");
        }
        else{
            balance = balance - money;
            System.out.println("You withdrew: $" + money);
            System.out.println("Updated balance: $" + balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString(){
        return String.format("Account Number: %d Balance: %d\n", accountNumber, balance);
    }


}
