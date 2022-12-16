public class Data {
    private static final String VALID_CHARACTERS = "abcdefjhigklmnopqrstuvwxyzABCDEFJHIGKLMNOPQRSTUVWXYZ0123456789_";

    private Data() {}

    public static boolean validate(String login , String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
        public static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (!validate(login)) {
            throw new WrongLoginException("Логин неправильный");
        }
        if(!validate(password)) {
            throw new WrongPasswordException("Пароль неправильный");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль должен совпадать");
        }
    }

    private static boolean validate(String s) {
        if(s.length() > 20) {
            return false;
        }
        for(int i = 0; i < s.length() ; i++) {
            if(!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        boolean log = Data.validate("tes!!t", "test", "test");
        if(log) {
            System.out.println("Данные правильные");
        } else {
            System.out.println("Данные неправильные");
        }
    }
}

