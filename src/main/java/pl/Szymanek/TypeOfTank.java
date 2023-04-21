package pl.Szymanek;

public enum TypeOfTank {
    LIGHT("Light"),MEDIUM("Medium"),HEAVY("Heavy");
    private final String type;

    TypeOfTank(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
