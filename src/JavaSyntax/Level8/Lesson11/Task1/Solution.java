package JavaSyntax.Level8.Lesson11.Task1;

//Задача 1

//Set из котов
//Уровень - HARD

//Вам необходимо создать кошачье множество. Для этого нужен класс public static Cat.
// Затем реализуйте метод createCats, который должен создавать Set из котов и добавлять в него 3 котов.
// В методе main удалите одного кота из Set cats.
// И, наконец, реализуйте метод printCats, он должен вывести на экран всех котов, которые остались во множестве.


//1. Внутри класса Solution создать public static класс кот - Cat.
//2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
//3. В методе main удалите одного кота из Set cats.
//4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
//Каждый кот с новой строки.
//
//Требования:
//Программа должна выводить текст на экран.
//Внутри класса Solution должен быть public static класс Cat с конструктором по умолчанию.
//Метод createCats() класса Solution должен возвращать множество (Set), содержащее 3 кота.
//Метод printCats() класса Solution должен вывести на экран всех котов из множества. Каждый кот с новой строки.
//Метод main() должен один раз вызывать метод createCats().
//Метод main() должен вызывать метод printCats().
//Метод main() должен удалять одного кота из множества котов.

//

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;


public class Solution {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator(); // удаляем объект используя Итератор
        iterator.next();
        iterator.remove();

        printCats(cats);
    }

    public static Set<Cat> createCats() { //метод создающий множество
        Set<Cat> cats = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        return cats;
    }

    public static void printCats(Set<Cat> cats) { //метод который выводит на консоль множество
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

    }
    public static class Cat {
        public Cat() // конструктор пустой
        {}

    }

        }

