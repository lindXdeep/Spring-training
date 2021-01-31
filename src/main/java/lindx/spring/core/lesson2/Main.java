package lindx.spring.core.lesson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lindx.spring.core.beans.Address;
import lindx.spring.core.beans.House;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("confirLesson02.xml");

        House house = (House) applicationContext.getBean("house");
            house.setAddress(new Address("Lenina", 5));
        
            System.out.println(house.toString());

        ((ConfigurableApplicationContext)applicationContext).close();
    }
}
