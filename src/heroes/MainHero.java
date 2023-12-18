package heroes;

import exceptions.KnowledgeNotFoundException;
import interfaces.Climb;
import interfaces.Explore;
import interfaces.Knowledge;
import interfaces.SetAGoal;
import places.GeographicNames;
import places.Place;

public class MainHero extends Traveller implements SetAGoal, Climb, Explore {
    public MainHero() {
        super("главный герой");
    }
    public void knowSomething(Knowledge knowledge) {
        System.out.println(knowledge.what() + setGoal());
    }
    static class Thought {
        private final String thoughtMessage;
        public String getThoughtMessage() {
            return thoughtMessage;
        }
        public Thought(String thoughtMessage) {
            this.thoughtMessage = thoughtMessage;
        }
    }
    public GeographicNames destined() {
        Thought thought = new Thought("Итак, нам суждено было попасть в " + new Place() {
            @Override
            public String description() {
                return "самое таинственное, жуткое и зловещее место на " + GeographicNames.EARTH + ". И самое древнее.";
            }
        }.description());
        System.out.println(thought.getThoughtMessage());
        return GeographicNames.HIGHLANDS;
    }
    public void almostBelieve(GeographicNames geographicNames1, GeographicNames geographicNames2) throws KnowledgeNotFoundException {
        if (geographicNames1.equals(GeographicNames.HIGHLANDS) && geographicNames2.equals(GeographicNames.LENG)) {
            System.out.println("Мы почти поверили, что" + geographicNames1 + "и есть" + geographicNames2);
        } else {
            throw new KnowledgeNotFoundException("путешественники не думали об этом");
        }
    }

}
