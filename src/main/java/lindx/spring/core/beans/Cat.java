package lindx.spring.core.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:prop.properties")
public class Cat {

    @Value(value = "${cat.name}")
    private String name;

    @Value(value = "${cat.age}")
    private int age;

    @Value(value = "#{'${cat.girls}'.split(',')}")
    List<String> girls;

    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            ", age='" + age + "'" +
            ", girls='" + girls + "'" +
            "}";
    }
}
