package pl.Szymanek;

import java.util.List;

public class Army {
    private Soldier president;
    private List<TypeOfArmy> typeOfArmy;//we have landArmy,airForce,navy,specialForces,etc


    public Army() {
    }

    public Army(Soldier president, List<TypeOfArmy> typeOfArmy) {
        this.president = president;
        this.typeOfArmy = typeOfArmy;
    }

    public Soldier getPresident() {
        return president;
    }

    public void setPresident(Soldier president) {
        this.president = president;
    }

    public List<TypeOfArmy> getTypeOfArmy() {
        return typeOfArmy;
    }

    public void setTypeOfArmy(List<TypeOfArmy> typeOfArmy) {
        this.typeOfArmy = typeOfArmy;
    }
}
