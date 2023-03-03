public class Passwordvalidation2 {

    public static void main(String[] args) {
        System.out.println(passwordValidation("ölkdjfd8"));
    }
    public static boolean passwordValidation (String password) {
        return (passwordLength(password) && containsDigit(password));
    }
    public static boolean passwordLength(String password) {
        return password.length() >= 8;
    }
    public static boolean containsDigit(String password) {

            for (int i = 0; i < password.length(); ++i) {
                if (Character.isDigit(password.charAt(i))) {
                    return true;
                }
            }
            return false;

    }
}
