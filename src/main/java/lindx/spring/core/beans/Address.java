package lindx.spring.core.beans;

public class Address {
    private String street;
    private int numderOFHouse;

    public Address(String street, int numderOFHouse) {
        this.street = street;
        this.numderOFHouse = numderOFHouse;
    }

    public int getNumderOFHouse() {
        return this.numderOFHouse;
    }

    public void setNumderOFHouse(int numderOFHouse) {
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
