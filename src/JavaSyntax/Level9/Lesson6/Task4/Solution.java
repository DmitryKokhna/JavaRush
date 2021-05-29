package JavaSyntax.Level9.Lesson6.Task4;

//Задача 4
//Исключение при работе с коллекциями List
//Уровень - EASY

//К девятому уровню мы уже получили некоторое представление о коллекциях List,
// и об исключениях. Свяжем эти знания воедино: перехватим исключения при выполнении следующего кода
// [ArrayList<String> list = new ArrayList<String>(); String s = list.get(18);].
// Перехватим, и выведем на экран с указанием его типа.

//Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
//ArrayList<String> list = new ArrayList<String>();
//String s = list.get(18);
//
//Требования:
//Программа должна выводить сообщение на экран.
//В программе должен быть блок try-catch.
//Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
//Выведенное сообщение должно содержать тип возникшего исключения.
//Имеющийся код в методе main не удалять.

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //code

        ArrayList<String> list = new ArrayList<>();
        try {
            String s = list.get(18);
        }
        catch (IndexOutOfBoundsException outList){
            System.out.println(outList);
        }
    }
}
