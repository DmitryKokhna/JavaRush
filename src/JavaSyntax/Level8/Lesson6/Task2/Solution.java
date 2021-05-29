package JavaSyntax.Level8.Lesson6.Task2;

//Задача - 2
//10 тысяч удалений и вставок
// Уровень - EASY

// Повторение однообразных действий без нытья и катанья — вот чем славны компьютеры, вот чего помогают избегать программисты простым смертным!
// Не будь средств автоматизации повторений, условие этой задачи звучало бы как приговор.
// А так вроде бы все нормально: для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.

//Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
//
//Требования:
//Программа не должна выводить текст на экран.
//Программа не должна считывать значения с клавиатуры.
//Класс Solution должен содержать только 5 методов.
//Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
//Метод get10000(List list) должен вызывать 10 тысяч раз get у списка.
//Метод set10000(List list) должен вызывать 10 тысяч раз set у списка.
//Метод remove10000(List list) должен удалять 10 тысяч элементов из списка.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //ArrayList

        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        //LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list){
        for (int i=0;i<10000;i++){
            list.add(i);
        }

    }
    public static void get10000(List list){
        for (int i=0;i<10000;i++){
            list.get(i);
        }

    }
    public static void set10000(List list){
        for (int i=0;i<10000;i++){
            list.set(i,i);
        }

    }
    public static void remove10000(List list){
        for (int i=0;i< list.size();i++){
            list.remove(i);
            i--;
        }

    }


}
