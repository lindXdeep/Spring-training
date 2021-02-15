package lindx.spring.core.reflect;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;


public class ReflectionExample {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        
        // Масисв методов
        for (Method method : Arrays.class.getMethods()){
            method.getName().lines().forEach(System.out::println);
        }

        // У анонимного класса есть имя
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println("hello");
            }
        };

        System.out.println(r.getClass().getName()); // lindx.spring.core.reflect.ReflectionExample$1

        // Создаем обьект с помощью механизма рефлексии
        Runnable r2 = r.getClass().newInstance();

        r2.run();                                   // hello
    }
}
