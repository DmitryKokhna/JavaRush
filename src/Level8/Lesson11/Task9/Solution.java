package Level8.Lesson11.Task9;

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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws ParseException {

        System.out.println(isDateOdd("JANUARY 1 2000"));

    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date dateInput = simpleDateFormat.parse(date);

       // int year = dateInput.getYear();

        Date dateStartYear = new Date();

        dateStartYear.setDate(1);
        dateStartYear.setMonth(Calendar.JANUARY);
    //    dateStartYear.setYear(year);

        long difDate = dateInput.getTime() - dateStartYear.getTime();

        long day = difDate / (1000 * 3600 * 24);
        if (day % 2 == 0) {
            return false;
        } else {
            return true;
        }

    }
}

