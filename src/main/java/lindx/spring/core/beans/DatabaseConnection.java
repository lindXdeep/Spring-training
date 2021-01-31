package lindx.spring.core.beans;

import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value = "bdBean")
@PropertySource("classpath:db.properties")
public class DatabaseConnection {

    @Value(value = "db.name")
    private String username;
    @Value(value = "db.pass")
    private String password;
    @Value(value = "db.url")
    private String url;

    @Override
    public String toString() {
        return "{" +
            " username='" + username + "'" +
            ", password='" + password + "'" +
            ", url='" + url + "'" +
            "}";
    }
}
