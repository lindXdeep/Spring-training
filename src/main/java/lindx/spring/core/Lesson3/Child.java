package lindx.spring.core.Lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lindx.spring.core.reflect.context.Component;

@Component
public class Child {

    private String name;
    private Parent parent;

    @Autowired
    public Child( @Value(value = "Billy") String name, Parent parent) {
        this.name = name;
        this.parent = parent;
    }

}
