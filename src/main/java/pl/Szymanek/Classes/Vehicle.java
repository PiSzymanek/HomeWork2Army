package pl.Szymanek.Classes;

import java.util.List;
import java.util.Objects;

public class Vehicle {
    private String model;

    private List<Soldier> listOfCrew;

    public Vehicle() {
    }

    public Vehicle(String model, List<Soldier> listOfCrew) {
        this.model = model;
        this.listOfCrew = listOfCrew;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Soldier> getListOfCrew() {
        return listOfCrew;
    }

    public void setListOfCrew(List<Soldier> listOfCrew) {
        this.listOfCrew = listOfCrew;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", listOfCrew=" + listOfCrew +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(model, vehicle.model) && Objects.equals(listOfCrew, vehicle.listOfCrew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, listOfCrew);
    }
}
