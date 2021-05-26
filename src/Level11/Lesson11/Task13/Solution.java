package Level11.Lesson11.Task13;

//задача 13

//Минимакс

//Уровень - Medium


//На вступительном экзамене в ясли упорядоченному изоморфу
// Васеньке с планеты Линейный Хаос задали задачку на нахождение максимума и минимума в массиве.
// Как вы помните (или нет), на этой планете все только и заняты упорядочиванием и сравнением.
// Васенька справился. А вы?

/**Напиши метод, который возвращает минимальное и максимальное числа в массиве.

        Требования:
        Программа не должна считывать данные с клавиатуры.
        Класс Pair не изменяй.
        Метод main не изменяй.
        Допиши реализацию метода getMinimumAndMaximum: он должен возвращать пару из минимума и максимума.
        Программа должна вывести правильный результат.
        Метод getMinimumAndMaximum не должен изменять массив inputArray.
*/
public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        // напишите тут ваш код



        return new Pair<Integer, Integer>(0, 0);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }

}
