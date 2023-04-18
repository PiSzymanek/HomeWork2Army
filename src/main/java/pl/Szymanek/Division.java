package pl.Szymanek;

import java.util.List;

public class Division {
    private String nameOfDivision;
    private int numberOfDivision;
    private List<Soldier> commanders;
    private List<Brigade> brigade;
    private TypeOfDivision typeOfDivision;

    public Division() {
    }
    public Division(String nameOfDivision, int numberOfDivision, List<Soldier> commanders, List<Brigade> brigade, TypeOfDivision typeOfDivision) {
        this.nameOfDivision = nameOfDivision;
        this.numberOfDivision = numberOfDivision;
        this.commanders = commanders;
        this.brigade = brigade;
        this.typeOfDivision = typeOfDivision;
    }

    public String getNameOfDivision() {
        return nameOfDivision;
    }

    public void setNameOfDivision(String nameOfDivision) {
        this.nameOfDivision = nameOfDivision;
    }

    public int getNumberOfDivision() {
        return numberOfDivision;
    }

    public void setNumberOfDivision(int numberOfDivision) {
        this.numberOfDivision = numberOfDivision;
    }

    public List<Soldier> getCommanders() {
        return commanders;
    }

    public void setCommanders(List<Soldier> commanders) {
        this.commanders = commanders;
    }

    public List<Brigade> getBrigade() {
        return brigade;
    }

    public void setBrigade(List<Brigade> brigade) {
        this.brigade = brigade;
    }

    public TypeOfDivision getTypeOfDivision() {
        return typeOfDivision;
    }

    public void setTypeOfDivision(TypeOfDivision typeOfDivision) {
        this.typeOfDivision = typeOfDivision;
    }
}
