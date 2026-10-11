package LAB4.t3;

public class Authenticator {

    private String[] logins = {"admin", "user"};
    private String[] passwords = {"1234", "qwerty"};

    public boolean check(String login, String password) {
        for (int i = 0; i < logins.length; i++) {
            if (logins[i].equals(login) && passwords[i].equals(password)) {
                return true;
            }
        }
        return false;
    }
}
