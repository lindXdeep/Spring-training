package lindx.spring.core.Lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Worker {

    private Passport passport; 
    private String prevWorkPalece;

    @Autowired
    public Worker(Passport passport,  @Value(value = "Microsoft") String prevWorkPalece) {
        this.passport = passport;
        this.prevWorkPalece = prevWorkPalece;
    }




    public Passport getPassport() {
        return this.passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public String getPrevWorkPalece() {
        return this.prevWorkPalece;
    }

    public void setPrevWorkPalece(String prevWorkPalece) {
        this.prevWorkPalece = prevWorkPalece;
    }

    @Override
    public String toString() {
        return "{" +
            " passport='" + getPassport() + "'" +
            ", prevWorkPalece='" + getPrevWorkPalece() + "'" +
            "}";
    }
}