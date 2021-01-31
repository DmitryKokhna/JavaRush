package Level6.Lesson8.Task7;
// ЗАДАЧА 7
//"Калькулятор"
// MEDIUM

//Калькулятор — он как инициация в программировании.
//Каждый порядочный зелёный новичок просто обязан написать программу, которая складывает и вычитает.
//Теперь, когда мы уже умеем манипулировать классами и статическими методами,
//создадим нормальный такой калькулятор с четырьмя арифметическими действиями и даже взятие процента от числа!

public class Calcutator {
    public static int plus(int a, int b) // сложение
    {
        return a+b;
    }

    public static int minus(int a, int b) // деление
    {
        return a-b;
    }
    public static int multyply(int a, int b) // усножение
    {
        return a*b;
    }
    public static double devision(int a, int b) // деление
    {

        return (double) a / (double) b;
      }

      public static double percent(int a, int b)
      {

          return  (double)a*(double) b /100;
      }

    public static void main(String[] args) {
        System.out.println(minus(5,7));
        System.out.println(plus(3,14));
        System.out.println(multyply(8,8));
        System.out.println(devision(70,2));
        System.out.println(percent(70,50));
    }

}
