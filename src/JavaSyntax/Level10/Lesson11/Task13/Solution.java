package JavaSyntax.Level10.Lesson11.Task13;
///!!! Так и  не понял, что идею задачи!!!!!!!!!!! СПИСАНА!!!!!
//Задача 13
//Задача по алгоритмам Ӏ Java Syntax: 10 уровень, 11 лекция
//Уровень - EASY

//Нам поступило новое детское задание от упорядоченных изоморфов с планеты Линейный Хаос.
// Вы ещё помните, что именно эти странные ребята выдумали все виды сортировки и постоянно в ней упражняются.
// Поэтому и задания такие странные, зацените: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
// Хотя… Надо попробовать!


/* Задача по алгоритмам
Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
Пояснение:
Самое минимальное число – 1-е минимальное.
Следующее минимальное после него – 2-е минимальное
Пример:
1 6 5  7  1  15   63   88
Первое минимальное – 1
Второе минимальное – 1
Третье минимальное – 5
Четвертое минимальное – 6
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int[] array = new int[30];
//        for (int i = 0; i < 30; i++)
//        {
//            array[i] = Integer.parseInt(reader.readLine());
//        }
        int[] array = {1, 6, 5, 7, 1, 15, 63, 88};
        sort(array);

        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //code
        Arrays.sort(array);
    }
}
