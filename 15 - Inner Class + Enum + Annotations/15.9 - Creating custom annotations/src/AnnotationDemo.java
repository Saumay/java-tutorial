/*
Creating custom annotations:
    - Marker annotations: don't have any value
    - Single-value annotations: have single value
    - Multi-value annotations: have multiple values

No extra .class file is created for custom annotations
All the annotations implements Annotation interface

Meta Annotations: annotations used to create annotations
    Mandatory
        - @Target : for which target or on which level will it be used
            - ElementType.TYPE: for class and interface level
            - ElementType.CONSTRUCTOR: for constructor level, etc
        - @Retention : till what point you want your annotation
            - RetentionPolicy.RUNTIME: Will be there at runtime
            - RetentionPolicy.CLASS: Will be there in .class file
            - RetentionPolic.SOURCE: Will not be there in .class file
    Optional
        - @Documented: to introduce the annotation in the documentation also
        - @Inherited: to make the annotation available for the child classes of the class having that annotation
 */

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationDemo {
    public static void main(String[] args) {
        // printing normal variable values
        NokiaASeries obj = new NokiaASeries("fire", 5);
        System.out.println(obj.model);
        System.out.println(obj.size);

        // printing Annotation values (using Reflection API)
        Class c = obj.getClass();                               // get class first using object
        Annotation an = c.getAnnotation(SmartPhone.class);      // get Annotation object from class
        SmartPhone s = (SmartPhone) an;                         // typecast annotation object to your annotation
        System.out.println(s.os());
        System.out.println(s.version());
    }
}

@interface MarkerAnnotation {}          // Marker Annotation: having no value

@interface SingleValueAnnotation {      // Single Value Annotation: having single value
    int i = 5;
}

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {                 // Multi-valued Annotation: having multiple values
    String os() default "Windows";      // For specifying default values if values are not provided
    int version() default 8;
}

@SmartPhone(os="Android", version = 6)  // For specifying values
class NokiaASeries {

    String model;
    int size;

    public NokiaASeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}