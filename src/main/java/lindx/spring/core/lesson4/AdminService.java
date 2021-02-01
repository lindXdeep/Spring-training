package lindx.spring.core.lesson4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminService {
    
    private Admin admin;
    private DataBase dataBase;

    public AdminService(){
    }

    @PostConstruct
    public void init(){
        dataBase.saveAdmin(admin);
    }
    
    public Admin getAdmin() {
        return this.admin;
    }

    @Autowired
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public DataBase getDataBase() {
        return this.dataBase;
    }

    @Autowired
    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @PreDestroy
    public void destroy(){
        dataBase.close();
    }

}
