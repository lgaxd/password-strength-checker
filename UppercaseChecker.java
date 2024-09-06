public class UppercaseChecker extends PasswordStrengthCheckerHandler {

    @Override
    public boolean checkPassword(String password) {
        if (password.matches(".*[A-Z].*")) {
            return checkNext(password);
        }
        System.out.println("Password must contain at least one uppercase letter.");
        return false;
    }
    
}
