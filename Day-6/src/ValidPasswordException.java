public class ValidPasswordException extends  Exception{
    int passwordCondition = 0;
    public ValidPasswordException (int invalidPassword){
        super("Invalid Password");
        passwordCondition = invalidPassword;
    }
    public String printMessagePassword(){
        switch (passwordCondition){
            case 1: return ("A password must not be shorter than 8 characters but must not exceed 256");

            case 2: return ("There cannot be any types of parentheses or whitespaces in a valid Password");

            case 3: return ("A password cannot contain or be the same as its associated username");

            default: return ("No Exception");
        }
    }
}
class PasswordValidator{
    public void isValidPassword(String password, String name) throws ValidPasswordException{
        if(password.length()<8 || password.length()>256){
            throw new ValidPasswordException(1);
        }
        if (password.contains(" ") || password.contains("{") || password.contains("}") || password.contains("(") || password.contains(")") || password.contains("[") || password.contains("]") ){
            throw new ValidPasswordException(2);
        }
        if (password.equals(name)){
            throw new ValidPasswordException(3);
        }
    }
}
