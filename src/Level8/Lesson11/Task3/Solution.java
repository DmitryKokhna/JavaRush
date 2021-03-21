package Level8.Lesson11.Task3;

//Задача 3
//Однофамильцы и тёзки
//Уровень - EASY

//К обнаружению тёзок и однофамильцев готовы! Осталось только программу написать для воплощения этой светлой цели.
// Для начала составим словарь Map, куда будем добавлять людей в виде «Фамилия»-«Имя».
// Пускай их будет десять и некоторые из них будут однофамильцами и тезками.
// После этого выведем содержимое Map на экран.


//1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
//2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
//3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
//4. Вывести содержимое Map на экран.
//
//Требования:
//Программа должна выводить текст на экран.
//Класс Solution должен содержать только три метода.
//Метод createPeopleMap() должен создавать и возвращать словарь Map с типом элементов String, String. Кроме того, добавлять в словарь 10 человек.
//В методе createPeopleMap() должны добавляться люди с одинаковыми фамилиями.
//В методе createPeopleMap() должны добавляться люди с одинаковыми именами.
//Метод printPeopleMap() должен выводить на экран всех людей из словаря Map. Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
//Метод main() должен вызывать метод createPeopleMap().
//Метод main() должен вызывать метод printPeopleMap().


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String,String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public  static Map<String,String> createPeopleMap (){
        Map<String,String> map=new HashMap<>();
        for (int i=0;i<10;i++){
            map.put("иванов", "иван");
        }

        return map;
    }
    public static  void printPeopleMap(Map<String,String> map) {
        // code

       for (Map.Entry<String, String> s : map.entrySet()){
           System.out.println(s.getKey() + " " + s.getValue());
       }
    }
}
