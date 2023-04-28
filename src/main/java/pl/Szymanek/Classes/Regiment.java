package pl.Szymanek.Classes;

import pl.Szymanek.Interfaces.ICount;

import java.util.List;
import java.util.Objects;

public class Regiment implements ICount {
    private String nameOfRegiment;
    private int numberOfRegiment;
    private List<Soldier> commanders;
    private List<Battalion> battalion;

    public Regiment() {
    }

    public Regiment(String nameOfRegiment, int numberOfRegiment, List<Soldier> commanders, List<Battalion> battalion) {
        this.nameOfRegiment = nameOfRegiment;
        this.numberOfRegiment = numberOfRegiment;
        this.commanders = commanders;
        this.battalion = battalion;
    }

    public String getNameOfRegiment() {
        return nameOfRegiment;
    }

    public void setNameOfRegiment(String nameOfRegiment) {
        this.nameOfRegiment = nameOfRegiment;
    }

    public int getNumberOfRegiment() {
        return numberOfRegiment;
    }

    public void setNumberOfRegiment(int numberOfRegiment) {
        this.numberOfRegiment = numberOfRegiment;
    }

    public List<Soldier> getCommanders() {
        return commanders;
    }

    public void setCommanders(List<Soldier> commanders) {
        this.commanders = commanders;
    }

    public List<Battalion> getBattalion() {
        return battalion;
    }

    public void setBattalion(List<Battalion> battalion) {
        this.battalion = battalion;
    }

    @Override
    public String toString() {
        return "Regiment{" +
                "nameOfRegiment='" + nameOfRegiment + '\'' +
                ", numberOfRegiment=" + numberOfRegiment +
                ", commanders=" + commanders +
                ", battalion=" + battalion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Regiment regiment = (Regiment) o;
        return numberOfRegiment == regiment.numberOfRegiment && Objects.equals(nameOfRegiment, regiment.nameOfRegiment) && Objects.equals(commanders, regiment.commanders) && Objects.equals(battalion, regiment.battalion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRegiment, numberOfRegiment, commanders, battalion);
    }

    @Override
    public int count() {
        int count = 0;
        for (Battalion battalion1 : battalion) {
            count += battalion1.count();
        }
        count += commanders.size();
        return count;
    }
}
