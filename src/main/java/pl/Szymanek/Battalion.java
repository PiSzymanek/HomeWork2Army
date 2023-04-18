package pl.Szymanek;

import java.util.List;

public class Battalion {
    private String nameOfBattalion;
    private int numberOfBattalion;
    private List<Soldier> commanders;
    private List<Company> company;


    public Battalion() {
    }

    public Battalion(String nameOfBattalion, int numberOfBattalion, List<Soldier> commanders, List<Company> company) {
        this.nameOfBattalion = nameOfBattalion;
        this.numberOfBattalion = numberOfBattalion;
        this.commanders = commanders;
        this.company = company;
    }

    public String getNameOfBattalion() {
        return nameOfBattalion;
    }

    public void setNameOfBattalion(String nameOfBattalion) {
        this.nameOfBattalion = nameOfBattalion;
    }

    public int getNumberOfBattalion() {
        return numberOfBattalion;
    }

    public void setNumberOfBattalion(int numberOfBattalion) {
        this.numberOfBattalion = numberOfBattalion;
    }

    public List<Soldier> getCommanders() {
        return commanders;
    }

    public void setCommanders(List<Soldier> commanders) {
        this.commanders = commanders;
    }

    public List<Company> getCompany() {
        return company;
    }

    public void setCompany(List<Company> company) {
        this.company = company;
    }
}
