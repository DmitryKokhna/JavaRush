package JavaSyntax.Level8.Lesson6.Task6;

//Задача 6
// Cамая длинная последовательность
// Уровень - HARD

//Если числа повторяются, значит, это кому-нибудь нужно? В данный момент это нужно нам, чтобы потренироваться решать задачи на списки.
// Давайте создадим список чисел и добавим в него 10 чисел с клавиатуры. Наша задача состоит в том,
// чтобы вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

//1. Создай список чисел.
//2. Добавь в список 10 чисел с клавиатуры.
//3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
//
//Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
//3
//
//Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
//
//Требования:
//Программа должна выводить число на экран.
//Программа должна считывать значения с клавиатуры.
//В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
//Программа должна добавлять в коллекцию 10 чисел, согласно условию.
//Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<10;i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        int count = 1;
        int maxNumbers = 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i-1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxNumbers) {
                maxNumbers = count;
            }
        }



        System.out.println(maxNumbers);
}


    }

