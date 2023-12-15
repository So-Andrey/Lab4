package heroes;

public abstract class Traveller {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void travel() {
        System.out.println(name + " путешествует");
    }
    public Traveller(String name) {
        this.name = name;
    }
}
