package JavaSyntax.Level7.Lesson6.Task2;
//ЗАДАЧА 2
// Самая длинная строка
// Уровень - HARD
// Давайте померяемся строками! А заодно и задачку решим по программированию:
// создадим список строк, считаем с клавиатуры 5 штук и добавим их в список.
// Затем с помощью цикла найдем из списка самую длинную строку (или несколько,
// если она такая не одна). Страна должна знать своих героев: самые длинные строки будут выведены на экран.

//1. Создай список строк.
//        2. Считай с клавиатуры 5 строк и добавь в список.
//        3. Используя цикл, найди самую длинную строку в списке.
//        4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
//
//        Требования:
//        В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
//Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
//        Программа должна выводить самую длинную строку на экран.
//        Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.


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
     int maxLengthInArray=strings.get(0).length();
     for (int j=1;j<strings.size();j++) // максимальное значение для  вообще в любой строке в списке
     {
     if(strings.get(j).length()>maxLengthInArray){
    maxLengthInArray=strings.get(j).length();

     }
     }

   for (int k=0;k<strings.size();k++)   // строки, где размер равен максимальному значению ранее найденному
   {
       if(strings.get(k).length()==maxLengthInArray)
       {
           System.out.println(strings.get(k));
       }
    }

    }

}
