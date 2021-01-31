package lindx.spring.core.beans;

public class House {
    private int humberOfFlors;
    private int numderOfFlats;
    private Address address;
    
    public int getHumberOfFlors() {
        return this.humberOfFlors;
    }

    public void setHumberOfFlors(int humberOfFlors) {
        this.humberOfFlors = humberOfFlors;
    }

    public int getNumderOfFlats() {
        return this.numderOfFlats;
    }

    public void setNumderOfFlats(int numderOfFlats) {
        this.numderOfFlats = numderOfFlats;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }  

    @Override
    public String toString() {
        return "{" +
            " humberOfFlors='" + getHumberOfFlors() + "'" +
            ", numderOfFlats='" + getNumderOfFlats() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }
}
