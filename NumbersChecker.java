public class NumbersChecker extends PasswordStrengthCheckerHandler {

    @Override
    public boolean checkPassword(String password) {
        if (password.matches(".*[0-9].*")) {
            return checkNext(password);
        }
        System.out.println("Password must contain at least one number.");
        return false;
    }
    
}
