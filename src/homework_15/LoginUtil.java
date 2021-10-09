package homework_15;

import java.util.HashMap;
import java.util.Map;

public class LoginUtil {
    private static Map<String, String> loginData = new HashMap<>();

    static {
        loginData.put("WhiteOcean", "bigFish");
        loginData.put("Drakula", "nosferatu");
    }

    static boolean isUserAuthentic(String login, String password, String confirmPassword) {
        if (login != null && password != null) {
            if (password.equals(confirmPassword)) {
                return true;
            }
        }
        if (loginData.containsKey(login)) {
            return true;
        }
        try {
            isLoginValid(login);
            isPasswordValid(password);
        } catch (WrongLoginException | WrongPasswordException exception) {
            return false;
        }

        return false;
    }

    private static void isLoginValid(String login) throws WrongLoginException {
        if (!(login.length() > 0 && login.length() < 20) || !login.matches("^[a-zA-Z0-9]+$")) {
            throw new WrongLoginException("Login is incorrect");
        }
    }

    private static void isPasswordValid(String password) throws WrongPasswordException {
        if (!(password.length() < 20) || (!password.matches("^[a-zA-Z0-9]+$"))) {
            throw new WrongPasswordException("Password is incorrect");
        }
    }
}
