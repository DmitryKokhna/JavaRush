package JavaSyntax.Level7.Lesson6.Task4;
//Задача 4
// В начало списка
//Уровень - EASY
// Представьте, что люди записываются на консультацию, скажем, к дантисту,
// но очередь работает не как очередь, а как стек: последним записался,
// первым получил сверлом в зуб. Составим программу по мотивам этой неестественной ситуации:
// создадим список, и добавим в него 10 строк, но добавлять будем не в конец списка, а в начало.

//1. Создай список строк в методе main.
//        2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
//        3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
//
//        Требования:
//        Объяви переменную типа список строк и сразу проинициализируй ee.
//        Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
//        Программа должна добавлять строки в начало списка.
//        Программа должна выводить список на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList=new ArrayList<>();
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        for (int i=0;i<10;i++)
        {
            arrayList.add(0, reader.readLine());
        }
        for (int j=0;j<10;j++)
        {
            System.out.println(arrayList.get(j));
        }
    }
}
