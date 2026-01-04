package Exercices.Serialization_And_Introspection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class intro_main {
    public static void main(String[] args) {
        Class <?> c = Person.class;


        System.out.println("class name "+c.getName());
        System.out.println("class simple name "+c.getSimpleName());
        System.out.println("Superclass "+c.getSuperclass());



        //Fields

        Field[] othman = c.getDeclaredFields();

        for(Field f : othman){
            System.out.println(
                    "Field name : "+f.getName()+
                            "\n Type "+ f.getType()+
                            "\n Modifier "+f.getModifiers()
            );
        }

        Method[] benyahya = c.getDeclaredMethods();

        for (Method f : benyahya ){
            System.out.println(
                    "Method name : "+f.getName()+
                            "\n Returne type : "+f.getReturnType()

            );

            Class<?> []  ana = f.getParameterTypes();
            System.out.println("Parameters count : "+ana.length);
            for (Class<?> p : ana){
                System.out.println("parametre type "+p.getName());
            }
        }


    }
}
