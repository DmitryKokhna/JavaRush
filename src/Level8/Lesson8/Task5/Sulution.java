package Level8.Lesson8.Task5;
//Задача 5
// Нам повторы не нужны
//Уровень - HARD
// Сложно представить себе ситуацию, в которой может понадобиться программа, которую мы предлагаем вам написать.
// Впрочем, маленькая модификация, и она обретает практический смысл.
// Также её можно представить частью чего-то большего (поиска?).
// Давайте создим словарь, занесём в него записи по принципу «фамилия» - «имя» и удалим людей с одинаковыми именами.

//Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
//Удалить людей, имеющих одинаковые имена.
//
//Требования:
//Программа не должна выводить текст на экран.
//Программа не должна считывать значения с клавиатуры.
//Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
//Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
//Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().

import java.util.*;
import java.util.Collections;

public class Sulution {
    public static Map<String, String> createMap(){

        Map<String, String> map = new HashMap<>();

        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        map.put("e", "1");
        map.put("f", "5");
        map.put("g", "6");
        map.put("h", "2");
        map.put("j", "7");
        map.put("k", "8");

        return map;
    }
    public static void removeTheFirstNameDuplicate(Map<String,String> map) {
        Map<String,String> copy = new HashMap<>(map);
        for (String value : copy.values()){
            if(Collections.frequency(copy.values(),value)>1){
                removeItemFromMapByValue(map,value);
            }
        }
     }


    public static void removeItemFromMapByValue(Map<String,String> map, String value){
        Map<String , String> copy = new HashMap<>(map);
        for(Map.Entry<String,String> pair : copy.entrySet()){
            if(pair.getValue().equals(value)){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
Map<String,String>  map=createMap();
  for (Map.Entry<String,String> entry : map.entrySet()){
      System.out.println(entry.getKey()+" - "+entry.getValue());
  }
        System.out.println("------------");
removeTheFirstNameDuplicate(map);
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

    }
}
