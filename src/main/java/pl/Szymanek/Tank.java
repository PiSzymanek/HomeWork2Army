package pl.Szymanek;

import java.util.List;
import java.util.Objects;

public class Tank extends Vehicle{
    private double caliber;
    private String ammunitionType;
    private TypeOfTank typeOfTank;


    public Tank(String model, List<Soldier> listOfCrew, double caliber, String ammunitionType, TypeOfTank typeOfTank) {
        super(model, listOfCrew);
        this.caliber = caliber;
        this.ammunitionType = ammunitionType;
        this.typeOfTank = typeOfTank;
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    public String getAmmunitionType() {
        return ammunitionType;
    }

    public void setAmmunitionType(String ammunitionType) {
        this.ammunitionType = ammunitionType;
    }

    public TypeOfTank getTypeOfTank() {
        return typeOfTank;
    }

    public void setTypeOfTank(TypeOfTank typeOfTank) {
        this.typeOfTank = typeOfTank;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "caliber=" + caliber +
                ", ammunitionType='" + ammunitionType + '\'' +
                ", typeOfTank=" + typeOfTank +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tank tank = (Tank) o;
        return Double.compare(tank.caliber, caliber) == 0 && Objects.equals(ammunitionType, tank.ammunitionType) && typeOfTank == tank.typeOfTank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), caliber, ammunitionType, typeOfTank);
    }
}
