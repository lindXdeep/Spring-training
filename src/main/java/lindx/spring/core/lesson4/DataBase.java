package lindx.spring.core.lesson4;

import org.springframework.stereotype.Component;

@Component
public class DataBase {
    public boolean saveAdmin(Admin admin) {
        System.out.println(admin);
        return true;
    }

    public void close(){
        System.out.println("Connection was closed");
    }
}
