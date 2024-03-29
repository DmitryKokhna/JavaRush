package JavaSyntax.Level9.Lesson2.Task1;
//Задача 1
//Уровень - EASY
//Возвращаем StackTrace

//Принцип стека несправедлив и суров. Но иногда так полезен!
// Помните, что функция, вызванная последней, должна завершиться самой первой.
// Давайте попрактикуемся и посмотрим, что из этого выйдет: нам нужно написать пять методов,
// которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.

//Написать пять методов, которые вызывают друг друга.
//Каждый метод должен возвращать свой StackTrace.
//
//Требования:
//В классе должно быть 5 методов (метод main не учитывать).
//Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
//Каждый метод должен возвращать свой StackTrace.
//Для получения StackTrace воспользуйся Thread.currentThread().getStackTrace().

public class Solution {
    public static void main(String[] args) {
        method1();
           }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stackTraceElements =Thread.currentThread().getStackTrace();
        return stackTraceElements;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements =Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }

    public static StackTraceElement[] method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements =Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }

    public static StackTraceElement[] method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements1 =Thread.currentThread().getStackTrace();
        return stackTraceElements1;
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements =Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }
}
