package exceptions;

public class HouseIsLockedException extends Exception {
    public HouseIsLockedException(String parameter) {
        super("Дом закрыт (" + parameter + ")");
    }
}
