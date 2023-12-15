package exceptions;

public class KhowlegeNotFoundException extends Exception {
    public KhowlegeNotFoundException(String parameter) {
        super("Знание не найдено (" + parameter + ")");
    }
}
