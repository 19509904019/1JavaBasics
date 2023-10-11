package com.reflectapply;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName:RefelctTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/11 10:24
 * @Version 1.0
 */
public class RefelctTest {
    /*
     * 反射的应用三：调用指定的属性
     * */
    @Test
    public void test1() throws Exception {
        Class<Person> clazz = Person.class;
        Person p1 = clazz.newInstance();
        // 获取运行时类指定名的属性
        Field ageField = clazz.getDeclaredField("age");
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);

        // 获取或设置此属性的值
        ageField.setInt(p1, 16);

        nameField.set(p1, "yujun");
        System.out.println(p1);
        System.out.println(nameField.getName() + ":" + nameField.get(p1));
    }

    @Test
    public void test2() throws Exception {
        Class<Person> clazz = Person.class;

        Field infoField = clazz.getDeclaredField("info");

        infoField.setAccessible(true);

//        infoField.set(Person.class,"123");
//        System.out.println(infoField.get(Person.class));

        // 仅限于类变量使用
        infoField.set(null, "yujun");
        System.out.println(infoField.get(null));
    }

    /*
     * 反射的应用三：调用指定的方法
     * */
    @Test
    public void test3() throws Exception {
        Class<Person> clazz = Person.class;
        Person p1 = clazz.newInstance();

        Method showMethod = clazz.getDeclaredMethod("show", String.class, int.class);
        showMethod.setAccessible(true);
        showMethod.invoke(p1, "yujun", 18);

        // 类方法
        Method sleep = clazz.getDeclaredMethod("sleep");
        sleep.invoke(Person.class);
        // 静态方法也可以用null
        sleep.invoke(null);
    }

    /*
     * 反射的应用三：调用指定的构造器
     * */
    @Test
    public void test4() throws Exception {
        Class<Person> clazz = Person.class;

        // 1.通过Class的实例调用getDeclaredConstructor(Class .. args),获取指定参数类型的构造器
        Constructor<Person> constructor = clazz.getDeclaredConstructor(String.class, int.class);

        // 2.setAccessible(true):确保此构造器是可以访问的
        constructor.setAccessible(true);

        // 3.通过constructor实例调用newInstance(Object ... objs)，返回一个运行时类的实例
        Person p1 = constructor.newInstance("yujun", 18);
        System.out.println(p1);
    }

    /*
     * 反射的应用4：获取声明的注解信息
     * */
    @Test
    public void test5() throws NoSuchMethodException {
        Class<Person> clazz = Person.class;

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(CustomAnnotation.class)) {
                CustomAnnotation annotation = declaredMethod.getAnnotation(CustomAnnotation.class);
                String value = annotation.value();
                int priority = annotation.priority();
                System.out.println(value + "," + priority);
            }
        }

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(CustomAnnotation.class)) {
                CustomAnnotation annotation = declaredField.getAnnotation(CustomAnnotation.class);
                System.out.println(annotation.value());
                System.out.println(annotation.priority());
            }
        }

        Method getName = clazz.getDeclaredMethod("getName");
        CustomAnnotation annotation = getName.getAnnotation(CustomAnnotation.class);
        System.out.println(annotation.value());
        System.out.println(annotation.priority());
    }

}
