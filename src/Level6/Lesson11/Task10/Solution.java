package Level6.Lesson11.Task10;
//ЗАДАЧА 10
//Числа по возрастанию
//Уровень - HARD
//Возможно, вы уже слышали об упорядоченных изоморфах с планеты Линейный Хаос — изобретателях всех методов сортировки.
//Сегодня нужно решить задачу от них: пользователь вводит с клавиатуры 5 чисел,
//метод сортирует числа по возрастанию, а другой метод — выводит их на экран.
//Осилите? Если да, возможно, вам следует посетить Линейный Хаос!
/*Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

        Пример ввода:
        3
        2
        15
        6
        17

        Пример вывода:
        2
        3
        6
        15
        17

        Требования:
        Программа должна считывать 5 чисел с клавиатуры.
        Программа должна выводить 5 чисел, каждое с новой строки.
        Выведенные числа должны быть отсортированы по возрастанию.
        Вывод должен содержать те же числа, что и были введены (порядок не важен).
        */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.security.Signature;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        int[] arr=new int[5];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<arr.length; i++ )
        {
         arr[i]=Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arr);
        for (int j=0; j<arr.length; j++ )
        {
            System.out.println(arr[j]);
        }
    }
}
