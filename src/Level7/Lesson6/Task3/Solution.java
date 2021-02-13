package Level7.Lesson6.Task3;
//ЗАДАЧА 3
//Выражаемся покороче
// Уровень- Medium
//Краткость — сестра таланта. Давайте в следующей задаче восславим краткость и вот каким образом:
// создаем список, считываем 5 строк с клавиатуры и добавляем их в список,
// затем находим самую короткую строку и выводим её на экран.
// Если таких строк несколько — выводим их все, каждую с новой строки. Вопросы есть, рядовой!?

//1. Создай список строк.
//        2. Считай с клавиатуры 5 строк и добавь в список.
//        3. Используя цикл, найди самую короткую строку в списке.
//        4. Выведи найденную строку на экран.
//        5. Если таких строк несколько, выведи каждую с новой строки.
//
//        Требования:
//        Объяви переменную типа список строк и сразу проинициализируй ee.
//        Программа должна считывать 5 строк с клавиатуры и записывать их в список.
//        Программа должна выводить самую короткую строку на экран.
//        Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> strings;


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            strings.add(reader.readLine());
        }
        int minLengthInArray=strings.get(0).length();
        for (int j=1;j<strings.size();j++) // минимальное значение для  вообще в любой строке в списке
        {
            if(strings.get(j).length()<minLengthInArray){
                minLengthInArray=strings.get(j).length();

            }
        }

        for (int k=0;k<strings.size();k++)   // строки, где размер равен минимальному значению ранее найденному
        {
            if(strings.get(k).length()==minLengthInArray)
            {
                System.out.println(strings.get(k));
            }
        }

    }

}

