package pl.Szymanek.Classes;

import pl.Szymanek.Interfaces.ICount;
import pl.Szymanek.Interfaces.IPrintInfo;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Squad implements ICount, IPrintInfo {
    private String nameOfSquad;
    private int numberOfSquad;
    private List<Soldier> commanders;
    private List<Soldier> soldierList;
    private Map<Vehicle,Integer> vehicleCountMap;

    public Squad() {
    }

    public Squad(String nameOfSquad, int numberOfSquad, List<Soldier> commanders, List<Soldier> soldierList) {
        this.nameOfSquad = nameOfSquad;
        this.numberOfSquad = numberOfSquad;
        this.commanders = commanders;
        this.soldierList = soldierList;
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


    @Override
    public String toString() {
        return "Squad{" +
                "nameOfSquad='" + nameOfSquad + '\'' +
                ", numberOfSquad=" + numberOfSquad +
                ", commanders=" + commanders +
                ", soldierList=" + soldierList +
                ", vehicleCountMap=" + vehicleCountMap +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Squad squad = (Squad) o;
        return numberOfSquad == squad.numberOfSquad && Objects.equals(nameOfSquad, squad.nameOfSquad) && Objects.equals(commanders, squad.commanders) && Objects.equals(soldierList, squad.soldierList) && Objects.equals(vehicleCountMap, squad.vehicleCountMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSquad, numberOfSquad, commanders, soldierList, vehicleCountMap);
    }

    @Override
    public int count() {
        int count=0;
            int commandersInSoliderList= isAllCommanderInSoldierList();
            if(commandersInSoliderList==commanders.size())
                return soldierList.size();
            count=soldierList.size()+commanders.size()-commandersInSoliderList;
            return count;
    }

    public int isAllCommanderInSoldierList(){
        int count=0;
        if(soldierList.size()==0 || commanders.size()==0)
            throw new NullPointerException();
        for(Soldier s:soldierList) {
            for (Soldier commander : commanders) {
                if (commander.equals(s)) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public void printInfo() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("commanders of Squad: ");
        for(Soldier s:commanders){
            stringBuilder.append(s.getFirstName()).append(" ").append(s.getLastName()).append(" ");
        }
        System.out.println("Squad: "+numberOfSquad+" "+nameOfSquad+" " +stringBuilder.toString() + "amount:"+count());
    }
}
