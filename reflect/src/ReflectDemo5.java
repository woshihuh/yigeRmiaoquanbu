import entities.Person;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo5 {
    public static void main(String[] args) throws Exception{
        Properties pro=new Properties();
        ClassLoader classLoader = Person.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        String classname=pro.getProperty("classname");

        Class c = Class.forName(classname);
        Object o=c.newInstance();
        Method method=c.getMethod("eat");
        method.invoke(o);
    }
}
