package Level9.Lesson6.Task5;

//Задача 5
//Исключение при работе с коллекциями Map
//Уровень - Easy

//У нас есть сомнительный код, пора запускать агента по перехвату исключений.
// Вот он, наш код:[ HashMap<String, String> map = new HashMap<String, String>(null); map.put(null, null); map.remove(null);].
// Агент, ваше задание, как обычно, заключается в перехвате исключения и выводе его на экран.
// Не забудьте только при выводе указать тип этого исключения

//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//HashMap<String, String> map = new HashMap<String, String>(null);
//map.put(null, null);
//map.remove(null);
//
//Требования:
//Программа должна выводить сообщение на экран.
//В программе должен быть блок try-catch.
//Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
//Выведенное сообщение должно содержать тип возникшего исключения.
//Имеющийся код в методе main не удалять.

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        //code
        try {
        HashMap<String, String> map = new HashMap<String,String>(null);


            map.put(null,null);
            map.remove(null);
        }
        catch (NullPointerException n){
            System.out.println(n);
        }


    }
}
