import java.util.Scanner;

public class PasswordStrengthChecker {

    public static String password;

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Please type your password:");

            PasswordStrengthChecker.password = scanner.nextLine();
            
        }

        LengthChecker lengthChecker = new LengthChecker();
        SpecialCharacterChecker specialCharacterChecker = new SpecialCharacterChecker();
        UppercaseChecker uppercaseChecker = new UppercaseChecker();
        NumbersChecker numberChecker = new NumbersChecker();

        lengthChecker.setNextHandler(specialCharacterChecker);
        specialCharacterChecker.setNextHandler(uppercaseChecker);
        uppercaseChecker.setNextHandler(numberChecker);

        boolean isPasswordStrong = lengthChecker.checkPassword(password);

        if (isPasswordStrong) {
            System.out.println("Password is strong!");
        } else {
            System.out.println("Password is weak!");
        }


    }
}