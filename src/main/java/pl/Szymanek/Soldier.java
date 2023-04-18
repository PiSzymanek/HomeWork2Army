package pl.Szymanek;

import java.time.LocalDate;

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
}
