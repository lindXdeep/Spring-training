package lindx.spring.core.Lesson3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        System.out.println();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                Worker.class, Passport.class, Parent.class, Child.class);
  
        
        Worker worker = applicationContext.getBean(Worker.class);
        Passport passport = applicationContext.getBean(Passport.class);

        System.out.println(worker.toString());
        System.out.println(passport.toString());

        ((ConfigurableApplicationContext)applicationContext).close();
    }
}
