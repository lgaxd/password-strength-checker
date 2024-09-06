public class SpecialCharacterChecker extends PasswordStrengthCheckerHandler {

    @Override
    public boolean checkPassword(String password) {
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return checkNext(password);
        }
        System.out.println("Password must contain at least one special character.");
        return false;
    }
    
}
