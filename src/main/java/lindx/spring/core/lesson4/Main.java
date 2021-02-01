package lindx.spring.core.lesson4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
            Admin.class, AdminService.class, DataBase.class);

        ((ConfigurableApplicationContext)applicationContext).close();
    }
}
