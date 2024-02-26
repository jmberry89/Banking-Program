import java.util.Scanner;

public class CreateNewUser {
    private String username = null;
    private String firstname = null;
    private String lastname = null;
    private String password = null;

    Scanner userInput;

    public CreateNewUser(){

    }

    public void userInput(){
        userInput = new Scanner(System.in);
        System.out.println("Enter a username:");
        this.username = userInput.nextLine();

        System.out.println("Enter your first name:");
        this.firstname = userInput.nextLine();

        System.out.println("Enter your last name:");
        this.lastname = userInput.nextLine();

        System.out.println("Enter a password:");
        this.password = userInput.nextLine();
        
    }
    public String getUsername(){
        return this.username;
    }
    public String getFirstname() {
        return this.firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    public String getPassword() {
        return this.password;
    }
}
