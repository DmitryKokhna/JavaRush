package JavaSyntax.Level8.Lesson3.Task4;
// Задача 4
//Вывести на экран список ключей
// Уровень - Easy

import java.util.HashMap;
import java.util.Map;

//
//
public class Solution {
    public static void main(String[] args) {
        Map<String , String> map = new HashMap<>();
        map.put("Sim1","Sim");
        map.put("Tom","Tom");
        map.put("Arbus","Arbus");
        map.put("Baby","Baby");
        map.put("Cat","Cat");
        map.put("Dog","Dog");
        map.put("Eat","Eat");
        map.put("Food","Food");
        map.put("Gevey","Gevey");
        map.put("Hugs1","Hugs");

        printKeys(map);

    }

    public static void printKeys(Map<String, String > map)
    {
        for ( Map.Entry<String, String> text: map.entrySet()
             ) {
            System.out.println(text.getKey());
        }
    }
}
