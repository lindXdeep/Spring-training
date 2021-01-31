package lindx.spring.core.reflect;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {
    public static void main(String[] args) {
        
        for (Method method : Arrays.class.getMethods()){
            method.getName().lines().forEach(System.out::println);
        }
    }
}
