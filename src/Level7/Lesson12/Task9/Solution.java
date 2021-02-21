package Level7.Lesson12.Task9;
// ЗАДАЧА 9
// Меняем функциональность
// Уровень - Medium
//В архиве пылится старенькая решённая задача. В ней нужно вводить строки, а затем,
// после введения пустой строки, все буквы в строках конвертировались в верхний регистр.
// Модернизируйте задачу: программа должна построить новый список.
// Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
// Ввод строк оставляем без изменений.

//Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
// Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
//
//        Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//        Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
//        Программа выводит содержимое нового списка на экран.
//
//        Пример ввода:
//        Кот
//        Коты
//        Я
//
//        Пример вывода:
//        Кот Кот Кот
//        Коты Коты
//        Я Я Я
//
//        Требования:
//        Программа должна считывать данные с клавиатуры.
//        Программа должна вывести столько же строк, сколько было введено.
//        Если в строке было четное число букв, то необходимо удвоить строку (как в примере).
//        Если в строке было нечетное число букв, то необходимо утроить строку (как в примере).
//        Программа должна прекращать считывать данные с клавиатуры как только пользователь введет пустую строку и нажмет Enter.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String > strings =new ArrayList<>();

        while(true){
            String string = reader.readLine();
            if(string==null || strings.isEmpty()){
                break;}
            else {
            strings.add(string);}
        }
        ArrayList<String> resultStrings = new ArrayList<>();
        for(int i=0; i<strings.size();i++){
            String string = strings.get(i);
            resultStrings.add(string.toLowerCase());
        }
        for(int i=0; i<resultStrings.size();i++){
            System.out.println(resultStrings.get(i));
        }
    }
}
