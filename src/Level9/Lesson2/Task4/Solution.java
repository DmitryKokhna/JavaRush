package Level9.Lesson2.Task4;

//Задача - 4

//Стек-трейс длиной 10 вызовов

//Мне повезло: в младших классах Марья Ивановна вечно писала на доске фразу:
// «Функция, вызванная последней, должна завершиться самой первой».
// И заставляла выучить её на память, заверяя, что когда-нибуть поймем.
// Спасибо, Марья Ивановна, кажется, этот день настал.
// Я даже могу написать код, чтобы получить стек-трейс длиной 10 вызовов. А вы можете?

//Напиши код, чтобы получить стек-трейс длиной 10 вызовов. Метод main изменять нельзя.
//
//Требования:
//В классе должно быть 10 методов (метод main не учитывать).
//В переменной stackTraceLength должно получиться значение 10.
//Каждый метод должен вызывать другой метод.
//Используй метод Thread.currentThread().getStackTrace().
public class Solution {
    public static void main(String[] args) throws Exception {
        int stackTraceLength = method1().length - method10().length + 1;
      //  System.out.println(stackTraceLength); // проверяем себя
    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
           //напишите тут ваш код
       return method3();
    }

    public static StackTraceElement[] method3() {
         return method4();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method4() {
    return method5();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method5() {
     return method6();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method6() {
     return method7();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method7() {
    return method8();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method8() {
     return method9();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {

        return Thread.currentThread().getStackTrace();
    }
}

