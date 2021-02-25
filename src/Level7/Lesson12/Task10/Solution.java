package Level7.Lesson12.Task10;
//Задача 10
//В убывающем порядке
//Уровень - Medium
//Упорядоченые изоморфы с планеты Линейный Хаос любят сортировать и принимают в свои ряды тех, кто хорошо умеет это делать.
// Вы можете возразить, что не собираетесь иметь с ними дело.
// Не получится: изоморфы часто проводят собеседования в ИТ-компании.
// Не игнорируем: пишем программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

//Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
//
//        Требования:
//        Программа должна считывать 20 целых чисел с клавиатуры.
//        Программа должна выводить 20 чисел.
//        В классе Solution должен быть метод public static void sort(int[] array).
//        Метод main должен вызывать метод sort.
//        Метод sort должен сортировать переданный массив по убыванию



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int[] array =new int[20];
        for(int i=0;i<20;i++){
            array[i]=Integer.parseInt(reader.readLine());
        }
        sort(array);
        for(int x : array){
            System.out.println(x);
        }
    }
    public  static void  sort(int[] array){
        int[] arr2=new int[20];
       Arrays.sort(array);
       int count=array.length;
       for(int i=19;i>=0;i--)
       {
           int j= array.length-count;
           arr2[j]=array[i];
           count--;
       }
    System.arraycopy(arr2,0,array,0,array.length);

 //     Collections.reverse(Ints.asList(array)); - сортировку можно было сделать так, но РАШ не подтягивает такой импорт

        }
    }

