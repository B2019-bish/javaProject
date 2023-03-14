package ClassesAndObjects;
import java.util.Scanner;

public class SocialMediaUser {


    String username;
    String password;
    String email;
    String firstName;
    String lastName;
    int age;


    public void setUsername(String username){
        if(username.length() <= 16 && !username.contains(" ")){
            this.username = username;
            System.out.println("Username successfully created. ");
        }
        else{

            if(username.length() > 16){
                System.out.println("ERROR : username must be less than 16 characters. ");
            }

            else if(username.contains(" ")){
                System.out.println("ERROR : username can not contain an empty space. ");
            }

        }

    }


    public void setPassword(String password) {
        String lowerCase = "[a-z]";
        String upperCase = "[A-Z]";
        String digits = "[0-9]";
        String specialCharacters = "[&<>*@|\",./';){}\\[\\]^$-=!#()%+|?/~_]";

        if(password.length() >= 8 && password.length() <= 16 && password.matches(lowerCase) && password.matches(upperCase)
                && password.matches(digits) && password.matches(specialCharacters)){
                this.password = password;
                System.out.println("Password is successfully created. ");
        }

        else{
            if(password.length() < 8 || password.length() > 16){
                System.out.println("ERROR : Your password must be 8 - 16 characters. ");
            }
            else if(!password.matches(lowerCase)){
                System.out.println("ERROR : Your password must contain at least one lower case letter. ");
            }
            else if(!password.matches(upperCase)){
                System.out.println("ERROR : Your password must contain at least one upper case letter. ");
            }
            else if(!password.matches(digits)){
                System.out.println("ERROR : Your password must contain at least one digit. ");
            }
            else if(!password.matches(specialCharacters)){
                System.out.println("ERROR : Your password must contain at least one ");
            }
        }

    }

    public void setEmail(String email){
        if(email.contains("@") && email.contains(".") && email.length() > 0 && email.length() < 32){
            this.email = email;
        }
        else{
            if(!email.contains("@"))
                System.out.println("ERROR : Your email must contain @ sign ");
            else if(!email.contains("."))
                System.out.println("ERROR : Your email must contain .(dot)");
            else if(email.length() <= 0 || email.length() >= 32)
                System.out.println("ERROR : Your email must not be empty and must be less than 32 characters ");
        }
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
        else{
            System.out.println("ERROR : Your age must be more than 0 ");
        }

    }
    public boolean login(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            System.out.println("You successfully logged in. ");
            return true;
        }
        else{
            if(!this.username.equals(username)){
                System.out.println("ERROR : wrong username ");
            }
            else if(!this.password.equals(password)){
                System.out.println("ERROR : wrong password ");
            }
            return false;
        }
    }

    public void resetPassword(String password){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your previous password : ");
        password = scanner.nextLine();
        if(this.password.equals(password)){
            System.out.print("Enter your new password : ");
            this.password = scanner.nextLine();
        }
    }

    public void getFullName(){
        System.out.println(this.firstName + " " + this.lastName);
    }

    public boolean isAdult(){
        if(age >= 18)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {

        SocialMediaUser user1 = new SocialMediaUser();

        user1.setUsername("begzaa");
        user1.setPassword("Since1992");
        user1.getFullName();
    }

}
