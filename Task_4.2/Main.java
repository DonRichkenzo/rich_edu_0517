/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/ 

public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse nibblesMouse = new Mouse("Nibbles", 6, 4);
        Mouse pecosMouse = new Mouse("Uncle Pecos", 11, 6);
        Cat tomCat = new Cat("Tom", 70, 20);
        Cat butchCat = new Cat("Butch", 70, 27);
        Dog spikeDog = new Dog("Spike", 81, 9);
        Dog tykeDog = new Dog("Tyke", 23, 4);
        Duck quackerDuck = new Duck("Quacker", 12, 3);
    }
    public static class Mouse {
        public String name;
        public int height;
        public int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog {
        public String name;
        public int height;
        public int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Cat {
        public String name;
        public int height;
        public int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Duck {
        public String name;
        public int height;
        public int tail;

        public Duck(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
