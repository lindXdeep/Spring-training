package lindx.spring.core.Lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parent {
    private String name;
    private Child child;

    @Autowired
    public Parent(@Value(value = "batya") String name, Child child) {
        this.name = name;
        this.child = child;
    }
}
