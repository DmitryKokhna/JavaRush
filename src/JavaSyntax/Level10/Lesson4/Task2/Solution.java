package JavaSyntax.Level10.Lesson4.Task2;

// Задача 2
//Задача №2 на преобразование целых типов

//Уровень - EASY

//Вторая задача цикла «Преобразование целых типов» на первый взгляд не слишком отличается от предыдущей.
// Так и задумано, этот цикл создан специально для «набивания руки» и параллельного внедрения в мозг правил преобразования типов в Java.
// Расставьте правильно операторы приведения типа, чтобы получился ответ: d = 3.765. Операторы — в условии.



public class Solution {
    public static void main(String[] args) {
        int a= 15;
        int b = 4;
        float c = (float) a/b; // изначально не было приведения к FLOAT
        double d = a*1e-3 + c;
        System.out.println(d);
    }
}
