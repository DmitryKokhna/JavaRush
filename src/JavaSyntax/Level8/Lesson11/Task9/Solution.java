package JavaSyntax.Level8.Lesson11.Task9;

//Задача 9

//Работа с датой
//Уровен - HARD

//1. Реализовать метод isDateOdd(String date) так,
// чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false 2.
// String date передается в формате FEBRUARY 1 2013 Не забудьте учесть первый день года.
// Пример: JANUARY 1 2000 = true JANUARY 2 2020 = false

//1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
//2. String date передается в формате FEBRUARY 1 2013
//Не забудь учесть первый день года.
//
//Пример:
//JANUARY 1 2000 = true
//JANUARY 2 2020 = false
//
//Требования:
//Программа должна выводить текст на экран.
//Класс Solution должен содержать два метода.
//Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
//Метод main() должен вызывать метод isDateOdd().

import java.text.ParseException;
import java.util.Date;

public class Solution {

    public static void main(String[] args) throws ParseException {

        System.out.println(isDateOdd("JANUARY 2 2001"));

    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        Date date2 = new Date(date);
        date2.setDate(1);
        date2.setMonth(0);
        //Boolean res;
        long time1 =  date1.getTime();
        //System.out.println(time1);
        long time2 =  date2.getTime();
        //System.out.println(time2);
        int res = (int) ((time1-time2)/(1000*60*60*24))+1;
        //System.out.println(res+", "+res%2);
        return (res%2!=0);

    }
}

