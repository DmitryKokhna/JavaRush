package JavaCore.Level2.Lesson9.Task4;
//Задача 4

//Создаем человека
//Уровень - EASY

//Условие
/*
Есть интерфейсы CanFly (Летать), CanRun (бежать\ездить), CanSwim (плавать).
 Добавь эти интерфейсы к классам Human (человек),Duck (утка), Penguin (пингвин), Airplane (самолет).
 Требования:
 Класс Solution должен содержать интерфейс CanFly с одним методом fly().
 Класс Solution должен содержать интерфейс CanRun с одним методом run().
 Класс Solution должен содержать интерфейс CanSwim с одним методом swim().
 Человек должен уметь бегать и плавать.
 Утка должна уметь летать, плавать и бегать.
 Пингвин должен уметь плавать и бегать.
 Самолет должен уметь летать и ездить.
  */
public class Solution {
    public static void main(String[] args) {

    }
    public interface CanFly{
        public  void fly();
    }
    public interface CanRun{
        public  void run();
    }
    public interface CanSwim{
        public  void swim();
    }

    public class Human implements  CanRun,CanSwim {
        @Override
        public void swim(){
            System.out.println("swimH");
        }
        @Override
        public void run(){
            System.out.println("runH");
        }
       }

       public class Duck implements CanFly,CanRun, CanSwim {
           @Override
           public void fly() {
               System.out.println("flyD");
           }

           @Override
           public void run() {
               System.out.println("runD");
           }

           @Override
           public void swim() {
               System.out.println("swimD");
           }
       }
         public class Penguin implements CanSwim, CanRun {
             @Override
             public void swim() {
                 System.out.println("swimP");
             }

             @Override
             public void run() {
                 System.out.println("runP");
             }
         }
            public class Airplane implements CanFly, CanRun {
                @Override
                public void fly(){
                    System.out.println("flyA");
                }
                @Override
                public void run(){
                    System.out.println("runA");
                }
            }
         }


