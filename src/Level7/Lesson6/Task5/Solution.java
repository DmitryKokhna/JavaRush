package Level7.Lesson6.Task5;
//ЗАДАЧА 5
//Удалить и вставить
// Уровень - MEDIUM
// Манипулировать списками в Java — почти так же легко и приятно, как людьми!
// Ладно, сейчас о списках. Вот что нужно сделать: создать список, добавить в него 5 строк.
// Затем удалить последнюю строку и вставить её в начало. Повторить манипуляцию 13 раз
// и вывести на экран содержимое списка. Зачем? Не задавайтесь этим вопросом, просто поверьте: так нужно.

//1. Создай список строк.
//        2. Добавь в него 5 строк с клавиатуры.
//        3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
//        4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
//
//        Требования:
//        Объяви переменную типа список строк и сразу проинициализируй ee.
//        Программа должна считывать 5 строк с клавиатуры.
//        Удали последнюю строку и вставь её в начало. Повторить 13 раз.
//        Программа должна выводить список на экран, каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String>  list=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        for (int i=0;i<5;i++) // заполняем список
        {
            list.add(reader.readLine());
        }
     int lastNumberFromList=4; // номер последнего элемента в списке

        for(int i=1;i<14;i++)
        {
            String lastString=list.get(lastNumberFromList); // передаем последнюю запись в С переменную
            list.remove(lastNumberFromList); //  удаляем последнюю переменную
            list.add(0,lastString); // добавляем последнюю удаленную как первую
        }
for(int j=0;j<5;j++) { // вывод
    System.out.println(list.get(j));
}
    }
}
