package transport.driver;

public class StringUtils {

    private StringUtils() {}

    public static boolean isNullOrEmpty(String s) {
        return  s != null || !s.isEmpty();
    }
}