package exceptions;

public class KnowledgeNotFoundException extends IllegalArgumentException {
    public KnowledgeNotFoundException(String parameter) {
        super("Знание не найдено (" + parameter + ").");
    }
}
