package Level9.Lesson6.Task6;

//Задача 6
//Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
//Уровень - EASY


// Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
// Очередное задание по захвату исключений поступило сегодня в секретный центр JavaRush.
// В этот раз нам придется перехватить исключение, и сразу же вывести его на экран консоли.
// Не забыть указать его тип. А возникать оно будет при выполнении кода: int num=Integer.parseInt("XYZ"); System.out.println(num).

//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//int num=Integer.parseInt("XYZ");
//System.out.println(num);
//
//Требования:
//Программа должна выводить сообщение на экран.
//В программе должен быть блок try-catch.
//Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
//Выведенное сообщение должно содержать тип возникшего исключения.
//Имеющийся код в методе main не удалять.

public class Solution {
    public static void main(String[] args) {
        //code

        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch (NumberFormatException formatException){
            System.out.println(formatException);
        }

    }

}
