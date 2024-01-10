package Account;

public interface Account {
  float getBalance();
  int getAccountNumber();
  String getAccountType();
  void Withdraw(float amount);
  void Deposit(float amount);
}
