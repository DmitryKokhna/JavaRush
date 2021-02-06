package Level6.Lesson11.Task9;
//ЗАДАЧА 9
// Родственные связи кошек
// Сложность -  HARD
//Готовая задача: у кошки есть имя и кошка-мама.
//Создать класс, который это описывает.
//Создать два объекта: кошку-дочь и кошку-маму.
// Вывести их на экран.
//Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
//Изменить Cat так, чтобы он мог описать эту ситуацию.
//Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
/*
Задача: У каждой кошки есть имя и кошка-мама.
        Создать класс, который бы описывал данную ситуацию.
        Создать два объекта: кошку-дочь и кошку-маму.
        Вывести их на экран.

        Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
        Изменить класс Cat так, чтобы он мог описать данную ситуацию.
        Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
        Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

        Пример ввода:
        дедушка Вася
        бабушка Мурка
        папа Котофей
        мама Василиса
        сын Мурчик
        дочь Пушинка

        Пример вывода:
        The cat's name is дедушка Вася, no mother, no father
        The cat's name is бабушка Мурка, no mother, no father
        The cat's name is папа Котофей, no mother, father is дедушка Вася
        The cat's name is мама Василиса, mother is бабушка Мурка, no father
        The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
        The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей

        Требования:
        Программа должна считывать имена 6 котов в указанном порядке.
        Метод main должен создавать 6 объектов типа Cat.
        Программа должна выводить 6 строк с информацией о котах.
        Строка про дедушку (первая) должна соответствовать условию.
        Строка про бабушку (вторая) должна соответствовать условию.
        Строка про папу (третья) должна соответствовать условию.
        Строка про маму (четвертая) должна соответствовать условию.
        Строка про сына (пятая) должна соответствовать условию.
        Строка про дочь (шестая) должна соответствовать условию.
        */
/* ublic class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String motherName= reader.readLine();

        Cat catMother =new Cat(motherName);

        String daughterName= reader.readLine();

        Cat catDaughter=new Cat(daughterName,catMother);

        System.out.println(catMother);
        System.out.println(catDaughter);
    }


    public static class Cat{
        private String name;
        private Cat parent;

        Cat(String name){
            this.name=name;
        }

        public Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }

        @Override
        public String toString() {
         if (parent == null){
             return "The cat's name is " + name +", no mother";}
         else{
             return "The cat's name is " + name + ", mother is " + parent.name;
        }}
    }
}
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String motherName= reader.readLine();

        Cat catMother =new Cat(motherName);

        String daughterName= reader.readLine();

        Cat catDaughter=new Cat(daughterName,catMother);

        System.out.println(catMother);
        System.out.println(catDaughter);
    }


    public static class Cat{
        private String name;
        private Cat mam;
        private Cat dad;

        Cat(String name){
            this.name=name;
        }

        public Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }

        @Override
        public String toString() {
         if (parent == null){
             return "The cat's name is " + name +", no mother";}
         else{
             return "The cat's name is " + name + ", mother is " + parent.name;
        }}
    }
}
