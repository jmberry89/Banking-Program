package User;

public interface UserManagement {
    void addUser(User user);
    void removeUser();
    int findUser(String username);
}
