import entities.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception{
        Class c= Person.class;
        //获取共有成员变量
        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Field a = c.getField("a");
        Person p=new Person();
        p.setName("李四");
        Object o=a.get(p);
        System.out.println(o);
        a.set(p,"张三");
        System.out.println(p);
        //获取全成员变量
        Field[] declaredFields = c.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field d=c.getDeclaredField("name");
        //暴力反射
        d.setAccessible(true);
        Object j=d.get(p);
        System.out.println(j);
    }
}
