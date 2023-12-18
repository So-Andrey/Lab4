package places;

import exceptions.HouseIsLockedException;
import interfaces.Knowledge;

import java.util.Random;

public class House {
    private final String name;
    private boolean isLocked;
    private final HouseLastCorner houseLastCorner;
    private final Knowledge knowledge = new Knowledge() {
        @Override
        public String what() {
            return "То, что нам удалось здесь узнать, ";
        }
    };
    public Knowledge getKnowledge() {
        return knowledge;
    }
    public void checkLocked() {
        try {
            if (isLocked) {
                throw new HouseIsLockedException("герои не могут попасть внутрь");
            }
        } catch (HouseIsLockedException houseIsLockedException) {
            System.out.println(houseIsLockedException.getMessage());
            System.out.println("Герои открывают дом. \nНачало повествования от лица главного героя. \n");
            isLocked = false;
        }
    }
    @Override
    public String toString() {
        return name;
    }
    public House() {
        this.name = "Этот дом";
        houseLastCorner = new HouseLastCorner();
        isLocked = new Random().nextBoolean();
    }
    private class HouseLastCorner {
        private String getCorner() {
            return " последнего уголка";
        }
    }
    public String untilLastCorner() {
        return "до" + houseLastCorner.getCorner();
    }
}
