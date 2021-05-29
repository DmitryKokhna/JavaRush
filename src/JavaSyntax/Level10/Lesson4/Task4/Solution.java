package JavaSyntax.Level10.Lesson4.Task4;

//Задача 4
//Задача №4 на преобразование целых типов
//Уровень - EASY

//Что тут у нас, в секретном центре JavaRush?
// У нас четвертая задача цикла «Преобразование целых типов».
// Вот её краткое условие: даны short number = 9, char zero = ‘0’ и int nine = (zero + number).
// Добавьте одну операцию по преобразованию типа, чтобы получился красивый правильный ответ: 9.
// Думаем, справитесь.

/*
Добавить одну операцию по преобразованию типа, чтобы получался ответ: nine=9
short number = 9;
char zero = '0';
int nine = (zero + number);
*/

public class Solution {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        System.out.println((char)(nine)); // переобразуем в CHAR, т.к. "57" в переводя в CHAR это символ "9"
    }

}
