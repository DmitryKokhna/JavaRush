package JavaSyntax.Level7.Lesson4.Task4;
// ЗАДАЧА 4
//Переверни массив
//Уровень - EASY
//На планете Линейный Хаос во время праздника неравнодействия её
//жители — упорядоченные изоморфы — отрываются по полной программе!
//Огромной популярностью пользуется народная забава «переверни массив».
//Приобщайтесь: создайте массив на 10 чисел, а затем расположите их в обратном порядке и выведите на экран.
//Изоморфы классно отрываются, не так ли?
// Создать массив на 10 чисел
// ВВести с клавиатуры 10 чисел и записать их в массив
// Вывести массив в обратном порядке

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] arr=new int[10];
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<10;i++){
            arr[i]=Integer.parseInt(reader.readLine());
                    }
        for(int j=9;j>=0;j--){
            System.out.println(arr[j]);
        }

    }

}
