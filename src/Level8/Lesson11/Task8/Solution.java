package Level8.Lesson11.Task8;

//Задача 8
//Пять победителей
//Уровень - Medium

//На корабле JRush прошёл многоэтапный конкурс по скоростному решению задач на массивы среди студентов 7-8 уровней.
// Среди 20 полуфиналистов пятеро с максимальными баллами считаются победителями.
// Итак, у нас есть массив с баллами полуфиналистов (баллы могут быть даже отрицательными).
// Выведем на экран великолепную пятёрку победителей.

//Создать массив на 20 чисел.
//Заполнить его числами с клавиатуры.
//Вывести пять наибольших чисел.
//Каждое значение с новой строки.
//
//Требования:
//Программа должна выводить числа на экран.
//Программа должна считывать значения с клавиатуры.
//Класс Solution должен содержать два метода.
//Метод sort() должен сортировать массив чисел от большего к меньшему.
//Метод main() должен вызывать метод sort().
//Программа должна выводить пять наибольших чисел масси


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
    public static void sort(int[] array) {

         Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }

    }
}
