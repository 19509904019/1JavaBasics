package record;

/**
 * ClassName:Person
 * Description:
 *
 * @Author ZY
 * @Create 2023/10/12 21:39
 * @Version 1.0
 */
public record Person(String name, int age) {
    // 还可以在record声明的类中定义静态字段、静态方法、构造器或实例方法


    // 不能在record声明的类中定义实例字段；类不能声明为abstract‘不能声明显式的父类等
}
