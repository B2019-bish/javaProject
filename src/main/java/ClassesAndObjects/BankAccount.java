package ClassesAndObjects;

public class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;
    double dailyLimit = 5000;
    double dailyWithdrownAmount = 0;

    public void deposit(double a){
        balance += a;
    }

    public void setAccountNumber(String accountNumber){
        boolean isValidAccountNumber = true;

        if(accountNumber.length() == 8){
            for (int i = 0; i < 8; i++) {
                if(!Character.isDigit(accountNumber.charAt(i))){
                    System.out.println("Warning : The account number must only contain digits. ");
                    isValidAccountNumber = false;
                    break;
                }
                
            }

        }
        else{
            isValidAccountNumber =false;
        }

        if(isValidAccountNumber){
            this.accountNumber = accountNumber;
        }
        else{
            System.out.println("Failure : The provided account number is not valid");
        }

    }

    public void setAccountHolderName(String accountHolderName){
        boolean isValidAccountHolderName = true;

        if(accountHolderName.equals(null) || accountHolderName.isEmpty() || accountHolderName.trim().length() == 0 ||
                accountHolderName.length() > 256){
            isValidAccountHolderName = false;
        }

        if(isValidAccountHolderName){
            System.out.println("Success. Account holder name is valid");
            this.accountHolderName = accountHolderName;
        }
        else{
            System.out.println("Failure. Account holder name must not be empty or more than 256 letters.");
        }

    }

    public boolean withdraw(double amount){
        if (balance >= amount && amount >= 1 && amount < dailyLimit) {
            System.out.println("Transaction is approved. Withdrawing " + amount + "$. ");
            balance -= amount;
            dailyLimit -= amount;
            return true;
        }
        else{
            if(amount > balance)
                System.out.println("Insufficient fund.");
            else if(amount < 1)
                System.out.println("Invalid withdraw.");
            else if(amount > dailyLimit)
                System.out.println("Your wanted withdraw amount exceeds your daily limit.");
            return false;
        }

    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        String str = "Account holder's name : " + accountHolderName + "\n" + ". Account Number : " + accountNumber + "\n"
            + ". Current balance" + balance + "\n" + ". Today's withdrew : " + dailyWithdrownAmount;
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }


    public static void main(String[] args) {
        BankAccount client1 = new BankAccount();
        BankAccount client2 = new BankAccount();

        client1.setAccountNumber("12345678");
        client2.setAccountNumber("123456789");

        client1.setAccountHolderName("John Wick");
        client1.setAccountHolderName("      ");
    }

}
