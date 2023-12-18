package heroes;

import java.util.Objects;

public abstract class Traveller {
    private final String name;
    public String getName() {
        return name;
    }
    public Traveller(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Traveller traveller = (Traveller) o;
        return Objects.equals(name, traveller.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public String toString() {
        return name;
    }
}
