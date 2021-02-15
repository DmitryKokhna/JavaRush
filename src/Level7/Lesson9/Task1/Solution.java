package Level7.Lesson9.Task1;
// Задача 1
// Играем в Jолушку
// Уровень - HARD

//Игра Jолушка 1.0: распихиваиние чисел по трем спискам.
// Правила таковы: Jолушка получила список из 20 чисел.
// Ей нужно проверить, какие из них нацело делятся на 3, какие на 2, а какие — ни на то, ни на другое.
// Затем ей нужно сохранить их в отдельные списки. Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
// Решаем!

//1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
//        Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
//        Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//        Порядок объявления списков очень важен.
//        2. Метод printList должен выводить на экран все элементы списка с новой строки.
//        3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
//
//        Требования:
//        Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет главным, а остальные - дополнительными.
//        Считать 20 чисел с клавиатуры и добавить их в главный список.
//        Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
//        Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
//        Добавить в третий дополнительный список все остальные числа из главного

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
ArrayList<Integer> commanArr=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

for (int k=0;k<10;k++){
    commanArr.add(Integer.parseInt(reader.readLine()));

}
printList(commanArr);
    }
    public static void printList(ArrayList<Integer> list)
    {
        ArrayList<Integer> arrayListFor3=new ArrayList<>();
        ArrayList<Integer> arrayListFor2=new ArrayList<>();
        ArrayList<Integer> arrayListOther=new ArrayList<>();

        for(int i=0;i<list.size();i++){


if((list.get(i)%3==0))
{
    arrayListFor3.add(list.get(i));
}
if(list.get(i)%2==0)
{
    arrayListFor2.add(list.get(i));
}
if((list.get(i)%3!=0)&&(list.get(i)%2!=0))
{
    arrayListOther.add(list.get(i));
}
        }
        System.out.println("Это на 3");
        System.out.println("---------");
     for (int j=0;j<arrayListFor3.size();j++)
     {
         System.out.println("  " + arrayListFor3.get(j));
     }
        System.out.println("----------");
        System.out.println(" Это на 2");
        for (int j=0;j<arrayListFor2.size();j++)
        {
            System.out.println("  "+ arrayListFor2.get(j));
        }
        System.out.println("___________");
        System.out.println("Это другие");
        for (int j=0;j<arrayListOther.size();j++)
        {
            System.out.println("  "+ arrayListOther.get(j));
        }

    }
}
