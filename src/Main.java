import exceptions.KnowledgeNotFoundException;
import heroes.MainHero;
import heroes.UilksAndMauson;
import places.GeographicNames;
import places.House;
import places.Mountains;

public class Main {
    public static void main(String[] args) {
        MainHero mainHero = new MainHero();
        House house = new House();
        house.checkLocked();
        System.out.println(house + mainHero.climb() + "и" + mainHero.explore() + house.untilLastCorner() + ".");
        mainHero.knowSomething(house.getKnowledge());
        try {
            mainHero.almostBelieve(mainHero.destined(), Math.random() < 0.3 ? GeographicNames.HIGHLANDS : GeographicNames.LENG);
        } catch (KnowledgeNotFoundException knowledgeNotFoundException) {
            System.err.println(knowledgeNotFoundException.getMessage());
            return;
        }
        new Mountains().description();
        new UilksAndMauson().seeTheMountains(GeographicNames.SOUTH_POLAR_CIRCLE);
    }
}