package annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
//@Repeatable(RepeatAnnotation.class)
public @interface AnnotationTest {
    int[] value();
}
