package JavaSyntax.Level8.Lesson11.Task10;

//Задача 10
//Номер месяца
//Уровень - Medium

//Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is the 5 month». Используйте коллекции.

//Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
//Используй коллекции.
//

//Требования:
//Программа должна считывать одно значение с клавиатуры.
//Программа должна выводить текст на экран.
//Программа должна использовать коллекции.
//Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        Map<String,Integer> month=new HashMap<>();
        month.put("January", 1);
        month.put("February", 2);
        month.put("March", 3);
        month.put("April", 4);
        month.put("May", 5);
        month.put("June", 6);
        month.put("July", 7);
        month.put("August", 8);
        month.put("September", 9);
        month.put("October", 10);
        month.put("November", 11);
        month.put("December", 12);

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String monthIn= reader.readLine();

         int numberOfMonth=0;
         int count=0;

        for (Map.Entry<String,Integer> map : month.entrySet()){
            if(monthIn.equals(map.getKey()))
            {
            numberOfMonth=map.getValue();
            count++;
            }
         }

        if(count>0) /// это Доп - по условия не требуется
        {
            System.out.println(monthIn+" is the "+numberOfMonth+" month");}
        else {
            System.out.println("Проверьте правильность ввода месяца");
        }

    }
}
