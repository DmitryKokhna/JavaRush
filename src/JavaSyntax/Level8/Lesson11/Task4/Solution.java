package JavaSyntax.Level8.Lesson11.Task4;

//Задача 4
//Минимальное из N чисел
//Уровень - Medium

//Программист ищет минимумы и максимумы везде, где может — среди двух чисел, в массиве, в списке…
// На восьмом уровне секретного центра JavaRush студенты изучают списки, поэтому этот важный момент наступил.
// Прямо сейчас можно попробовать найти минимум в списке из n чисел. Но прежде, чем искать минимум, нужно этот список сформировать.
// Вы еще здесь?

//1. Ввести с клавиатуры число N.
//2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
//3. Найти минимальное число среди элементов списка - метод getMinimum.
//
//Требования:
//Программа должна выводить текст на экран.
//Программа должна считывать значения с клавиатуры.
//Класс Solution должен содержать только три метода.
//Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов, заполненный числами с клавиатуры.
//Метод getMinimum() должен вернуть минимальное число среди элементов списка.
//Метод main() должен вызывать метод getIntegerList().
//Метод main() должен вызывать метод getMinimum().


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        List <Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer>  array){
        int minimumFromList= Collections.min(array);

        return minimumFromList;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //code
        List<Integer> integerList =new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   //     System.out.println("Введите размер Списка");
        int sizeOfList=Integer.parseInt(reader.readLine());
  //      System.out.println("Введите числа для списка");

        for(int i=0;i<sizeOfList;i++){
            int numberForList =Integer.parseInt(reader.readLine());
            integerList.add(numberForList);
        }

        return integerList;
    }
}
