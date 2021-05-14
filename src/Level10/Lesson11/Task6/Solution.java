package Level10.Lesson11.Task6;

//Задача 6
//Конструкторы класса Human
//Уровень - Medium

//Люди — разные, и у каждого человека различные важные особенности.
// Скажем, этот — новорожденный, и у него есть только имя и мама, а этот — музыкант, и для него важны уровень исполнительского мастерства и его группа.
// Давайте напишем класс Human с 6 полями и придумаем для него 10 различных конструкторов.
// Каждый конструктор должен иметь смысл.


//Напиши класс Human с 6 полями.
//Придумай и реализуй 10 различных конструкторов для него.
//
//Требования:
//Программа не должна считывать данные с клавиатуры.
//В классе Human должно быть 6 полей.
//Все поля класса Human должны быть private.
//В классе Human должно быть 10 конструкторов.
//Все конструкторы класса Human должны быть public.


import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {

    }
    public  static class Human{
     private int a;
     private String b;
private boolean c;
private char d;
private int[] arr;
private ArrayList<Integer> arrayList;
//1
        public Human() {
        }
//2
        public Human(int a) {
            this.a = a;
        }
//3
        public Human(int a, String b) {
            this.a = a;
            this.b = b;
        }
//4
        public Human(int a, String b, boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
//5
        public Human(int a, String b, boolean c, char d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
//6
        public Human(int a, String b, boolean c, char d, int[] arr) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.arr = arr;
        }
//7
        public Human(int a, String b, boolean c, char d, int[] arr, ArrayList<Integer> arrayList) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.arr = arr;
            this.arrayList = arrayList;
        }
//8
        public Human(ArrayList<Integer> arrayList) {
            this.arrayList = arrayList;
        }
//9
        public Human(int[] arr) {
            this.arr = arr;
        }
//10
        public Human(char d) {
            this.d = d;
        }

        //code
    }
}
