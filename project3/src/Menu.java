import java.util.Scanner;
public class Menu {
    Scanner scnr = new Scanner(System.in);
    Bank bank = new Bank();
    public void runMenu(){
        while(true) {
            System.out.println("***** MENU *****");
            System.out.println("1) Access account");
            System.out.println("2) Open new account");
            System.out.println("3) Close all accounts");
            System.out.println("4) Exit");
            int choice = scnr.nextInt();
            if(choice == 1){
                accessAccount();
            }
            else if (choice == 2 ) {
                openNewAccount();
            }
            else if(choice == 3){
                closeAllAccounts();
            }
            else if(choice == 4){
                break;
            }
            else{
                System.out.println("Invalid entry");
            }
        }
    }

    private void accessAccount(){
        System.out.println("Enter customer pin: ");
        int pin = scnr.nextInt();
        if(bank.getCustomer(pin) == null){
            System.out.println("PIN is not valid");
            return;
        }
        else{
            Customer customer = bank.getCustomer(pin);
            System.out.println(customer.getAllAccounts());
            System.out.println("Which account would you like to access: ");
            int acctNum = scnr.nextInt();
            if(customer.getAccount(acctNum) == null){
                System.out.println("Account number invalid.");
                return;
            }
            else{
                Account account = customer.getAccount(acctNum);
                while (true){
                    System.out.println("Please make a selection: ");
                    System.out.println("1) Make deposit");
                    System.out.println("2) Make withdrawal");
                    System.out.println("3) See balance");
                    System.out.println("4) Close account");
                    System.out.println("5) Exit");
                    int choice = scnr.nextInt();
                    if(choice == 1){
                        System.out.println("Enter deposit amount: ");
                        int amount = scnr.nextInt();
                        account.deposit(amount);
                    }
                    else if (choice == 2 ) {
                        System.out.println("Enter withdrawal amount: ");
                        int amount = scnr.nextInt();
                        account.withdraw(amount);
                    }
                    else if(choice == 3){
                        System.out.println(account.toString());
                    }
                    else if(choice == 4){
                        customer.removeAccount(account);
                        System.out.println("Account number " + acctNum + " removed");
                        break;
                    }
                    else if(choice ==5){
                        break;
                    }
                    else{
                        System.out.println("Invalid entry");
                    }
                }
            }
        }

    }
    private void openNewAccount(){
        System.out.println("Is the account for a new customer?");
        System.out.println("1) Yes, this is for a new customer");
        System.out.println("2) No, this customer already exists");
        int selection = scnr.nextInt();
        Customer customer = null;
        if(selection == 1){
             customer = createNewCustomer();
        }
        else if(selection == 2){
            System.out.println("Enter pin number: ");
            int pin = scnr.nextInt();
            if(bank.getCustomer(pin) == null){
                System.out.println("Customer not found");
                return;
            }
            else{
                customer = bank.getCustomer(pin);

            }
        }
        else{
            System.out.println("Not an option");
            return;
        }
        System.out.println("Enter initial deposit: ");
        int deposit = scnr.nextInt();
        Account account = new Account(deposit);
        customer.addAccount(account);
        System.out.println("New account opened. Account number: " + account.getAccountNumber());
    }
    private Customer createNewCustomer(){
        System.out.println("Creating new customer. First name: ");
        String first = scnr.next();
        System.out.println("Last name: ");
        String last = scnr.next();
        System.out.println("Enter 4 digit PIN: ");
        int pin = scnr.nextInt();
        while(pin < 1000 || pin > 9999){
            System.out.println("Not valid PIN. Enter 4 digit PIN: ");
            pin = scnr.nextInt();
        }
        Customer customer = new Customer(first, last, pin);
        bank.addCustomer(customer);
        return customer;
    }
    private void closeAllAccounts(){
        System.out.println("Enter PIN of customer whose accounts you want to close: ");
        int pin = scnr.nextInt();
        if(bank.getCustomer(pin) == null){
            System.out.println("Customer not found");
            return;
        }
        else{
            Customer customer = bank.getCustomer(pin);
            bank.removeCustomer(customer);
            System.out.println("Customer has been removed from bank registry");
        }
    }
}
