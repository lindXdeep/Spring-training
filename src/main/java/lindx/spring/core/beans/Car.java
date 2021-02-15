package lindx.spring.core.beans;

import java.util.List;

public class Car {

    private int speed;
     
    private String mark;

    private List<String> countries;

    
    public Car() {
    }

    public Car(int speed, String mark) {
        this.speed = speed;
        this.mark = mark;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMark() {
        return this.mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public List<String> getCountries() {
        return this.countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "{" +
            " speed='" + getSpeed() + "'" +
            ", mark='" + getMark() + "'" +
            ", countries='" + getCountries() + "'" +
            "}";
    }
}
