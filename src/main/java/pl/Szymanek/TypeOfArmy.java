package pl.Szymanek;

import java.util.List;

public class TypeOfArmy {
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
}
