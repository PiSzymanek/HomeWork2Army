package pl.Szymanek;

import java.util.List;

public class Vehicle {
    private String model;
    private String type; //can be enum
    private List<Soldier> listOfCrew;

    public Vehicle() {
    }

    public Vehicle(String model, String type, List<Soldier> listOfCrew) {
        this.model = model;
        this.type = type;
        this.listOfCrew = listOfCrew;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Soldier> getListOfCrew() {
        return listOfCrew;
    }

    public void setListOfCrew(List<Soldier> listOfCrew) {
        this.listOfCrew = listOfCrew;
    }
}
