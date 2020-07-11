import entities.Person;

public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        Class c1=Class.forName("entities.Person");
        System.out.println(c1);
        Class c2= Person.class;
        System.out.println(c2);
        Person person=new Person();
        Class c3=person.getClass();
        System.out.println(c3);
    }
}
