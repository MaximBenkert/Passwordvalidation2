public class Passwordvalidation2 {

    public static void main(String[] args) {
        System.out.println(passwordValidation("ölfklajdfl9akjsdf"));
    }
    public static String passwordValidation (String password) {

        if (!passwordLength(password) && !containsDigit(password)){
            return "your password must contain at least 8 characters and 1 digit";
        }
        if (!containsDigit(password))
        {
            return "your password must contain at least digit";
        }
        if (!passwordLength(password)){
            return "your password must contain at least 8 characters";
        }else {
            return "your password is valid";
        }

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
