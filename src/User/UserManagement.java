package User;

public interface UserManagement {
    void addUser(User user);
    void removeUser(String username);
    int getIndex(String username);
    boolean verifyUser(String username);
    User getUser(String username);
}
