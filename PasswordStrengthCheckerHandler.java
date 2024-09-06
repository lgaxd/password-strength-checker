public abstract class PasswordStrengthCheckerHandler {

    protected PasswordStrengthCheckerHandler nextHandler;

    public void setNextHandler(PasswordStrengthCheckerHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean checkPassword(String password);

    protected boolean checkNext(String password) {
        if (nextHandler == null) {
            return true;
        }
        return nextHandler.checkPassword(password);
    }
    
}
