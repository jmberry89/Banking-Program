package account;

public class AccountActions {
    public void fundTransfer(Account withdraw, Account deposit){

    }

    public void fundDeposit(Account account, float amount){
        account.deposit(amount);
    }

    public void fundWithdraw(Account account, float amount){
        account.withdraw(amount);
    }

    public void getAccountInfo(Account account){
        System.out.println(account.getAccountType() + " account");
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
    }
}
