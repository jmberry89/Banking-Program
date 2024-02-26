package account;

public interface Account {
  float getBalance();
  int getAccountNumber();
  String getAccountType();
  void withdraw(float amount);
  void deposit(float amount);
}
