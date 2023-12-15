package interfaces;

public interface BeInsane {
    default void beInsane(String supplier) {
        System.out.println(supplier + " безумен");
    }
}
