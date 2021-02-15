package lindx.spring.core.lesson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lindx.spring.core.beans.House;
import lindx.spring.core.beans.Person;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("confirLesson02.xml");

        House house = (House) applicationContext.getBean("house");
                
        System.out.println(house.toString());


        Person person = applicationContext.getBean(Person.class);
            System.out.println(person.toString());
            System.out.println(person.getWorkPalace().getClass());


        ((ConfigurableApplicationContext)applicationContext).close();
    }
}

