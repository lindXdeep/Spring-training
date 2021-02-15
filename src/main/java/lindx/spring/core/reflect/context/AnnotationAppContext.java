package lindx.spring.core.reflect.context;

import java.util.HashMap;
import java.util.Map;

public class AnnotationAppContext implements ApplicationContext {

    private Map<String, Object> mapOfBeans = new HashMap<>();

    public AnnotationAppContext(Class... classes) throws IllegalAccessException, InstantiationException {

        for (int i = 0; i < classes.length; i++) {
            if (classes[i].isAnnotationPresent(Component.class)) {
                
                System.out.println("We are create beean");


                Object houseObj = classes[i].newInstance();

                Component annotation = (Component) classes[i].getAnnotation(Component.class);
                String nameOFCurrentBean = annotation.name();

                mapOfBeans.put(nameOFCurrentBean, houseObj);


                System.out.println("bewan was created");
            }
        }
    }

    @Override
    public Object getbean(String name) {
        return mapOfBeans.get(name);
    }

}