package pl.Szymanek;

import java.util.List;

public class Platoon {
    private String nameOfPlatoon;
    private int numberOfPlatoon;
    private List<Soldier> commanders;
    private List<Squad> squad;

    public Platoon() {
    }

    public Platoon(String nameOfPlatoon, int numberOfPlatoon, List<Soldier> commanders, List<Squad> squad) {
        this.nameOfPlatoon = nameOfPlatoon;
        this.numberOfPlatoon = numberOfPlatoon;
        this.commanders = commanders;
        this.squad = squad;
    }

    public String getNameOfPlatoon() {
        return nameOfPlatoon;
    }

    public void setNameOfPlatoon(String nameOfPlatoon) {
        this.nameOfPlatoon = nameOfPlatoon;
    }

    public int getNumberOfPlatoon() {
        return numberOfPlatoon;
    }

    public void setNumberOfPlatoon(int numberOfPlatoon) {
        this.numberOfPlatoon = numberOfPlatoon;
    }

    public List<Soldier> getCommanders() {
        return commanders;
    }

    public void setCommanders(List<Soldier> commanders) {
        this.commanders = commanders;
    }

    public List<Squad> getSquad() {
        return squad;
    }

    public void setSquad(List<Squad> squad) {
        this.squad = squad;
    }
}
