package user;

public interface User {
    String getUsername();
    String getFirstname();
    String getLastname();
    boolean passwordCheck(String password);


}
