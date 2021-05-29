package JavaSyntax.Level9.Lesson2.Task6;

//Задача 6
//Логирование стек-трейса
//Уровень - EASY

//Если вы занимаесь чем-то более или менее серьезно, вы, так или иначе, придете к логированию.
// Не медлим, реализуем метод log.
// Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log),
// а также переданное сообщение.
// Имя класса, имя метода и сообщение разделим для наглядности двоеточием с пробелом.

//Реализовать метод log.
//Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
//Имя класса, имя метода и сообщение разделить двоеточием с пробелом.
//
//Пример вывода:
//com.javarush.task.task09.task0906.Solution: main: In main method
//
//Требования:
//Метод log должен выводить сообщение на экран.
//Выведенное сообщение должно содержать имя класса, метод которого вызвал метод log.
//Выведенное сообщение должно содержать имя метода, который вызвал метод log.
//Выведенное сообщение должно содержать переданное сообщение.
//Вывод должен соответствовать примеру из задания.

public class Solution {

    public static void main(String[] args) {
        log("Im main method");
    }

    public static void log(String text){
        // code
        StackTraceElement[] str = Thread.currentThread().getStackTrace();

     int deep = str.length; // для валидации в JavaRush нудно задать deep равным 2

//
     String  nameClass=Thread.currentThread().getStackTrace()[deep-1].getClassName();
String nameMethod=Thread.currentThread().getStackTrace()[deep-1].getMethodName();
       System.out.println(nameClass+": "+nameMethod+": "+text);
    }

}
