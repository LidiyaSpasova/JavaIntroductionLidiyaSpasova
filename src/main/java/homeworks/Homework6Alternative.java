package homeworks;

public class Homework6Alternative {
    public static void main(String[] args) {

        System.out.println(isValidPassword("hhjksdhfkdfl89"));
        System.out.println(isValidPassword("Pa$$w0rd"));
    }
        public static boolean isValidPassword(String password){
            String regex = "\\A(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}\\z";
            return password.matches(regex);
        }
    }

