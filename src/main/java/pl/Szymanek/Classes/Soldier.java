package pl.Szymanek.Classes;

import pl.Szymanek.Enums.Rank;

import java.time.LocalDate;
import java.util.Objects;

public class Soldier {
    private String firstName;
    private String lastName;
    private LocalDate birthdayDate;
    private Address address;
    private Rank rank;
    private Equipment equipment;

    public Soldier() {
    }

    public Soldier(String firstName, String lastName, LocalDate birthdayDate, Address address, Rank rank, Equipment equipment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayDate = birthdayDate;
        this.address = address;
        this.rank = rank;
        this.equipment = equipment;
    }

    public Soldier(String firstName, String lastName, LocalDate birthdayDate, Address address, Rank rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayDate = birthdayDate;
        this.address = address;
        this.rank = rank;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(LocalDate birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }


    public static String MapDoubleToSting(int i){
        String k=i+"ok";
        String s=Integer.toString(i);
        return k;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdayDate=" + birthdayDate +
                ", address=" + address +
                ", rank=" + rank +
                ", equipment=" + equipment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldier soldier = (Soldier) o;
        return Objects.equals(firstName, soldier.firstName) && Objects.equals(lastName, soldier.lastName) && Objects.equals(birthdayDate, soldier.birthdayDate) && Objects.equals(address, soldier.address) && rank == soldier.rank && Objects.equals(equipment, soldier.equipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthdayDate, address, rank, equipment);
    }
}
