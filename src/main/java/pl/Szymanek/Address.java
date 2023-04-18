package pl.Szymanek;

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
}
