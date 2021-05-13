package Level10.Lesson11.Task7;

//Задача 7
//Расставьте минимум static-ов
//Уровень - EASY

//Минимум статиков, максимум результата, — таков девиз вашего следующего задания.
// В нем вам придеться проанализировать уже написанный кем-то добрым код, и понять,
// где этот добрый человек забыл поставить статики. Код-то не компилируется.
// Но не нужно тыкать их везде, постарайтесь поставить их как можно меньше


//Требования:
//1.В классе должна быть переменная A.
//2.В классе должна быть переменная B.
//3.В классе должна быть переменная C.
//4.В классе должна быть переменная D.
//5.Метод main не изменять.
//6.Метод getA не изменять.

public class Solution {
    public static int A = 5; // добавили сюда STATIC, но можно и убрать
    public static int B = 5; // добавили сюда STATIC
    public static int C = 5; // добавили сюда STATIC
    public static int D = 5;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Solution.D = 5 * D * C;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}
