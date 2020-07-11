import entities.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception{
        Class c= Person.class;
        Constructor constructor=c.getConstructor(String.class,int.class);
        Object person=constructor.newInstance("张三",18);
        System.out.println(person);
        Object person2=c.newInstance();
    }
}
