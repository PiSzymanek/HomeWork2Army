package pl.Szymanek;

import java.util.List;

public class Tank extends Vehicle{
    private double caliber;
    private String ammunitionType;
    private TypeOfTank typeOfTank;


    public Tank(String model, List<Soldier> listOfCrew, double caliber, String ammunitionType, TypeOfTank typeOfTank) {
        super(model, listOfCrew);
        this.caliber = caliber;
        this.ammunitionType = ammunitionType;
        this.typeOfTank = typeOfTank;
    }
}
