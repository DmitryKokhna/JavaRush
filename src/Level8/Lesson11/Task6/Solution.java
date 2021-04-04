package Level8.Lesson11.Task6;

//Задача 6
//Собираем семейство

//Уровень -  HARD

//Попробуем создать программу для семейной переписи.
// Для этого пишем класс Human с полями имя(String), пол(boolean), возраст(int), дети (ArrayList Human).
// Для тренировки создайте объекты и заполните их данные так, чтобы получилось два дедушки, две бабушки, отец, мать, трое детей.
// Выведите объекты на экран.

//1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
//2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
//3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
//
//Требования:
//Программа должна выводить текст на экран.
//Класс Human должен содержать четыре поля.
//Класс Human должен содержать один метод.
//Класс Solution должен содержать один метод.
//Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.


import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        //code
    }
    public static class Human{
        //code
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if(childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
              return text;
            }

        }

    }

