package Level9.Lesson11.Task13;
// НЕ САМ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
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
//Требования:
//    Программа должна считывать данные с клавиатуры.
//    Программа должна выводить данные на экран.
//    Выведенные слова должны быть упорядочены по возрастанию (используй готовый метод isGreaterThan).
//    Выведенные числа должны быть упорядочены по убыванию.
//    Метод main должен использовать метод sort.
//    Метод sort должен использовать метод isGreaterThan.
//    Метод sort должен использовать метод isNumber.
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
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s == null || s.isEmpty()) {
                break;
            }
            list.add(s);
        }
        String[] array = list.toArray(new String[0]);
        sort(array);
        for (String x : array) {
            System.out.println(x);
        }
    }
    public static void sort(String[] array) {
        List<Integer> numbers = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        for (String s : array) {
            if (isNumber(s))
                numbers.add(Integer.parseInt(s));
            else
                strings.add(s);
        }
        Collections.sort(numbers, Collections.<Integer>reverseOrder());
        Collections.sort(strings);
        isGreaterThan("", "_");
        int numberCount = 0;
        int stringCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = numbers.get(numberCount) + "";
                numberCount++;
            } else {
                array[i] = strings.get(stringCount);
                stringCount++;
            }
        }
    }
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
