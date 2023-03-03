public class Passwordvalidation2 {

    public static void main(String[] args) {
        System.out.println(passwordValidation("AADFDFSDSFASDF5"));
    }

    public static String passwordValidation(String password) {

        if (!passwordLength(password) && !containsDigit(password)) {
            return "your password must contain at least 8 characters and 1 digit";
        }
        if (!containsDigit(password)) {
            return "your password must contain at least 1 digit";
        }
        if (!passwordLength(password)) {
            return "your password must contain at least 8 characters";
        }
        if (!isStringLowerCase(password)){
                return "your password must contain at least 1 lower case character";
        }
        return "your password is valid";
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

    private static boolean isStringLowerCase(String password) {

        //convert String to char array
        char[] charArray = password.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            //if any character is not in lower case, return false
            if (!Character.isLowerCase(charArray[i]))
                return false;
        }

        return true;

    }
}
