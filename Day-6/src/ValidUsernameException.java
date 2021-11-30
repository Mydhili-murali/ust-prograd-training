public class ValidUsernameException extends Exception {
    int usernameCondition = 0;
    public ValidUsernameException(int invalidUserName){
        super("Invalid Username: ");
        usernameCondition = invalidUserName;
    }
    public String printMessage(){
        switch(usernameCondition){
            case 1: return ("A username must be of length 6-15 characters");

            case 2: return ("A username must start with an uppercase English alphabet A to Z");

            case 3: return ("There cannot be any types of parentheses or whitespaces in a valid username");

            default: return ("No Exception");
        }
    }
}

class UsernameValidator {
    public void isValid(String username) throws ValidUsernameException {
        if (username.length()<6 || username.length()>15 ){
            throw new ValidUsernameException(1);
        }
        if (username.contains(" ") || username.contains("{") || username.contains("}") || username.contains("(") || username.contains(")") || username.contains("[") || username.contains("]") ){
            throw new ValidUsernameException(3);
        }
        if (username.charAt(0) > 'a' && username.charAt(0)<'z'){
            throw new ValidUsernameException(2);
        }
    }
}