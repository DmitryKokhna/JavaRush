package Level9.Lesson11.Task3;

//Задача 3
//Метод в try..catch
//Уровень - EASY

//Вероятно, каждый из вас хотя бы раз в жизни ошибался при вводе пароля или других текстов.
// Давайте защитим программу от случайного ввода «не тех» данных.
// В задачке пользователь вводит с клавиатуры числа, а если он введёт что-то другое,
// то должен сработать метод, перехватывающий исключение, и вывести на экран все ранее введенные числа.

//Написать программу, которая будет вводить числа с клавиатуры.
//Код по чтению чисел с клавиатуры должен быть в методе readData.
//Код внутри readData обернуть в try..catch.
//Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
//Числа выводить с новой строки сохраняя порядок ввода.
//
//Требования:
//Программа должна считывать данные с клавиатуры.
//Метод main не изменять.
//Метод main не должен кидать исключений.
//Метод readData должен содержать блок try..catch.
//Если пользователь ввел текст, а не число, программа должна вывести все ранее введенные числа.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args)  {
        readData();
    }

    public static void readData() {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList=new ArrayList<>();

       while (true) {
           try {
               int d2 = Integer.parseInt(reader.readLine());
               arrayList.add(d2);
           }
           catch (NumberFormatException | IOException ioe){
               for (Integer i : arrayList){
                   System.out.println(i);
               }
               break; //нужен  break т.к. постоянно вывод первого числа
           }

       }

        //code
    }

}
