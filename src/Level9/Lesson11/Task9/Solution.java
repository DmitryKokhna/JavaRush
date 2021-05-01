package Level9.Lesson11.Task9;

//Задача 9

//Десять котов

//Уровень - Medium

//Мне, пожалуйста, десяток котов и знания по Java.
// Желательно, одновременно!
// Не проблема, держите: в программе есть класс кот – Cat, с полем «имя» (String).
// Вам нужно создать словарь Map<String, Cat> и добавить туда 10 котов в виде «Имя»-«Кот».
// Затем получите из Map множество(Set) всех котов и выведите его на экран.

//Есть класс кот - Cat, с полем "имя" (String).
//Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
//Получить из Map множество(Set) всех котов и вывести его на экран.
//
//Требования:
//Программа не должна считывать данные с клавиатуры.
//Метод createMap должен создавать новый объект HashMap<String, Cat>.
//Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
//Метод createMap должен возвращать созданный словарь.
//Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
//Программа должна вывести всех котов из множества на экран.

import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {

        //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }

}
