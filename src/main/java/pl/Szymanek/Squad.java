package pl.Szymanek;

import java.util.List;
import java.util.Map;

public class Squad {
    private String nameOfSquad;
    private int numberOfSquad;
    private List<Soldier> commanders;
    private List<Soldier> soldierList;
    private Map<Vehicle,Integer> vehicleCountMap;

    public Squad() {
    }

    public Squad(String nameOfSquad, int numberOfSquad, List<Soldier> commanders, List<Soldier> soldierList, Map<Vehicle, Integer> vehicleCountMap) {
        this.nameOfSquad = nameOfSquad;
        this.numberOfSquad = numberOfSquad;
        this.commanders = commanders;
        this.soldierList = soldierList;
        this.vehicleCountMap = vehicleCountMap;
    }

    public String getNameOfSquad() {
        return nameOfSquad;
    }

    public void setNameOfSquad(String nameOfSquad) {
        this.nameOfSquad = nameOfSquad;
    }

    public int getNumberOfSquad() {
        return numberOfSquad;
    }

    public void setNumberOfSquad(int numberOfSquad) {
        this.numberOfSquad = numberOfSquad;
    }

    public List<Soldier> getCommanders() {
        return commanders;
    }

    public void setCommanders(List<Soldier> commanders) {
        this.commanders = commanders;
    }

    public List<Soldier> getSoldierList() {
        return soldierList;
    }

    public void setSoldierList(List<Soldier> soldierList) {
        this.soldierList = soldierList;
    }

    public Map<Vehicle, Integer> getVehicleCountMap() {
        return vehicleCountMap;
    }

    public void setVehicleCountMap(Map<Vehicle, Integer> vehicleCountMap) {
        this.vehicleCountMap = vehicleCountMap;
    }
}
