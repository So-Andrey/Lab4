package interfaces;

public interface SetAGoal {
    default String setGoal() {
        return "поставило перед нами новую цель.";
    }
}
