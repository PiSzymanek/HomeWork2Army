package pl.Szymanek;

public enum TypeOfDivision {
    ARTILLERY("artillery"),AIRCAVALRY("airCavalry"),AIRDEFENSE("airDefense"),MISSILE("missile"),INFANTRY("infantry"),MOUNTAININFANTRY("mountainInfantry"),MARINE("marine"),AIRBORNE("airborne"),MECHANIZED("mechanized"),MOTORIZED("motorized");
    private final String type;

    TypeOfDivision(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
