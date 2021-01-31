package lindx.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lindx.spring.core.beans.Car;
import lindx.spring.core.beans.Cat;
import lindx.spring.core.beans.DatabaseConnection;

public class App {
    public static void main(String[] args) {
        
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("config.xml");

        Car car = xmlContext.getBean("firstCar", Car.class);
        Car car2 = xmlContext.getBean("firstCar", Car.class);
        Car car3 = xmlContext.getBean("secondCar", Car.class);

        System.out.println(car.getMark());
        System.out.println(car ==car2);
        System.out.println(car3.toString());


        ApplicationContext appContext = new AnnotationConfigApplicationContext("lindx.spring.core");

        System.out.println(appContext.getBean(Cat.class).toString());

        System.out.println();

        System.out.println(appContext.getBean(DatabaseConnection.class).toString());

        ((ConfigurableApplicationContext) xmlContext).close();
        ((ConfigurableApplicationContext) appContext).close();
    }
}