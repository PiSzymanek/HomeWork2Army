package pl.Szymanek;

import java.util.List;

public class Regiment {
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
}
