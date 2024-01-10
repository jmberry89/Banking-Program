package Account;

public class CheckingAccount implements Account{
    private float accountBalance = 0;
    private int accountNum = 0;
    private final String accountType = "Checking";

    public CheckingAccount(int accountNum, float accountBalance){
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
        return this.accountType;
    }

    @Override
    public void Withdraw(float amount) {

    }

    @Override
    public void Deposit(float amount) {

    }
}
