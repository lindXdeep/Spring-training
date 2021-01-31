package lindx.spring.core.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException,
            SecurityException {
        
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
        r.getClass().newInstance().run();           // hello

        // Доступ к pravate полям
        Shape shape = new Shape();

        Field square = shape.getClass().getDeclaredField("square");
                square.setAccessible(true);
                square.set(shape,5);
        System.out.println(square.get(shape)); 
    }
}
