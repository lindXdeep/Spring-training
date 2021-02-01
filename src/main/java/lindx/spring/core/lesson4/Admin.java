package lindx.spring.core.lesson4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Admin {

    @Value(value = "root")
    private String name;
    
    @Value(value = "root")
    private String pass;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", pass='" + getPass() + "'" +
            "}";
    }
}
