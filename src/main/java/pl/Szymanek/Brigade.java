package pl.Szymanek;

public class Brigade {
    private String nameOfBrigade;
    private int numberOfBrigade;
     private Regiment regiment;

    public Brigade() {
    }

    public Brigade(String nameOfBrigade, int numberOfBrigade, Regiment regiment) {
        this.nameOfBrigade = nameOfBrigade;
        this.numberOfBrigade = numberOfBrigade;
        this.regiment = regiment;
    }

    public String getNameOfBrigade() {
        return nameOfBrigade;
    }

    public void setNameOfBrigade(String nameOfBrigade) {
        this.nameOfBrigade = nameOfBrigade;
    }

    public int getNumberOfBrigade() {
        return numberOfBrigade;
    }

    public void setNumberOfBrigade(int numberOfBrigade) {
        this.numberOfBrigade = numberOfBrigade;
    }

    public Regiment getRegiment() {
        return regiment;
    }

    public void setRegiment(Regiment regiment) {
        this.regiment = regiment;
    }
}

