package pl.Szymanek.Classes;

import pl.Szymanek.Interfaces.ICount;

import java.util.List;
import java.util.Objects;

public class Brigade implements ICount {
    private String nameOfBrigade;
    private int numberOfBrigade;
    private List<Soldier> commanders;
    private List<Regiment> regiment;

    public Brigade() {
    }

    public Brigade(String nameOfBrigade, int numberOfBrigade, List<Soldier> commanders, List<Regiment> regiment) {
        this.nameOfBrigade = nameOfBrigade;
        this.numberOfBrigade = numberOfBrigade;
        this.commanders = commanders;
        this.regiment = regiment;
    }

    public String getNameOfBrigade() {
        return nameOfBrigade;
    }

    public void setNameOfBrigade(String nameOfBrigade) {
        this.nameOfBrigade = nameOfBrigade;
    }

    public int getNumberOfBrigade() {
        return numberOfBrigade;
    }

    public void setNumberOfBrigade(int numberOfBrigade) {
        this.numberOfBrigade = numberOfBrigade;
    }

    public List<Regiment> getRegiment() {
        return regiment;
    }

    public void setRegiment(List<Regiment> regiment) {
        this.regiment = regiment;
    }

    public List<Soldier> getCommanders() {
        return commanders;
    }

    public void setCommanders(List<Soldier> commanders) {
        this.commanders = commanders;
    }

    @Override
    public String toString() {
        return "Brigade{" +
                "nameOfBrigade='" + nameOfBrigade + '\'' +
                ", numberOfBrigade=" + numberOfBrigade +
                ", regiment=" + regiment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brigade brigade = (Brigade) o;
        return numberOfBrigade == brigade.numberOfBrigade && Objects.equals(nameOfBrigade, brigade.nameOfBrigade) && Objects.equals(regiment, brigade.regiment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBrigade, numberOfBrigade, regiment);
    }

    @Override
    public int count() {
        int count = 0;
        for (Regiment regiment1 : regiment) {
            count += regiment1.count();
        }
        count += commanders.size();
        return count;
    }
}

