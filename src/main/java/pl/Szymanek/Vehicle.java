package pl.Szymanek;

import java.util.List;

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
}
