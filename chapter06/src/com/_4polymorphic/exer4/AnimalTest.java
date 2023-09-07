package com._4polymorphic.exer4;

/**
 * ClassName:AnimalTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/7 12:00
 * @Version 1.0
 */
public class AnimalTest {
    public void test(Animal animal){
        animal.eat();
        animal.sleep();

        if(animal instanceof Dog){
//            Dog dog = (Dog) animal;
//            dog.watchDoor();
            ((Dog) animal).watchDoor();

        }else if(animal instanceof Cat){
            ((Cat) animal).catchMouse();
        }
    }

    public static void main(String[] args) {
        AnimalTest animal = new AnimalTest();

        // 狗
        Dog dog = new Dog();
        // 猫
        Cat cat = new Cat();

        // 使用多态时进行instanceof判断
        animal.test(dog);
        System.out.println();
        animal.test(cat);

    }
}
