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

import java.util.*;

public class Solution {
    public static void main(String[] args) {
       Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
       printCatSet(set);
    }

   public static Map<String, Cat> createMap() {
       HashMap<String,Cat> catHashMap = new HashMap<>();
       Cat cat1= new Cat("catName1");
       Cat cat2= new Cat("catName2");
       Cat cat3= new Cat("catName3");
       Cat cat4= new Cat("catName4");
       Cat cat5= new Cat("catName5");
       Cat cat6= new Cat("catName6");
       Cat cat7= new Cat("catName7");
       Cat cat8= new Cat("catName8");
       Cat cat9= new Cat("catName9");
       Cat cat10= new Cat("catName10");
       catHashMap.put("catNameMap1",cat1);
       catHashMap.put("catNameMap2",cat2);
       catHashMap.put("catNameMap3",cat3);
       catHashMap.put("catNameMap4",cat4);
       catHashMap.put("catNameMap5",cat5);
       catHashMap.put("catNameMap6",cat6);
       catHashMap.put("catNameMap7",cat7);
       catHashMap.put("catNameMap8",cat8);
       catHashMap.put("catNameMap9",cat9);
       catHashMap.put("catNameMap10",cat10);
return  catHashMap;
      //напишите тут ваш код
  }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
Set<Cat> catSet = new HashSet<Cat>(map.values());  // тут если попытаться через  Set<Cat> catSet = map.values() - то получим ошибку по типу переменной.

return catSet;
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
