package pl.Szymanek.Classes;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private String buildNumber;
    private String postmanCode;

    public Address() {
    }

    public Address(String city, String street, String buildNumber, String postmanCode) {
        this.city = city;
        this.street = street;
        this.buildNumber = buildNumber;
        this.postmanCode = postmanCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getPostmanCode() {
        return postmanCode;
    }

    public void setPostmanCode(String postmanCode) {
        this.postmanCode = postmanCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildNumber='" + buildNumber + '\'' +
                ", postmanCode='" + postmanCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(buildNumber, address.buildNumber) && Objects.equals(postmanCode, address.postmanCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, buildNumber, postmanCode);
    }
}
