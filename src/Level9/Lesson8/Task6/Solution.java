package Level9.Lesson8.Task6;

//Задача 6
//Все свои, даже исключения
//Уровень - EASY

//Тема исключений в своё время будоражила умы молодых учёных и программистов,
// а сегодня от неё вскипают мозги студентов JavaRush.
// Попробуем создавать собственные исключения.
// Для этого даны классы MyException, MyException2, MyException3, MyException4.
// Унаследуем классы так, чтобы у вас появилось два любых checked- и два любых unchecked-исключения.


//Есть четыре класса MyException, MyException2, MyException3, MyException4.
//Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и любые два unchecked исключения.
//
//Подсказка:
//Изучи внимательно классы Exception1, Exception2, Exception3 из второй задачи этого блока.
//
//Требования:
//В классе Solution должно быть 4 вложенных класса: MyException, MyException2, MyException3 и MyException4.
//Все вложенные классы должны быть унаследованы от классов исключений.
//Два класса из четырех должны быть checked исключениями.
//Два класса из четырех должны быть unchecked исключениями.

import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args)  {
//checked исключения
        class MyException extends IOException {
        }

        class MyException2 extends FileNotFoundException {
        }
        // unchecked исключения
        class MyException3 extends ArithmeticException {
        }

        class MyException4 extends IndexOutOfBoundsException {
        }

    }
}
