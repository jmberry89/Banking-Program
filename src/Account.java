public abstract class Account {

    private String userName = null;

    private int accNum = 0;

    private float accBalance = 0;

    private String accType = null;

    public Account(String userName, int accNum, float accBalance){
        this.userName = userName;
        this.accNum = accNum;
        this.accBalance = accBalance;
    }

    public void getInfo(){

    }

    public void deposit(float input){
        this.accBalance += input;
    }

    public void withdraw(float input){
        this.accBalance -= input;
    }
}
