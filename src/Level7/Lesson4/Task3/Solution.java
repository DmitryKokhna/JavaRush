package Level7.Lesson4.Task3;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ЗАДАЧА 3
//Общение одикоких массивов
//Уровень - MEDIUM
// 1. Создать массив на 10 строк.
//2. Создать массив на 10 чисел.
//3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
//
//Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
public class Solution {
    public static void main(String[] args) throws IOException {
        String[] arrStr=new String[10];
        int[] arrInt=new int[10];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            arrStr[i]= reader.readLine();
        }
        for(int j=0; j<10;j++){
            int lengthSrt= arrStr[j].length();
            arrInt[j]=lengthSrt;
        }

        for (int g=0;g<10;g++) {
            System.out.println(arrInt[g]);
        }
    }
}
