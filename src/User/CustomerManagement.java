package User;

import java.util.List;

public class CustomerManagement implements UserManagement{
    private List<User> userdatabase;
    @Override
    public void addUser(User user) {
        this.userdatabase.add(user);
    }

    @Override
    public void removeUser() {

    }

    @Override
    public int findUser(String username) {
        int index = 0;
        while(this.userdatabase.get(index).getUsername()!= username){

        }
        return index;
    }
}
