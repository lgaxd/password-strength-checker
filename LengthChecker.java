public class LengthChecker extends PasswordStrengthCheckerHandler {

    @Override
    public boolean checkPassword(String password) {
        if (password.length() >= 8) {
            return checkNext(password);
        }
        System.out.println("Password is too short. Minimum 8 characters required.");
        return false;
    }
}