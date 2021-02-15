package lindx.spring.core.beans;

import java.util.List;

public class Person {
    private String name;
    private List<String> workPalace;


    public Person() {
    }

    public Person(String name, List<String> workPalace) {
        this.name = name;
        this.workPalace = workPalace;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getWorkPalace() {
        return this.workPalace;
    }

    public void setWorkPalace(List<String> workPalace) {
        this.workPalace = workPalace;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", workPalace='" + getWorkPalace() + "'" +
            "}";
    }
}
