package Level7.Lesson12.Task3;
//Задача 3
//Минимаксы в массивах
//Уровеннь - Medium
//В жилмассиве Трещина — всего 20 домов, но их номера проставляются от фонаря.
//        Получается, конец и начало Трещины формируются случайным образом.
//        Потому как так интереснее и непредсказуемее! Пишем мини-эмулятор Трещины: определим его начало и конец.
//        Для этого запихнем жилмассив в массив, заполним его номерами домов, и найдем среди них наибольший и наименьший

// Создать массив на 20 чисел.
//Заполнить его числами с клавиатуры.
//Найти максимальное и минимальное числа в массиве.
//Вывести на экран максимальное и минимальное числа через пробел.
//
//Требования:
//В классе Solution создай статический публичный метод int[] getInts().
//Метод getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.
//В методе main создай и проинициализируй массив с помощью метода getInts(), найди и выведи через пробел максимальный и минимальный элемент массива.
//Используй цикл for.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String name = reader.readLine();

            if(name == null || name.isEmpty())
            {
                break;
            }
            Cat cat = new Cat(name);
            CATS.add(cat);
        }
        printList();
    }
    public static void printList(){
        for(int i=0; i<CATS.size(); i++){
            System.out.println(CATS.get(i));
        }
    }
public static class Cat{
        private String name;
        private int age;
        private int weight;
        private int tailLength;

    public Cat(String name, int age, int weight, int tailLength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "Cat's name: " +name +", age=" + age + ", weight=" + weight + ", tailLength=" + tailLength;
    }
}
}
