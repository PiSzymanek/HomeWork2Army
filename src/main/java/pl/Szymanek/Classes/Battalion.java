package pl.Szymanek.Classes;

import pl.Szymanek.Interfaces.ICount;

import java.util.List;
import java.util.Objects;

public class Battalion implements ICount {
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

    @Override
    public String toString() {
        return "Battalion{" +
                "nameOfBattalion='" + nameOfBattalion + '\'' +
                ", numberOfBattalion=" + numberOfBattalion +
                ", commanders=" + commanders +
                ", company=" + company +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battalion battalion = (Battalion) o;
        return numberOfBattalion == battalion.numberOfBattalion && Objects.equals(nameOfBattalion, battalion.nameOfBattalion) && Objects.equals(commanders, battalion.commanders) && Objects.equals(company, battalion.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBattalion, numberOfBattalion, commanders, company);
    }

    @Override
    public int count() {
        int count = 0;
        for (Company company1 : company) {
            count += company1.count();
        }
        count += commanders.size();
        return count;
    }
}
