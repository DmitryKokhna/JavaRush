package JavaSyntax.Level10.Lesson11.Task12;

//Задача 12
//Функциональности маловато!
//Уровень - HARD

//Старая задача: с клавиатуры вводятся пары (число и строка), затем они выводятся на экран.
// Новая задача: вводим с клавиатуры те же пары, сохраняя их в HashMap.
// Пустая строка – конец ввода данных. Числа могут повторяться, а строки — нет.
// Введенные данные не должны потеряться! Затем программа выводит содержание HashMap на экран, каждую пару с новой строки.

//Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
//Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.
//
//Ключевые требования:
//Пустая строка - конец ввода данных.
//Числа могут повторяться.
//Строки всегда уникальны.
//Введенные данные не должны потеряться!
//Затем программа должна выводить содержание HashMap на экран.
//Каждую пару - с новой строки.
//
//Пример ввода:
//1
//Мама
//2
//Рама
//1
//Мыла
//
//Пример вывода:
//1 Мыла
//2 Рама
//1 Мама
//
//Требования:
//Программа должна считывать данные с клавиатуры.
//Программа должна выводить текст на экран.
//В методе main объяви переменную коллекции HashMap и сразу проинициализируй ee.
//Программа должна помещать в HashMap пары считанные с клавиатуры.
//Программа должна выводить на экран содержимое HashMap согласно условию. Ключ и значение разделены пробелом. Каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author KDA
 * @version 1.1
 */
public class Solution {


    public static void main(String[] args) throws IOException {
/**
 * @Тут создали обманку для JR - т.к. он требует только HashMap
 * @Но ремешение проще с  LinkedHashMap - для инвертирования в дальнейшем
 */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> stringIntegerHashMap2=new HashMap<>();// для JavaRush нужно HashMap , поэтому создаем обманку "stringIntegerHashMap2"
        HashMap<String, Integer> stringIntegerHashMap=new LinkedHashMap<>();

        /**
         * @Проверка на ввод
         */

        while (true) {
            String   stringForId= reader.readLine();
if (stringForId.isEmpty())
{
    break;
}
            int id = Integer.parseInt(stringForId);
            String name = reader.readLine();
            stringIntegerHashMap.put(name,id);
         //   stringIntegerHashMap2.put(name,id); // для JavaRush нужно HashMap , поэтому создаем обманку "stringIntegerHashMap2"
        }
        /**
         * @Создаем 2 Списка, куда потом положим Строки и Integer
         * @делаем так, чтобы сделать "псевдо-инверсию" HashMap
         */
        ArrayList<String> stringArrayList=new ArrayList<>();
        ArrayList<Integer> integerArrayList=new ArrayList<>();

        /**
         * @используя foreach ложим в каждый список значения из МАП
         */
        for (Map.Entry<String, Integer> map: stringIntegerHashMap.entrySet()) {
stringArrayList.add(map.getKey());
integerArrayList.add(map.getValue());
        }
        /**
         * @Выводим согласно условия
         */
        for (int i=stringArrayList.size()-1;i>=0;i--){
            System.out.println(stringArrayList.get(i)+" "+ integerArrayList.get(i));
        }
    }

}



