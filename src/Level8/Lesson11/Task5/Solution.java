package Level8.Lesson11.Task5;

//Задача 5

//Омовение Рамы

//Уровень - HARD

//undefined
//10
//Задача
//
//Java Syntax,  8 уровень,  11 лекция
//Омовение Рамы
//Когда-то жил и правил легендарный древнеиндийский царь Рама.
// И, вероятно, была та, которая его родила.
// Не факт, что она мыла его самостоятельно (царица всё-таки), но да простят нам знатоки эту невинную историческую фантазию.
// Напишем программу, которая заменит текст «мама мыла раму» на «Мама Мыла Раму»


//Написать программу, которая вводит с клавиатуры строку текста.
//Программа заменяет в тексте первые буквы всех слов на заглавные.
//Вывести результат на экран.
//
//Пример ввода:
//мама мыла раму.
//
//Пример вывода:
//Мама Мыла Раму.
//
//Требования:
//Программа должна выводить текст на экран.
//Программа должна считывать строку с клавиатуры.
//Программа должна заменять в тексте первые буквы всех слов на заглавные.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        System.out.println(toUpperCaseForFirstLetter(string));
    }
    private static String toUpperCaseForFirstLetter(String text) {
        StringBuilder builder = new StringBuilder(text);
        //выставляем первый символ заглавным, если это буква
        if (Character.isAlphabetic(text.codePointAt(0)))
        {
            builder.setCharAt(0, Character.toUpperCase(text.charAt(0)));
        }

        //крутимся в цикле, и меняем буквы, перед которыми пробел на заглавные
        for (int i = 1; i < text.length(); i++)
        {
                     if (Character.isAlphabetic(text.charAt(i)) && Character.isSpaceChar(text.charAt(i - 1)))
                {
             builder.setCharAt(i, Character.toUpperCase(text.charAt(i)));
         }
        }

        return builder.toString();
    }

}
