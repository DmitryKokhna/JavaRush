package Level7.Lesson6.Task6;
//ЗАДАЧА 6
// Самые-самые
// Уровень - HARD
// Игры со списками в Java очень популярны. А всё потому, что это просто и интересно.
// Присоединяйтесь! В этой задачке создаем список строк. Затем — добавляем в него 10 строчек с клавиатуры.
// Самое интересное — определяем, какая строка в списке встретится раньше: самая короткая или самая длинная.
// Если таких строк несколько, учитываем самые первые из них.

//1. Создай список строк.
//        2. Добавь в него 10 строчек с клавиатуры.
//        3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//        Если таких строк несколько, то должны быть учтены самые первые из них.
//        4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
//
//        Требования:
//        Объяви переменную типа список строк и сразу проинициализируй ee.
//        Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
//        Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
//        Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
//        Должна быть выведена только одна строка.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));



        for(int i=0;i<10;i++) // заполнение списка
        {
            list.add(reader.readLine());
        }
        int maxLength=list.get(0).length();
        int minLength=list.get(0).length();;

        for(int j=0;j<10;j++) // поиск Максимума
        {
            if(list.get(j).length()>maxLength)
            {
                maxLength=list.get(j).length();
            }
        }

        for(int k=0;k<10;k++) // поиск Минимума
        {
            if(list.get(k).length()<minLength)
            {
              minLength =list.get(k).length();
            }
        }

        for(int m=0;m<10;m++)
        {
       if(list.get(m).length()==maxLength)
           {
               System.out.println(list.get(m));
break;
           } else if(list.get(m).length()==minLength){
           System.out.println(list.get(m));
           break;
       }



            }
        }
    }

