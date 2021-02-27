package Level8.Lesson6.Task3;

//Задача 3
//Время для 10 тысяч вставок
//Уровень - Easy

//Много ли времени и усилий вы готовы потратить, чтобы получить какое-либо благо?
// Думаем, достаточно, вы же пытаетесь стать программистом прямо сейчас?
// Давайте посмотрим, сколько времени занимает 10 тысяч вызовов get для списков LinkedList и ArrayList.
// Метод getGetTimeInMs должен вернуть время своего исполнения в миллисекундах.

//Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
//Метод getGetTimeInMs должен вернуть время своего исполнения в миллисекундах.
//

//Требования:
//Программа должна выводить числа на экран.
//Метод main должен вызывать метод getGetTimeInMs только два раза.
//Метод insert10000(List list) должен вставлять 10тыс элементнов в список.
//Метод getGetTimeInMs должен вызывать метод insert10000 только один раз.
//Метод getGetTimeInMs должен вернуть время в миллисекундах, которое занимает 10 тысяч вызовов get для списка.


import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {




        System.out.println(getInsertTimeInMs(new ArrayList())); // создаем массив и сразу передаем его в метод, а метод сразу вкладываем в вывод
        System.out.println(getInsertTimeInMs(new LinkedList()));

    }

    public static long getInsertTimeInMs(List list)
    {
Date startDate =new Date();

long startMs = startDate.getTime();

      insert10000(list);
      Date endDate = new Date();
      long endMs = endDate.getTime();
      return (endMs - startMs);


    }

    public static void insert10000(List list){
        for(int i=0;i<10000;i++){
            list.add(0,new Object());
        }

    }
}
