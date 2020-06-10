/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/


public class Main{
    public static void main(String[] args) {
        Horse roach = new Horse("Плотва", 8, 88);
        Pegasus aragorn = new Pegasus("Арагорн", 33, 220);
        roach.run();
        aragorn.fly();
    }
}
interface MoveInterface{
    void run();
    void fly();
}
abstract class Animal implements MoveInterface{
    private String nickname;
    private int age;
    private int velocity;

    public Animal(String nickname, int age, int velocity) {
        this.nickname = nickname;
        this.age = age;
        this.velocity = velocity;
    }
}

class Horse extends Animal {
    public Horse(String nickname, int age, int velocity) {
        super(nickname, age, velocity);
    }
    @Override
    public void run() {
        System.out.println("Игого, я поскакал");
    }
    @Override
    public void fly() {
    }
}

class Pegasus extends Horse{
    public Pegasus(String nickname, int age, int velocity) {
        super(nickname, age, velocity);
    }
    @Override
    public void fly(){
        System.out.println("Игого, я полетел");
    }
}
