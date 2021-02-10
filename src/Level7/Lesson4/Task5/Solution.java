package Level7.Lesson4.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// ЗАДАЧА 1
//Массивный максимум
//Уровень - MEDIUM
//1. В методе initializeArray(): 1.1. Создайте массив на 20 чисел 1.2. Считайте с консоли 20 чисел и заполните ими массив
//2. Метод max(int[] array) должен находить максимальное число из элементов массива
public class Solution {
    public static void main(String[] args) throws IOException {
        int[] array= initializeArray();
        int max=max (array);
        System.out.println(max);
        int [] a=new int[];
    }


    public static int[] initializeArray() throws IOException
    {
        int [] arr=new int[20];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<20;i++){
            try {
                arr[i]=Integer.parseInt(reader.readLine());
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        return arr;
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
}
