package pl.Szymanek;

import java.util.List;

public class Company {
    private String nameOfCompany;
    private int numberOfCompany;
    private List<Soldier> commanders;
    private List<Platoon> platoon;

    public Company() {
    }

    public Company(String nameOfCompany, int numberOfCompany, List<Soldier> commanders, List<Platoon> platoon) {
        this.nameOfCompany = nameOfCompany;
        this.numberOfCompany = numberOfCompany;
        this.commanders = commanders;
        this.platoon = platoon;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public int getNumberOfCompany() {
        return numberOfCompany;
    }

    public void setNumberOfCompany(int numberOfCompany) {
        this.numberOfCompany = numberOfCompany;
    }

    public List<Soldier> getCommanders() {
        return commanders;
    }

    public void setCommanders(List<Soldier> commanders) {
        this.commanders = commanders;
    }

    public List<Platoon> getPlatoon() {
        return platoon;
    }

    public void setPlatoon(List<Platoon> platoon) {
        this.platoon = platoon;
    }
}
