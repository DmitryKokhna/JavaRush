package JavaSyntax.Level9.Lesson2.Task5;

//Задача 5
//Там, в синих глубинах стек-трейса…
//Уровень - EASY

//Помните золотое правило: функция А вызывает функцию Б, а та вызывает функцию В.
// И чтобы выйти из А, надо сначала выйди из Б, а для этого надо выйти из В.
// Вспомнили? Вот и хорошо.
// А теперь напишем метод, который возвращает результат – глубину его стек-трейса – количество методов в нем
// (количество элементов в списке). И ещё: пускай это число метод выведет на экран.

//Написать метод, который возвращает результат - глубину его стек-трейса - количество методов в нем (количество элементов в списке).
//Это же число метод должен выводить на экран.
//
//Требования:
//Метод getStackTraceDepth должен возвращать глубину своего стек-трейса.
//Метод getStackTraceDepth должен выводить на экран глубину своего стек-трейса.
//Воспользуйся методом Thread.currentThread().getStackTrace().
//Метод main должен вызывать метод getStackTraceDepth.


public class Solution {
    public static void main(String[] args) {
        int deep=getStackTraceDepth();
     //   System.out.println(deep); // - !!!! Вот так неправильно, валидатор не принимает!!!
    }
    public static int getStackTraceDepth(){
StackTraceElement[] str = Thread.currentThread().getStackTrace();

int deep2 = str.length;
        System.out.println(deep2); // нужно вывотить тут, тогда принимаем валидатор
        return deep2;

    }
}