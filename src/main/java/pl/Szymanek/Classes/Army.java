package pl.Szymanek.Classes;

import pl.Szymanek.Interfaces.ICount;

import java.util.List;
import java.util.Objects;

public class Army implements ICount {
    private Soldier president;
    private List<TypeOfArmy> typeOfArmy;            //we have landArmy,airForce,navy,specialForces,etc


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


    @Override
    public String toString() {
        return "Army{" +
                "president=" + president +
                ", typeOfArmy=" + typeOfArmy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Army army = (Army) o;
        return Objects.equals(president, army.president) && Objects.equals(typeOfArmy, army.typeOfArmy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(president, typeOfArmy);
    }

    @Override
    public int count() {
        int count = 0;
        for (TypeOfArmy typeOfArmy1 : typeOfArmy) {
            count += typeOfArmy1.count();
        }
        count += 1;
        return count;
    }
}
