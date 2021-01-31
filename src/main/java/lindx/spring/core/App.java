package lindx.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lindx.spring.core.beans.Car;

public class App {
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Car car = context.getBean("firstCar", Car.class);
        Car car2 = context.getBean("firstCar", Car.class);
        Car car3 = context.getBean("secondCar", Car.class);

        System.out.println(car.getMark());

        System.out.println(car ==car2);

        System.out.println(car3.getMark());

        ((ConfigurableApplicationContext) context).close();
    }
}