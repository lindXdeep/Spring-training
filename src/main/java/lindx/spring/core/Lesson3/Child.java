package lindx.spring.core.Lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lindx.spring.core.reflect.context.Component;

@Component
public class Child {

    private String name;
    private Parent parent;

    public Child( @Value(value = "Billy") String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parent getParent() {
        return this.parent;
    }

    @Autowired
    public void setParent(Parent parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", parent='" + getParent() + "'" +
            "}";
    }

}
