package places;

public class Mountains {
    private final String name = " горная цепь ";
    private final String status = "Грандиозная";
    private final String length = "была невероятно, умопомрачительно длинна, ";
    private final TheHighestRange theHighestRange = new TheHighestRange();
    public void description() {
        System.out.println(status +
                name +
                length +
                "зарождаясь" + GeographicNames.RIDGE +
                "на " + GeographicNames.EARTH + GeographicNames.SEA +
                "и пересекая" + GeographicNames.CONTINENT +
                "\n" + theHighestRange.formsArch());
    }
    private class TheHighestRange {
        private final String name = "Наиболее высокий массив ";
        class Arch {
            private final String name = " величественную арку ";
            private String location() {
                return "между" + GeographicNames.COORDINATES_82S_60E + "и" + GeographicNames.COORDINATES_70S_115E;
            }
            private String handleConcaveSide() {
                return ", вогнутой стороной обращенную к " + new Place() {
                    @Override
                    public String description() {
                        return "нашему лагерю, ";
                    }
                }.description();
            }
            private String restOnesEnd() {
                return "а одним концом упиравшуюся в" + GeographicNames.SEA_COAST;
            }
        }
        private final Arch arch = new Arch();
        private String formsArch() {
            return name + "образовывал" + arch.name + arch.location() + arch.handleConcaveSide() + arch.restOnesEnd();
        }
    }
}
