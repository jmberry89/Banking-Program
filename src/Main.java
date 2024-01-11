import Account.*;

public class Main{
    public static void main(String[] args){
       // BankingSystem bankingSystem = new BankingSystem();
      //  bankingSystem.start();
        AccountActions test = new AccountActions();

        CheckingAccount account1 = new CheckingAccount(100, 100);

        test.getAccountInfo(account1);
        test.fundDeposit(account1, 100);
        test.getAccountInfo(account1);
        test.fundWithdraw(account1, 50);
        test.getAccountInfo(account1);

    }
}
