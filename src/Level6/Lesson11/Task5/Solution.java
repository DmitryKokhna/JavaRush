package Level6.Lesson11.Task5;
//ЗАДАЧА 5
//Блокнот для новых идей
// Уровень - Medium
//Крутые идеи нужно записывать, они забываются очень быстро.
//Для этого в классе Solution создадим статический класс Idea,
//а в нем — метод public String getDescription(), который будет возвращать любой непустой текст.
//Затем создадим статический метод public void printIdea(Idea idea) — он выведет описание нашей идеи на экран.
// ЗАДАНИЕ

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1. В классе Solution создать public static класс Idea.
//2. В классе Idea создать метод public String getDescription(), который будет возвращать любую строку.
//3. В классе Solution создай статический метод public void printIdea(Idea idea),
//   который будет выводить на экран описание идеи - это то, что возвращает метод getDescription().
public class Solution {
    public static void main(String[] args)  {
        printIdea(new Idea()); // передаем в  методПринт объект от класса Идея (передаем сразу создавая его
                               // чтобы не создавать  отдельно объект от класс Идея и передавать "готовый" объект
    }

    public static void printIdea(Idea idea) // метод на вход принимает объект от внутреннего класса Идея идея
    {
        System.out.println(idea.getDescription()); // высодим на экран - для чего нужен объект от класса Идея и метод от класса Идея
    }
    public static class Idea // внутренний класс
    {
        public String getDescription() // метод внутреннего класса, который возвращает любую нашу строку
        {
        return "строка2";
        }
    }

}
