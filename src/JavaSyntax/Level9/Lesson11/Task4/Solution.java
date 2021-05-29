package JavaSyntax.Level9.Lesson11.Task4;

//Задача 4

//Какое сегодня число?

//Уровень - HARD

//В Java есть много инструментов, позволяющих работать со временем и датами.
// В этот раз будем пользоваться объектом Date и SimpleDateFormat, а задание у нас такое:
// пользователь должен ввести с клавиатуры дату в формате «2013-08-18»,
// а приложение должно трансформировать введенное в форму «AUG 18, 2013».

//Ввести с клавиатуры дату в формате "2013-08-18"
//Вывести на экран введенную дату в виде "AUG 18, 2013".
//Воспользоваться объектом Date и SimpleDateFormat.
//
//Требования:
//Программа должна считывать данные с клавиатуры.
//В программе должна быть объявлена переменная типа SimpleDateFormat.
//В программе должна быть объявлена переменная типа Date.
//Программа должна выводить данные на экран.
//Вывод должен соответствовать заданию

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        {
            System.out.println("Введите дату в формате 2013-08-18");
        }
        String dateIn = reader.readLine();

        SimpleDateFormat inputFormater = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH); // задаем формат, как будет считываться введенная строка

        Date date = inputFormater.parse(dateIn);// в объект date ложим спаршенную строку

        SimpleDateFormat outFormater = new SimpleDateFormat("MMM dd,yyyy"); // задаем формат, как бедет выглядеть выходная строка

        String str = outFormater.format(date); // ложим в строку нужного вида дату (format это функция)
        String upStr = str.toUpperCase(); //делаем буквы большими
        System.out.println(upStr);

    }

}

