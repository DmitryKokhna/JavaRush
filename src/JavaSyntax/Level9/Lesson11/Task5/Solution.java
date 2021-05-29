package JavaSyntax.Level9.Lesson11.Task5;

//Задача 5

//Гласные и согласные

//Уровень - HARD

//Это мы с вами чётко знаем, какие буквы гласные, а какие – согласные.
// Нам предстоит этому учить умных роботов, поэтому напишем программку для их обучения.
// В ней пользователь будет вводить с клавиатуры строку текста,
// а специальный метод поможет разделить данные на две строки,
// одна со всеми гласными введенной строки, вторая — только с согласными.

//Написать программу, которая вводит с клавиатуры строку текста.
//Программа должна вывести на экран две строки:
//1. первая строка содержит только гласные буквы из введённой строки.
//2. вторая - только согласные буквы и знаки препинания из введённой строки.
//Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
//Пример ввода:
//Мама мыла раму.
//
//Пример вывода:
//а а ы а а у
//М м м л р м .
//
//Требования:
//Программа должна считывать данные с клавиатуры.
//Программа должна выводить две строки.
//Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
//Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
//Каждая строка должна заканчиваться пробелом


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String str= reader.readLine();
        char[] arrChar=str.toCharArray();

        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> noVowels = new ArrayList<>();
        for (int i=0;i< arrChar.length;i++){
          if(isVowel(arrChar[i]) && !Character.isWhitespace(arrChar[i])) // проверяем, принадлежит ли буква к гласным и не является ли пробелом
            {
              vowels.add(arrChar[i]) ;
            }
          else if(!isVowel(arrChar[i]) && !Character.isWhitespace(arrChar[i])) { // проверяем, принадлежит ли буква к согласным и не является ли пробелом
              noVowels.add(arrChar[i]);
          }

        }
        //напишите тут ваш код
        for (Character ch1: vowels
             ) {
            System.out.print(ch1+" ");
        }

        System.out.println("");
        for (Character ch2: noVowels
             ) {
            System.out.print(ch2+" ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
