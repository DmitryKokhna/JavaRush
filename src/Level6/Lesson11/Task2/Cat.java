package Level6.Lesson11.Task2;
// ЗАДАЧА 2
//Статические коты
// Уровень - HARD

//Статический кот — всем котам кот. Поэтому в этой задаче в классе Cat добавляем статическую переменную cats.
//Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот.
//Нам нужно создать 10 объектов Cat, а затем метод printCats должен выводить всех котов на экран.

// Задание
//1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
//2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
//3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cat {
   public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat()
    {

        }

    public static void main(String[] args) {
        for(int i=0; i<10; i++) // через цикл создаем 10 объектов
        {
            cats.add(new Cat());  // переменная cats статитеска, и через ADD добавляем объекты в ячейку. А создаем объект тут же.
        }

     printCats(cats); // вызываем метод вывода на экран, предаем как параметр CATS (т.е. весь список)
    }
    public static void printCats(ArrayList<Cat> cats) // метод принимает как пара метр Список-переменную CATS типа <Сat>
    {
        for(int i=0; i<cats.size(); i++) // метод size() возвращает размер списка
        {
            System.out.println(cats.get(i)); // get() возвращает /дает доступ к элементу в списке.
        }
    }
}
