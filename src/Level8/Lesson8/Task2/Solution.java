package Level8.Lesson8.Task2;

//Задача 2
//Больше 10? Вы нам не подходите
//  Уровень - HARD

//Перевалочный пункт Оддиозо ищет сотрудников.
// Единственное условие: количество конечностей у них не должно превышать более десяти конечностей (мы не знаем, откуда взялась такая дискриминация).
// Поможем им программой, в которой создадим множество чисел(Set<Integer>), занесем туда 20 различных чисел,
// а затем удалить из множества все числа больше 10.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//Удалить из множества все числа больше 10.
//
//Требования:
//Программа не должна выводить текст на экран.
//Программа не должна считывать значения с клавиатуры.
//Класс Solution должен содержать только три метода.
//Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
//Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
public class Solution {



    public static Set<Integer> createSet(){
        Set<Integer> integerSet = new HashSet<>();
for (int i=0; i<20;i++){
    integerSet.add(i+5);
    }
return integerSet;
    }

    public static Set<Integer> remobeAllNumberGreaterThan10(Set<Integer> set){

        Iterator<Integer> iteratorFromSet = set.iterator();

        while (iteratorFromSet.hasNext()){

            Integer number = iteratorFromSet.next();
            if(number>10){
                iteratorFromSet.remove();
            }
        }
        return set;
    }
    public static void main(String[] args) {
        System.out.println(createSet().toString());
        System.out.println(remobeAllNumberGreaterThan10(createSet()));
    }

}
