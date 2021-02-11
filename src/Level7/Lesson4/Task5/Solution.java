package Level7.Lesson4.Task5;
//ЗАДАЧА 5
// Один дольшой массив и два маленьких
// Уровень - MEDIUM
//1. Создать массив на 20 чисел.
  //      2. Ввести в него значения с клавиатуры.
    //    3. Создать два массива на 10 чисел каждый.
      //  4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
        //5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Требования:
//Программа должна создавать большой массив на 20 целых чисел.
//Программа должна считывать с клавиатуры 20 чисел для большого массива.
//Программа должна создавать два маленьких массива на 10 чисел каждый.
//Программа должна скопировать одну половину большого массива в первый маленький,
// а вторую - во второй и вывести второй маленький массив на экран.
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrF = new int[20];
        for (int i = 0; i < 20; i++) {
            arrF[i] = Integer.parseInt(reader.readLine());
        }

        int[] arrS = new int[10];
        int[] arrT = new int[10];

        for (int j = 0; j < 10; j++) {
             arrS[j] = arrF[j];
            }
            for(int k=10;k<20;k++){
                int arrIndex=k-10;
                arrT[arrIndex] = arrF[k];
            }

        for (int g = 0; g < 10; g++) {
          System.out.println(arrT[g]);
        }

    }
}





