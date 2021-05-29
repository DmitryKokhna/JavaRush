package JavaSyntax.Level7.Lesson9.Task6;
//ЗАДАЧА 6
// Проверка на упорядоченность
//Уровень - MEDIUM
// Иерархия — первый страж порядка и боевое оружие диктатуры. О диктатуре подумаем позже, а пока составим список из 10 слов.
// Введём их с клавиатуры. Наша задача состоит в том, чтобы проверить, является ли список упорядоченным по возрастанию длины строки.
// Если нет, выводим на экран номер первого элемента, нарушающего такую упорядоченность.

//1. Введи с клавиатуры 10 слов в список строк.
//        2. Определить, является ли список упорядоченным по возрастанию длины строки.
//        3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
//
//        Требования:
//        Объяви переменную типа список строк и сразу проинициализируй ee.
//        Считай 10 строк с клавиатуры и добавь их в список.
//        Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
//        Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<4;i++){
            list.add(reader.readLine());
        }
        int sizeSrt=list.get(0).length(); // получаем значение для НУЛЬ элемента, т.е. с чем будем сравнивать дальше



        for(int j=1;j<list.size();j++) // отсчет от 1, т.к. НУЛЬ уже задали ранее
        {

            if(list.get(j).length()>sizeSrt)
            {
             sizeSrt=list.get(j).length();
            }
            else if (list.get(j).length()<=sizeSrt)
            {
                System.out.println(j);
                break;
            }

        }
    }
}
