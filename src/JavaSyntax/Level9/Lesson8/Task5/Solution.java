package JavaSyntax.Level9.Lesson8.Task5;

//Задача 5
//Перехват unchecked-исключений
//Уровень - EASY

//«Но есть еще один вид исключений – это RuntimeException и классы, унаследованные от него.
// Их перехватывать не обязательно, ибо они — unchecked! Они загадочны,
// их появление трудно спрогнозировать и указывать в throws их не нужно», — гласит писание лекций JavaRush.
// Пришла пора: обработайте все unchecked-исключения в методе handleExceptions.

//В методе handleExceptions обработайте все unchecked исключения.
//Нужно вывести стек-трейс возникшего исключения используя метод printStack.
//Можно использовать только один блок try..catch
//
//Требования:
//Метод handleExceptions должен вызывать метод method1.
//Метод handleExceptions должен вызывать метод method2.
//Метод handleExceptions должен вызывать метод method3.
//Метод handleExceptions должен использовать только один блок try..catch.
//Метод handleExceptions должен отлавливать все unchecked исключения и выводить стек-трейс возникшего исключения, используя метод printStack.
//Метод handleExceptions не должен отлавливать checked исключения
//Программа должна выводить на экран текст.

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());
    }

    public static void handleExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (RuntimeException re){
            printStack(re); //вызываем метод для вывода СтакТрейс
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}