package Level8.Lesson3.Task5;

// Задача 5
// На экране - знечени
// Уровень - Easy
// Вывести на экран значения из МАП. Используя мметод.
import java.util.HashMap;
import java.util.Map;

//
//
public class Solution {
    public static void main(String[] args) {
        Map<String , Object> map = new HashMap<>();
        map.put("Sim",5);
        map.put("Tom", 5.5);
        map.put("Arbus",false);
        map.put("Baby",null);
        map.put("Cat","Cat");
        map.put("Eat", new Long(56));
        map.put("Food",new Character('3'));
        map.put("Gevey",'6');
        map.put("Hugs",111111111111L);
        map.put("Comp",(double) 123);




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
