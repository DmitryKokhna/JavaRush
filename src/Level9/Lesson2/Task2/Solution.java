package Level9.Lesson2.Task2;

// Задача 2

// И снова StackTrace
// Уровень - Medium

//Давайте сразу перейдем к делу: напишите 5 методов, которые вызывают друг друга.
// Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
// Это имя — дальше, чем звезды. Но мы разберемся, это всего-навсего методы, которые последовательно вызывают друг друга, и ничего более.

//Написать пять методов, которые вызывают друг друга.
//Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
//
//Требования:
//В классе должно быть 5 методов (метод main не учитывать).
//Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
//Каждый метод должен возвращать имя метода, вызвавшего его.
//Для получения имени вызвавшего метода, используй метод getMethodName


public class Solution {
    public static void main(String[] args) {
        method1();

    }

    public static String method1() {
        method2();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

}
