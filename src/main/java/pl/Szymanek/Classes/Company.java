package pl.Szymanek.Classes;

import pl.Szymanek.Interfaces.ICount;

import java.util.List;
import java.util.Objects;

public class Company implements ICount {
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


    @Override
    public String toString() {
        return "Company{" +
                "nameOfCompany='" + nameOfCompany + '\'' +
                ", numberOfCompany=" + numberOfCompany +
                ", commanders=" + commanders +
                ", platoon=" + platoon +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return numberOfCompany == company.numberOfCompany && Objects.equals(nameOfCompany, company.nameOfCompany) && Objects.equals(commanders, company.commanders) && Objects.equals(platoon, company.platoon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfCompany, numberOfCompany, commanders, platoon);
    }

    @Override
    public int count() {
        int count = 0;
        for (Platoon platoon1 : platoon) {
            count += platoon1.count();
        }
        count+=commanders.size();
        return count;
    }
}
