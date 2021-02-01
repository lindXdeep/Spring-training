package lindx.spring.core.Lesson3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Passport {
    
    @Value(value = "123456")
    private int number;
    
    @Value(value = "21.09.2010")
    private String dateOfissue;

    @Value(value = "Tom")
    private String name;


    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDateOfissue() {
        return this.dateOfissue;
    }

    public void setDateOfissue(String dateOfissue) {
        this.dateOfissue = dateOfissue;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
            " number='" + getNumber() + "'" +
            ", dateOfissue='" + getDateOfissue() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
}