package lindx.spring.core.reflect.context;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)     // Будем исползовать во время рантайма
@Target(value = ElementType.TYPE)               // TYPE - разрешается ставить над классом
public @interface Component {
    String name() default "";
}




/* 
    RetentionPolicy.

        RUNTIME - во время рантайма
        CLASS
        SOURCE - используется только во время компиляции (ее не будет в байт-коде)
*/ 

