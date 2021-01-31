package lindx.spring.core.beans;

public class Address {
    private String street;
    private String numderOFHouse;

    public String getNumderOFHouse() {
        return this.numderOFHouse;
    }

    public void setNumderOFHouse(String numderOFHouse) {
        this.numderOFHouse = numderOFHouse;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "{" +
            " street='" + getStreet() + "'" +
            ", numderOFHouse='" + getNumderOFHouse() + "'" +
            "}";
    }
}
