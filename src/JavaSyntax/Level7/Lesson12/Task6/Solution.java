package JavaSyntax.Level7.Lesson12.Task6;
//ЗАДАЧА 6
//Семейная перепись
//Уровень - HARD

//Попробуем создать программу для семейной переписи.
// Для этого пишем класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
// Для тренировки создайте объекты и заполните их данные так, чтобы получилось два дедушки, две бабушки, отец, мать, трое детей.
// Выведите объекты на экран.

//Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
// Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
//
//Примечание:
//Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
//
//Пример вывода:
//Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
//Имя: Катя, пол: женский, возраст: 55
//Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
//...
//
//Требования:
//Программа не должна считывать данные с клавиатуры.
//Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
//Добавить в класс конструктор public Human(String name, boolean sex, int age).
//Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
//Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
//Выведи созданные объекты на экран.

public class Solution {
    public static void main(String[] args) {

        Human GranDad1=new Human("Gdad1",true,70);
        Human GrandMam1=new Human("Gmam1",false,60);

        Human GranDad2=new Human("Gdad2",true,71);
        Human GrandMam2=new Human("Gmam2",false,61);

        Human father=new Human("FatherName",true,40,GranDad1,GrandMam1);
        Human mother=new Human("MotherName",false,35,GranDad2,GrandMam2);

        Human child1=new Human("Children1",true,15,father,mother);
        Human child2=new Human("Children2",true,10,father,mother);
        Human child3=new Human("Children3",false,5,father,mother);

        System.out.println(GranDad1);
        System.out.println(GrandMam1);
        System.out.println(GranDad2);
        System.out.println(GrandMam2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);


    }
    public   static class  Human{
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, Boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString(){
            String text = "";
            text +="Имя: " + this.name;
            text +=", пол: " + (this.sex ? "мужской" : "женский");
            text +=", возраст: " + this.age;

            if(this.father !=null){
                text +=", отец: " + this.father.name;
            }

            if(this.mother !=null){
                text +=", мать: " + this.mother.name;
            }
            return text;
        }


    }
}
