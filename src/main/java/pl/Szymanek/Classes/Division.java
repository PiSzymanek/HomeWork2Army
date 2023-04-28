package pl.Szymanek.Classes;

import pl.Szymanek.Interfaces.ICount;
import pl.Szymanek.Enums.TypeOfDivision;

import java.util.List;
import java.util.Objects;

public class Division implements ICount {
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


    @Override
    public String toString() {
        return "Division{" +
                "nameOfDivision='" + nameOfDivision + '\'' +
                ", numberOfDivision=" + numberOfDivision +
                ", commanders=" + commanders +
                ", brigade=" + brigade +
                ", typeOfDivision=" + typeOfDivision +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Division division = (Division) o;
        return numberOfDivision == division.numberOfDivision && Objects.equals(nameOfDivision, division.nameOfDivision) && Objects.equals(commanders, division.commanders) && Objects.equals(brigade, division.brigade) && typeOfDivision == division.typeOfDivision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfDivision, numberOfDivision, commanders, brigade, typeOfDivision);
    }

    @Override
    public int count() {
        int count = 0;
        for (Brigade brigade1 : brigade) {
            count += brigade1.count();
        }
        count+=commanders.size();
        return count;
    }
}
