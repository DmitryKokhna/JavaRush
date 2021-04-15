package Level9.Lesson2.Task3;

// Задача 3
//Уровень - EASY

// Кто меня вызывал?

// Стек вызовов, может, не самая красивая конструкция…
// Хотя почему нет? Он логичен, к нему просто привыкнуть нужно.
// Привыкаем с задачами! В этот раз вам нужно написать пять методов, которые вызывают друг друга.
// Метод должен вернуть номер строки кода, из которого вызвали этот метод.
// Для этого воспользуйтесь функцией: element.getLineNumber().


// Написать пять методов, которые вызывают друг друга.
//Метод должен вернуть номер строки кода, из которого вызвали этот метод.
//Воспользуйся функцией: element.getLineNumber().
//
//Требования:
//В классе должно быть 5 методов (метод main не учитывать).
//Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
//Каждый метод должен возвращать номер строки кода, из которого вызвали этот метод.
//Для получения номера строки, используй метод getLineNumber класса StackTraceElement.

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return  /*напишите тут ваш код*/ traceElements[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return  /*напишите тут ваш код*/ traceElements[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return  /*напишите тут ваш код*/ traceElements[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return  /*напишите тут ваш код*/ traceElements[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return  /*напишите тут ваш код*/ traceElements[2].getLineNumber();
    }
}
