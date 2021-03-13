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

import java.util.HashMap;
import java.util.Map;

public class Sulution {
    public static Map<String, String> createMap(){
        //код
    }
    public static void removeTheFirstNameDuplicates(Map<String,String> map){
        //код
    }
    public static void removeItemFromMapByValue(Map<String,String>, String value){
        Map<String , String> copy = new HashMap<>(map);
        for(Map.Entry<String,String> pair : copy.entrySet()){
            if(pair.getValue().equals(value)){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
