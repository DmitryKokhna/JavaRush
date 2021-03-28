package Level8.Lesson11.Task12;

//Задача 12
// Задача по алгоритмам Ӏ Java Syntax: 8 уровень, 11 лекция

//Уровень - Medium

//Вероятно, вы уже знаете упорядоченных изоморфов с планеты Линейный Хаос,
// которые любят алгоритмы сортировки, поскольку ими думают.
// Вот вам задачка для изоморфов младшего школьного возраста: введите с клавиатуры 20 слов и выведите их в алфавитном порядке.
// А как сортировать? Придумайте, вы уже почти что линейный изоморф!

//Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.
//
//Требования:
//Программа должна выводить текст на экран.
//Программа должна считывать значения с клавиатуры.
//Класс Solution должен содержать три метода.
//Метод main() должен вызывать метод sort().
//Метод sort() должен вызывать метод isGreaterThan().
//Выведенные слова должны быть отсортированы в алфавитном порядке.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] array=new String[4];
        for(int i=0;i< array.length;i++){
            array[i]= reader.readLine();
        }
        sort(array);
        for (String word: array
             ) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < array.length-1; i++) {
                if (isGreaterThan(array[i], array[i+1])) {
                    String tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    needIteration = true;
                }
            }
        }
    }

    //Метод для сравнеия строк : "а" больше чем "б"

    public static boolean isGreaterThan(String a,String b){

        return a.compareTo(b) >0; // вернет FALSE- если строки по аффавиту, и вернет TRUE умли не по алфавиту. Так  FF и ZZ вернет false
    }
}
