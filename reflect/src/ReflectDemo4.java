import entities.Person;

import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception{
        Class c= Person.class;
        Method eat = c.getMethod("eat");
        Person p=new Person();
        eat.invoke(p);
    }
}
