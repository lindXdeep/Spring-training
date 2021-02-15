package lindx.spring.core.reflect.context;

public class Start {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        
        ApplicationContext applicationContext = new AnnotationAppContext(House.class);
                
        House house = (House) applicationContext.getbean("house");
        
        house.sayhello();
    }    
}