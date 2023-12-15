package interfaces;

public interface SetAGoal {
    default void setGoal(String supplier,String goal) {
        System.out.println(supplier + " ставит цель " + goal);
    }
}
