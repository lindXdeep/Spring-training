package lindx.spring.core.Lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parent {
    private String name;
    private Child child;

    public Parent(@Value(value = "batya") String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child getChild() {
        return this.child;
    }
    @Autowired
    public void setChild(Child child) {
        this.child = child;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", child='" + getChild() + "'" +
            "}";
    }

}

