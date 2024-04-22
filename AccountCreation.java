package accountcreation;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
public class AccountCreation {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //Prompt the user to create an account by entering username, password, first name,and last name
            System.out.println("To create an account, please enter the following");
            
            //First name
            System.out.println("Enter First Name (REQUIRED): ");
            String firstName = scanner.nextLine();
            
            //Check first name conditions and output messages based on the conditions
            if (firstName.isEmpty()) {
                System.out.println("First name is required, please enter first name");
            }
            else {
                System.out.println("First name is successfully captured");
            }
            
            //Last name
            System.out.println("Enter Last Name (REQUIRED): ");
            String lastName = scanner.nextLine();
            
            //Check last name conditions and output messages based on the conditions
            if (lastName.isEmpty()) {
                System.out.println("Last name is required, please enter last name");
            }
            else {
                System.out.println("Last name is successfully captured");
            }
            
            //Username
            System.out.println("Enter Username(MUST contain an underscore and be no more"
                    +" than 5 characters): ");
            String userName = scanner.nextLine();
            
            //Check username conditions,and output messages based on the conditions
            if (isUsernameValid(userName)){
                System.out.println("Username is successfully captured");
            }
            else {
                System.out.println("Username is not correctly formatted, please ensure"
                    + " that your username contains an underscore and is no more than"
                    + " 5 characters in length !");
            }
            
            //Password
            System.out.println("Enter Password(MUST be at least 8 characters, contain a"
                    +" capital letter, a number, and a special character): ");
            String passWord = scanner.nextLine();
            
            //Check password conditions,and output messages based on the conditions
            if (isPasswordValid(passWord)){
                System.out.println("Password is successfully captured");
            }
            else {
                System.out.println("Password is not correctly formatted, please ensure"
                    + " that your password contains at least 8 characters, a capital"
                    + " letter, a number and a special character !");
            }
            
            //Account Registration
            if (isUsernameValid(userName) && isPasswordValid(passWord)) {
               System.out.println("You have successfully created an account");
            }
            else {
                System.out.println("You have failed to create an account, Please enter valid information !!");
            }
        }  
    }
    
    // Call this method to check if the username meets conditions
    private static boolean isUsernameValid(String userName){
        return userName.length()<= 5 && userName.contains("_");
    }
    
    // Call this method to check if the password meets conditions
    private static boolean isPasswordValid(String passWord) {
        String passwordPattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
        return Pattern.compile(passwordPattern).matcher(passWord).matches();
    }      
}
    

