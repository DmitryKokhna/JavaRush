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

        ArrayList<Human> childForChild = new ArrayList<>();
        ArrayList<Human> childForParents = new ArrayList<>();
        ArrayList<Human> childForGran1 = new ArrayList<>();
        ArrayList<Human> childForGran2 = new ArrayList<>();

        Human child1 = new Human("Ребенок_1", true, 10, childForChild);
        Human child2 = new Human("Ребенок_2", false, 12, childForChild);
        Human child3 = new Human("Ребенок_3", false, 14, childForChild);

        childForParents.add(child1);
        childForParents.add(child2);
        childForParents.add(child3);

        Human father = new Human("Отец", true, 40, childForParents);
        Human mother = new Human("Мать", false, 35, childForParents);
        childForGran1.add(father);
        childForGran2.add(mother);


        Human gF1 = new Human("Дед_1", true, 70, childForGran1);
        Human gF2 = new Human("Дед_2", true, 71, childForGran2);

        Human gM1 = new Human("Бабушка_1", false, 60, childForGran1);
        Human gM2 = new Human("Бабушка_2", false, 61, childForGran2);

        System.out.println(gF1.toString());
        System.out.println(gM1);
        System.out.println();
        System.out.println(gF2);
        System.out.println(gM2);
        System.out.println();
        System.out.println(father);
        System.out.println(mother);
        System.out.println();
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
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

