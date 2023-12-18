package heroes;

import exceptions.KnowledgeNotFoundException;
import places.GeographicNames;

public class UilksAndMauson {
    private final String name = "Уилкс и Маусон ";
    public void seeTheMountains(GeographicNames where) {
        try {
            if (where.equals(GeographicNames.SOUTH_POLAR_CIRCLE)) {
                System.out.println(name + "видели эти горы на широте " + where);
            } else {
                throw new KnowledgeNotFoundException(name + "видели горы не оттуда");
            }
        } catch(KnowledgeNotFoundException knowledgeNotFoundException) {
            System.out.println(knowledgeNotFoundException.getMessage());
        }
    }
}
