package heroes;

import interfaces.BeInsane;

public class Creator implements BeInsane {
    private String name;
    public Creator(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String wasCreating() {
        return "творил";
    }
    public String wasWriting() {
        return "писал";
    }
    public String knowALot() {
        return "много знает";
    }
    @Override
    public void beInsane(String supplier) {
        BeInsane.super.beInsane(supplier);
    }
}
