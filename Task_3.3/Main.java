/*
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Dog должна быть переменная name с типом String.
•	У класса Dog должна быть переменная age с типом int.
•	У класса должен быть сеттер для переменной name.
•	У класса должен быть геттер для переменной name.
•	У класса должен быть сеттер для переменной age.
•	У класса должен быть геттер для переменной age.
*/


public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void setName (String name){
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge (int age){
        this.age = age;
    }
    public static void main (String[]args){
        Dog dog = new Dog("Блохастый", 3);
        dog.setName("Шарик");
        dog.setAge(5);
        System.out.println(dog.getName() + ", " + dog.getAge() +" лет");

    }
}
