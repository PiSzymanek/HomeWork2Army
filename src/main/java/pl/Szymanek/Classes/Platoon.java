package pl.Szymanek.Classes;

import pl.Szymanek.Interfaces.ICount;
import pl.Szymanek.Interfaces.IPrintInfo;

import java.util.List;
import java.util.Objects;

public class Platoon implements ICount, IPrintInfo {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platoon platoon = (Platoon) o;
        return numberOfPlatoon == platoon.numberOfPlatoon && Objects.equals(nameOfPlatoon, platoon.nameOfPlatoon) && Objects.equals(commanders, platoon.commanders) && Objects.equals(squad, platoon.squad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfPlatoon, numberOfPlatoon, commanders, squad);
    }

    @Override
    public int count() {
        int count = 0;
        for (Squad squad1 : squad) {
            count += squad1.count();
        }
        count+=commanders.size();
        return count;
    }

    @Override
    public void printInfo() {
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append("commanders of Platoon: ");
            for(Soldier s:commanders){
                stringBuilder.append(s.getFirstName()).append(" ").append(s.getLastName()).append(" ");
            }
            System.out.println("Platoon: "+numberOfPlatoon+" "+nameOfPlatoon+" " +stringBuilder.toString() + "amount:"+count());

        for(Squad s:squad){
            s.printInfo();
        }
    }
}
