package Level9.Lesson11.Task13;

//Задача 13

//Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция

//Уровень - HARD

/*Вместо кубиков жители планеты Линейный Хаос дают своим детям решать задачки на сортировку.
 Вот вам одна из забавок маленьких упорядоченных изоморфиков, развлекитесь, как следует:
после того, как пользователь введет с клавиатуры список слов (и чисел),
программа должна вывести слова в возрастающем порядке, а числа — в убывающем.
*/

/*Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
22
0
Арбуз
Пример вывода:
Арбуз
22
Боб
3
Вишня
1
0
Яблоко
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line= reader.readLine();

      while (!line.isEmpty()){
          list.add(line);
          line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);
        for (String x : array) {
            System.out.println(x);
        }
    }
    public static void sort(String[] array) {
  //code
    }

    //метод для сравнения строк: "а" больше чем "b"
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    //переданая строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // Строка содержит '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }
            //не цифра и не начинается с "-"
            if (!Character.isDigit(character) && character != '-')
            {
                return false;
            }

            //одиночный "-"
             if(chars.length == 1 && character == '-')
                      {
                return false;
            }
        }
        return true;
    }
}
