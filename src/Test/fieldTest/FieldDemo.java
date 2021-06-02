package Test.fieldTest;

import java.lang.reflect.Field;

public class FieldDemo {
    public static void main(String[] args) {
        Person person = new Person("mike",18,"man");
        System.out.println(person);
        try {
            Field f1 = person.getClass().getDeclaredField("name");
            f1.set(person,"hongchao");
            System.out.println(f1.get(person));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Field[] fields = person.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                System.out.println(field.get(person));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }


    }
}
