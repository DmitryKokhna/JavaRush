package Level10.Lesson11.Task12;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> map = new HashMap<>();
        ArrayList<HashMap<Integer, String>> arrayList = new ArrayList<>();
        while(true) {
            String idAsString= reader.readLine();
            if (idAsString.isEmpty()){
                break;
            }
           int id = Integer.parseInt(idAsString);

            String name = reader.readLine();
            HashMap<String, String> map2 = new HashMap<>();
           map2.put(idAsString,name);
       //     map2.put(id, name);
//arrayList.add(map2);


        }

        for (int i=arrayList.size()-1;i>=0;i--){
            System.out.println(arrayList.get(i));
        }
//        for (Map.Entry<Integer, String> map2: map.entrySet()) {
//            System.out.println("Id="+ map2.getKey() + " Name="+map2.getValue());
//        }

    }
}
