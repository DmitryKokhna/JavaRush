package JavaSyntax.Level8.Lesson8.Task3;

import java.util.HashMap;
import java.util.Map;


//Задача 3
//Перепись населения

//Уровень - HARD

//Очень часто люди и прочие граждане Вселенной пытаются найти своих родственников.
// Сделаем шаг к программе поиска людей.
// В задачке нам нужно создать словарь (Map<String, String>) занести в него десять записей
// по принципу «Фамилия» - «Имя», после чего проверить, сколько людей имеют совпадающие с заданным имя или фамилию.

//Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
//Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
//
//Требования:
//Программа не должна выводить текст на экран.
//Программа не должна считывать значения с клавиатуры.
//Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
//Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
//Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.

public class Solution {

    public static Map<String, String> createMap(){
        Map<String,String> people = new HashMap<>();
        people.put("Кохна","Дима");

        people.put("Дуров","Андрей");
        people.put("Соколов","Андрей");

        people.put("Козлов","Саша");
        people.put("Степанов","Саша");
        people.put("Юхно","Саша");

        people.put("Петров","Сергей");
        people.put("Пушкин","Сергей");
        people.put("Покемонов","Сергей");
        people.put("Майхерский","Сергей");

return people;

    }

    public static int getCountTheSameFirstName(Map<String,String> map, String name){
        int countName=0;
        for (Map.Entry<String,String> map2 : map.entrySet()) {
            String nameValue=map2.getValue();
            if(nameValue.equals(name)){
                countName=countName+1;
            }

        }
return countName;
    }

    public static int getCountTheSameSecondName(Map<String,String> map, String lastName){
        int countLastName=0;
        for (Map.Entry<String,String> map2 : map.entrySet()) {
            String lastNameKey=map2.getKey();
            if(lastNameKey.equals(lastName)){
                countLastName=countLastName+1;
            }

        }
        return countLastName;
    }



    public static void main(String[] args) {
// Это по Заданию не требуется
//        System.out.println(createMap().toString());
//        System.out.println(getCountTheSameFirstName(createMap(),"Сергейч"));
//        System.out.println(getCountTheSameSecondName(createMap(),"Кохн"));


    }

}
