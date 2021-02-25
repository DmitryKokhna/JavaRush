package Level8.Lesson3.Task6;

// Задача 6
// Коллекция Map из Object
// Уровень - Easy
// Вывести на экран значения из МАП. Используя мметод.



import java.util.HashMap;
import java.util.Map;

//
//
public class Solution {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        for ( Map.Entry<String, Object> text: map.entrySet()
        ) {
            String key= text.getKey();
            Object value= text.getValue();

            System.out.println(key+" - "+ value);
        }


    }
}
