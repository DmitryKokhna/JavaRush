package JavaSyntax.Level7.Lesson6.Task1;
//ЗАДАЧА 1
// Уровень - EASY
// "Что за список такой?"

import java.io.IOException;
import java.util.ArrayList;

//1. Создай список строк.
//        2. Добавь в него 5 различных строк.
//        3. Выведи его размер на экран.
//        4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
//
//        Требования:
//        Программа не должна ничего считывать с клавиатуры.
//        Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
//        Программа должна добавить 5 любых строк в список.
//        Программа должна вывести размер списка на экран.
//        Программа должна вывести содержимое списка на экран, каждое значение с новой строки.
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrListStr=new ArrayList<>();
        arrListStr.add("q");
        arrListStr.add("w");
        arrListStr.add("e");
        arrListStr.add("r");
        arrListStr.add("t");

          System.out.println(arrListStr.size()+" this is size of array"); // The text don't need to add for solving.
        for (int j=0;j<arrListStr.size();j++){
            System.out.println(arrListStr.get(j) +" this is "+j +" an element"); // The text don't need to add for solving.
        }
    }
}
