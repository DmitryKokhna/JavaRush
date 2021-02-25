package Level8.Lesson3.Task5;

import java.util.HashMap;
import java.util.Map;

// Задача 5
// На экране - знечени
// Уровень - Easy
// Вывести на экран значения из МАП. Используя мметод.
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
            System.out.println(text.getValue());
        }
    }
}
