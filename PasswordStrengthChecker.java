import java.util.Scanner;

public class PasswordStrengthChecker {

    private static final String specialCharacters = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";
    private static final String numbers = "0123456789";

    public String strengthChecker(String password) {
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasNumbers = false;
        boolean hasSpecialCharacters = false;

        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (numbers.indexOf(ch) >= 0) {
                hasNumbers = true;
            } else if (specialCharacters.indexOf(ch) >= 0) {
                hasSpecialCharacters = true;
            }
        }

        if (password.length() < 8) {
            return "---------- Very Weak - Password is too short. Minimum 8 characters required.";
        } else if (hasLowercase && !hasUppercase && !hasNumbers && !hasSpecialCharacters) {
            return "##------ Weak - Only lowercase letters.";
        } else if (hasLowercase && hasUppercase && !hasNumbers && !hasSpecialCharacters) {
            return "####---- Medium - Uppercase and lowercase letters.";
        } else if (hasLowercase && hasUppercase && hasNumbers && !hasSpecialCharacters) {
            return "######-- Strong - Uppercase, lowercase letters, and numbers.";
        } else if (hasLowercase && hasUppercase && hasNumbers && hasSpecialCharacters) {
            return "######## Very Strong - Uppercase, lowercase letters, numbers, and special characters.";
        } else {
            return "Weak password: The password does not meet the minimum requirements.";
        }
    }

    public static void main(String[] args) {

        PasswordStrengthChecker checker = new PasswordStrengthChecker();

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Please type your password:");

            String password = scanner.nextLine();

            System.out.println(checker.strengthChecker(password));
            
        }
    }
}