import java.util.Scanner;

public class BankingSystem  {

    public void start(){
        System.out.println("Welcome to Banks United Through Trusted Stonks.");

        boolean run = true;

        while(run) {
            //handle user input
            try {
                Scanner userInput = new Scanner(System.in);
                System.out.println("Please select one of the following options using the numbers 1, 2, or 3:  ");
                System.out.println("1. Login");
                System.out.println("2. Create new user");
                System.out.println("3. Exit app");
                int answer = Integer.parseInt(userInput.nextLine());

                switch (answer) {

                    case 1:
                        System.out.println("Login");
                        break;

                    case 2:
                        System.out.println("Create new user");
                        break;

                    case 3:
                        System.out.println("Exiting app.");
                        run = false;
                        break;

                    default:
                        System.out.println("Invalid input");


                }
            }catch(NumberFormatException e){
                System.out.println("Invalid input");
            }
        }
    }
}
