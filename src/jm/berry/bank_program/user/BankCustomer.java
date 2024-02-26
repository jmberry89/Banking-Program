package user;

public class BankCustomer implements User {
    private String username = null;
    private String firstname = null;
    private String lastname = null;
    private String password = null;

    public BankCustomer(String username, String firstname, String lastname, String password){
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
    }
    @Override
    public String getUsername(){
        return this.username;
    }

    @Override
    public String getFirstname() {
        return this.firstname;
    }

    @Override
    public String getLastname() {
        return this.lastname;
    }

    @Override
    public boolean passwordCheck(String password) {
        if (this.password == password){
            return true;
        }
        else {
            return false;
        }
    }
}
