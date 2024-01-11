package Account;

public class SavingsAccount implements Account {
    private float accountBalance = 0;
    private int accountNum = 0;
    private final String accountType = "Savings";

    public SavingsAccount(int accountNum, float accountBalance){
        this.accountNum = accountNum;
        this.accountBalance = accountBalance;
    }

    @Override
    public float getBalance() {
        return this.accountBalance;
    }

    @Override
    public int getAccountNumber() {
        return this.accountNum;
    }

    @Override
    public String getAccountType() {
        return accountType;
    }

    @Override
    public void withdraw(float amount) {
        if(this.accountBalance - amount >=  0){
            this.accountBalance -= amount;
        }
        else{
            System.out.println("Error: Insufficient funds.");
        }

    }

    @Override
    public void deposit(float amount) {
        this.accountBalance += amount;
    }
}
