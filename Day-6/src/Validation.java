import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String name = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        UsernameValidator usernameValidator = new UsernameValidator();
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            usernameValidator.isValid(name);
            passwordValidator.isValidPassword(password,name);

        }catch (ValidUsernameException v){
            System.out.println(v.printMessage());
        } catch (ValidPasswordException ve){
            System.out.println(ve.printMessagePassword());
        }


    }
}