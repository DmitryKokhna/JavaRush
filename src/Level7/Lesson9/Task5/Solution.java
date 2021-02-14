package Level7.Lesson9.Task5;
//ЗАДАЧА 5
// Удваиваем слова
//Уровень - MEDIUM

//Пишем программу-эхо. Она удваивает всё, что слышит. Вернее всё, что попало в список из 10 строк.
// Для этого в программе-эхо создаем, собственно список из 10 слов (вводим с клавиатуры строки и заносим их в список)
// и метод doubleValues, который, собственно, удваивает слова по определенному принципу. Результат эхо выводим на экран.
// Ничего сложного.

//1. Введи с клавиатуры 10 слов в список строк.
//
//        2. Метод doubleValues должен удваивать слова по принципу:
//        "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
//
//        3. Выведи результат на экран, каждое значение с новой строки.
//
//        Требования:
//        Объяви переменную типа список строк и сразу проинициализируй ee.
//        Считай 10 строк с клавиатуры и добавь их в список.
//        Метод doubleValues должен удваивать элементы списка по принципу "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
//        Выведи получившийся список на экран, каждый элемент с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i=0;i<10;i++){
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (int j = 0; j<20;j++){
            System.out.println(list.get(j));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int k = 0;k<list.size();k += 2){
            list.add(k+1, list.get(k));
        }
        return list;

    }
}
