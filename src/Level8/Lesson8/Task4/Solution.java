package Level8.Lesson8.Task4;
//Задача 4
//Добрая Зинаида и летние каникулы
//Уровень - Hard

//Зинаида Васильевна — классный руководитель 7-Б класса какой-то там террианской школы,
// подробности не важны. А важно то, что она дарит подарки ученикам в дни рождения.
// Везет не всем: летние именинники — в пролёте по причине каникул.
// Пишем программу для Зинаиды: создаем словарь с фамилиями и датами рождения,
// удаляем из него людей, родившихся летом.


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

//Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
//Удалить из словаря всех людей, родившихся летом.
//
//Требования:
//Программа не должна выводить текст на экран.
//Программа не должна считывать значения с клавиатуры.
//Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
//Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
public class Solution {

    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов",dateFormat.parse("MAY 1 2012"));

        ///код
    }

    public static void removeAllSummerPeople(Map<String ,Date> map) {
        //код
    }

    public static void main(String[] args) {

    }
}
