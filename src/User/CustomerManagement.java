package User;
import java.util.ArrayList;

import java.util.List;

public class CustomerManagement implements UserManagement{
    private List<User> userdatabase = new ArrayList<User>();
    @Override
    public void addUser(User user) {
        this.userdatabase.add(user);
    }

    @Override
    public void removeUser(String username) {
        if(this.verifyUser(username)){
            int index = this.getIndex(username);
            this.userdatabase.remove(index);
        }
        else{
            System.out.println("User does not exist");
        }

    }

    @Override
    public int getIndex(String username) {
        if(this.verifyUser(username)){
            for(int index = 0; index < this.userdatabase.size(); index++) {
                if (this.userdatabase.get(index).getUsername() == username) {
                    return index;
                }
            }
        }
        System.out.println("Error: User does not exist");
        return -1;
    }

    @Override
    public boolean verifyUser(String username) {
        if(this.userdatabase.get(0) == null){
            return false;
        }
        for(int index = 0; index < this.userdatabase.size(); index++){
            if(this.userdatabase.get(index).getUsername() == username){
                return true;
            }
        }
        return false;
    }



    @Override
    public User getUser(String username) {
        if(this.verifyUser(username)){
            int index = this.getIndex(username);
            return this.userdatabase.get(index);
        }
        else{
            System.out.println("Error: User " + username + " does not exist.");
            return null;
        }
    }
}
