package places;

import heroes.NecronomiconCreator;

public enum GeographicNames {
    EARTH("Земле"),
    LENG(" то самое легендарное плато Ленг, средоточие зла" + NecronomiconCreator.evenHimFairs()),
    SEA(" у моря Уэдделла "),
    SOUTH_POLAR_CIRCLE("Южного полярного круга."),
    RIDGE(" невысоким кряжем "),
    SEA_COAST(" закованное льдом морское побережье."),
    CONTINENT(" весь континент."),
    COORDINATES_82S_60E(" 82' южной широты, 60' восточной долготы "),
    COORDINATES_70S_115E(" 70' южной широты, 115' восточной долготы "),
    HIGHLANDS(" мрачное нагорье ");
    private final String name;
    GeographicNames(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
