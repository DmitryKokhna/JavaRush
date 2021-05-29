package JavaSyntax.Level8.Lesson6.Task1;

//Задача - 1
// LinkedList и ArrayList
//Уровень - Easy

// Коллекции могут быть реализованы разными способами и нет единственного – самого правильного.
// При одном подходе одни операции являются быстрыми, а остальные медленными, при другом – все наоборот.
// Нет одного идеального, подходящего всем решения. Не будем мучится выбором и создадим сразу два списка — LinkedList и ArrayList

// Создать 2 списка - ArrayList и LinkedList

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {

    public static Object createArrayList(){
        ArrayList<Object> arrayList = new ArrayList<>(); // тут создаем ArrayList с переменной типа Объект

        return arrayList; // тут его возвращаем
    }

    public static Object createLinkedList(){
        LinkedList<Object> linkedList =new LinkedList<>(); // тут создаем LinkedList с переменной типа Объект
        return linkedList; // тут его возвращаем
    }

    public static void main(String[] args) {

    }
}
