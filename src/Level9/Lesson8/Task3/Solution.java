package Level9.Lesson8.Task3;

//Задача 3
//Перехват выборочных исключений
//Уровень -  Medium

//Возможно, «злые» многоэтажные конструкции исключений кажутся вам сложными.
// Но на самом деле исключения — это просто, и это одна из самих ценных вещей в Java.
// На 9 уровне в это верится с трудом, всё-таки работа с ними с непривычки кажется очень запутанной.
// Без страха, вперёд: в этой задаче вам нужно будет разобраться с перехватом выборочных исключений.


//1. Разберись, какие исключения бросает метод BEAN.methodThrowExceptions.
//2. Метод handleExceptions должен вызывать метод BEAN.methodThrowExceptions и обрабатывать исключения:
//2.1. если возникло исключение FileSystemException, то логировать его (вызвать метод BEAN.log) и пробросить дальше
//2.2. если возникло исключение CharConversionException или любое другое IOException, то только логировать его (вызвать метод BEAN.log)
//3. Добавь в объявление метода handleExceptions класс исключения, которое ты пробрасываешь в п.2.1.
//4. В методе main обработай оставшееся исключение - логируй его. Используй try..catch
//
//Подсказка:
//Если ты захватил исключение MyException, которое не хотел захватывать, его можно пробросить дальше кодом вида:
//catch (MyException e) {
// throw e;
//}
//
//Требования:
//Метод handleExceptions должен вызывать метод BEAN.methodThrowExceptions.
//Метод handleExceptions должен логировать исключение FileSystemException (вызвать метод BEAN.log), а затем пробросить его дальше.
//Метод handleExceptions должен только логировать (вызвать метод BEAN.log) исключение CharConversionException.
//Метод handleExceptions должен только логировать любое исключение IOException.
//Добавь в объявление метода handleExceptions класс исключения FileSystemException.
//Метод main должен использовать try..catch.
//Метод main должен логировать исключения, которые кидает метод handleExceptions.

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {

        handleExceptions();
    }

    public static void handleExceptions() {

        BEAN.methodThrowExceptions();
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}
