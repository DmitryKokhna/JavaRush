package Level7.Lesson4.Task2;
//ЗАДАЧА 2
//Массив из строчек в обратном порядке
//Уровень- MEDIUM

//Нет, мы не будем инвертировать каждую строку массива так, чтобы она вывелась на экран зеркально.
//Это условие другой задачи! А здесь и сейчас мы должны создать массив на 10 строк,
//ввести с клавиатуры 8 строк и сохранить их в массив, после чего вывести содержимое
//всего массива (10 элементов) на экран в обратном порядке

//1. Создать массив на 10 строк.
//2. Ввести с клавиатуры 8 строк и сохранить их в массив.
//3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SimpleTimeZone;

public class Solution {
    public static void main(String[] args) throws IOException {
        String[] arrayString=new String[10];


        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<8;i++){
            arrayString[i]= reader.readLine();
        }
        for (int j=9; j>=0;j--){

        System.out.println(arrayString[j]);
        }

    }
}
