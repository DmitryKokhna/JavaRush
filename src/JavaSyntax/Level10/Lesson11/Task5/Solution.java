package JavaSyntax.Level10.Lesson11.Task5;

//Задача 5

//Количество букв

//Уровень --HARD

//Вам никогда не казалось, что букв в алфавите — слишком много?
// Компьютеры вполне обходятся двумя, а у нас их целых 33. Непозволительная избыточность!
// Тем не менее, приходится мириться с реальностью и решать соответствующие задачи.
// Вот одна из них: введите с клавиатуры 10 строчек и подсчитайте в них количество различных букв.

//Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.
//
//Пример вывода:
//а 5
//б 8
//в 3
//г 7
//д 0
//...
//я 9
//
//Требования:
//Программа должна 10 раз считывать данные с клавиатуры.
//Программа должна выводить текст на экран.
//Выведенный текст должен содержать 33 строки.
//Каждая строка вывода должна содержать букву русского алфавита, пробел и количество раз, которое буква встречалась в введенных строках.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        LinkedHashMap<Character, Integer> countMap=new LinkedHashMap<>(); // тут создаем именно LinkedHashMap т.е. буква "Ё" иначе будет идти после "Я"
        for (int i=0;i<alphabet.size();i++){
            countMap.put(alphabet.get(i),0);
        }
        //code
        for (String s: list
             ) {
char[] charsArr=s.toCharArray();
Integer letterCount=0;

            for (Character ch: alphabet
                 ) {
                for (int j=0;j<charsArr.length;j++)
                {
                    char bukva=charsArr[j];
                    if (ch.equals(bukva))
                    {
                      letterCount=countMap.get(bukva);
                        letterCount=letterCount+1;
                        countMap.put(bukva,letterCount);
                    }

                }

            }

        }

        for (Map.Entry<Character, Integer> pair : countMap.entrySet()
             ) {
            System.out.println( pair.getKey()+ " "+pair.getValue() );
        }
    }
}
