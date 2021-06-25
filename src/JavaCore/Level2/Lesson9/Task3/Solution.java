package JavaCore.Level2.Lesson9.Task3;

//Задача 3

//Есть, летать, двигаться
// Уровень - EASY

//Условия
/*
Есть public интерфейсы CanFly (летать), CanMove (передвигаться), CanEat (есть).
Добавь эти интерфейсы классам Dog (собака), Car (автомобиль), Duck (утка), Airplane (самолет).

Требования:
Класс Solution должен содержать интерфейс CanFly с одним методом fly().
Класс Solution должен содержать интерфейс CanMove с одним методом move().
Класс Solution должен содержать интерфейс CanEat с одним методом eat().
Собака должна уметь передвигаться и есть.
Автомобиль должен уметь передвигаться.
Самолет должен уметь передвигаться и летать.
Утка должна уметь передвигаться, летать и есть.
 */

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove,CanEat {
        @Override
        public  void eat()
        {
            System.out.println("eatDog");
        }
        @Override
        public  void move()
        {
            System.out.println("moveDog");
        }
    }

    public  class Duck implements CanFly, CanEat, CanMove{
        @Override
        public void move()
        {
            System.out.println("moveDug");
        }
        @Override
        public void eat()
        {
            System.out.println("eatDug");
        }
        @Override
        public void fly()
        {
            System.out.println("flyDug");
        }
    }

    public  class Car implements CanMove{
        @Override
        public void move()
        {
            System.out.println("moveCar");
        }

    }

    public class Airplane implements CanFly, CanMove{
        @Override
        public void fly()
        {
            System.out.println("flyAricr");
        }
        @Override
        public void move()
        {
            System.out.println("movAricr");
        }

    }
}
