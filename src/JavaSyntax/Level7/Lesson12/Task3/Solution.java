package JavaSyntax.Level7.Lesson12.Task3;
//Задача 3
// Минимаксы в массивах
//Уровень -Medium
// Создать массив на 20 чисел.
//Заполнить его числами с клавиатуры.
//Найти максимальное и минимальное числа в массиве.
//Вывести на экран максимальное и минимальное числа через пробел.
//
//Требования:
//В классе Solution создай статический публичный метод int[] getInts().
//Метод getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.
//В методе main создай и проинициализируй массив с помощью метода getInts(), найди и выведи через пробел максимальный и минимальный элемент массива.
//Используй цикл for.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        int[] arrayMain=getInts();
        int maximum = max(arrayMain);
        int minimum = min(arrayMain);


        System.out.println(maximum + " " + minimum);
    }
   public static int[] getInts() throws IOException {
        int[] array=new int[20];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<20;i++){
            array[i]=Integer.parseInt(reader.readLine());
        }
       return array;
    }

    public static int max(int[] array){
        int max=array[0];
        for(int j=1;j<20;j++){
            if(array[j]>max)
            {
                max=array[j];
            }
        }
        return max;
    }
    public static int min(int[] array){
        int min=array[0];
        for(int k=1;k<20;k++){
            if(array[k]< min)
            {
                min=array[k];
            }
        }
        return min;
    }
}
