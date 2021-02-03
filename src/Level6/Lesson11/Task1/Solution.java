package Level6.Lesson11.Task1;
// ЗАДАЧА 1
// Кот и статика
// Уровень - MEDIUM
//Солнце встает. Задачи всё сложнее: изучаем static’и.
//В этот раз нам нужно в классе Cat создать статическую переменную catCount и конструктор [public Cat()].
//Пусть при каждом создании кота (нового объекта Cat) статическая переменная catCount увеличивается на 1.
//Нам нужно создать десяток котов и вывести значение переменной catCount на экран

//В классе Cat создай статическую переменную public int catCount.
//Создай конструктор [public Cat()].
//Пусть при каждом создании кота (нового объекта Cat) статическая переменная catCount увеличивается на 1.
// Создать 10 объектов Cat и вывести значение переменной catCount на экран.

public class Solution {
    public static void main(String[] args) {
        // тут создаем 10 объектов от класса Кот
        Cat ca1=new Cat();
        Cat ca2=new Cat();
        Cat ca3=new Cat();
        Cat ca4=new Cat();
        Cat ca5=new Cat();
        Cat ca6=new Cat();
        Cat ca7=new Cat();
        Cat ca8=new Cat();
        Cat ca9=new Cat();
        Cat ca10=new Cat();

        System.out.println(Cat.catCount); // тут просто проверяем, что конструктор работает - по заданию не требуется
    }

    public static class Cat {
        public static int catCount;
        public Cat()
        {
            catCount++; // тут увеличиваем счетчик, при  создании объектов от класса Кот
        }

    }
}
