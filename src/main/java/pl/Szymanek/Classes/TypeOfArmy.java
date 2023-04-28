package pl.Szymanek.Classes;

import pl.Szymanek.Interfaces.ICount;

import java.util.List;
import java.util.Objects;

public class TypeOfArmy implements ICount {
    private String nameOfType; //here like  landArmy,airForce,navy,specialForces,etc
    private List<Soldier> commanders;
    private List<Division> divisionList;

    public TypeOfArmy() {
    }

    public TypeOfArmy(String nameOfType, List<Soldier> commanders, List<Division> divisionList) {
        this.nameOfType = nameOfType;
        this.commanders = commanders;
        this.divisionList = divisionList;
    }


    public String getNameOfType() {
        return nameOfType;
    }

    public void setNameOfType(String nameOfType) {
        this.nameOfType = nameOfType;
    }

    public List<Soldier> getCommanders() {
        return commanders;
    }

    public void setCommanders(List<Soldier> commanders) {
        this.commanders = commanders;
    }

    public List<Division> getDivisionList() {
        return divisionList;
    }

    public void setDivisionList(List<Division> divisionList) {
        this.divisionList = divisionList;
    }

    @Override
    public String toString() {
        return "TypeOfArmy{" +
                "nameOfType='" + nameOfType + '\'' +
                ", commanders=" + commanders +
                ", divisionList=" + divisionList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeOfArmy that = (TypeOfArmy) o;
        return Objects.equals(nameOfType, that.nameOfType) && Objects.equals(commanders, that.commanders) && Objects.equals(divisionList, that.divisionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfType, commanders, divisionList);
    }

    @Override
    public int count() {
        int count = 0;
        for (Division division1 : divisionList) {
            count += division1.count();
        }
        count += commanders.size();
        return count;
    }

}
