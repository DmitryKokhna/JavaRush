package Level10.Lesson11.Task8;

//Задача 8
//Массив списков строк
//Уровень - Medium

//Иногда задание — это просто задание.
// Без подвоха, и не стоит искать в нём сложности и глубины.
// Нужно просто сесть и решить. Перед нами — именно такое задание.
// Смотрите, как все внятно и просто: создайте массив, элементами которого будут списки строк.
// А потом заполните массив любыми данными и выведите их на экран.

//Создай массив, элементами которого будут списки строк.
//Заполни массив любыми данными и выведи их на экран.
//
//Требования:
//Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.
//Метод createList должен возвращать созданный массив.
//Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
//Программа должна выводить данные на экран.
//Метод main должен вызывать метод createList.
//Метод main должен вызывать метод printList.


import java.awt.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
        String[] s=new String[2];

    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arr= new ArrayList[2]; //тут создаем массив с типом хранимых значений ArrayList, после new ArrayList тип переменных не указываем
ArrayList<String> str1 = new ArrayList<>(); //список 1
ArrayList<String> str2 = new ArrayList<>(); //список 2
        str1.add("1"); // добавляем в список 1
        str1.add("2"); // добавляем в список 1
        str2.add("3"); // добавляем в список 2
        str2.add("4"); // добавляем в список 2
        arr[0]=str1; // добавляем в массив
        arr[1]=str2; // добавляем в массив
        return arr;
    }
//этот код был - тут вывод
    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
