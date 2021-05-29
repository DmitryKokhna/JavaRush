package JavaSyntax.Level6.Lesson8.Task2;
// ЗАДАЧА 2
//Статические методы для кошек
//EASY

//Секретный центр JavaRush заключил соглашение с заводчиками котов, и теперь поставляет им приложения.
//В частности, при изучении геттеров и сеттеров начинающие разработчики пишут для кошколюбов программу подсчета кошек.
//Пришла ваша пора: создайте класс Cat со статическими методами, с помощью которых можно получить или изменить количество котов.

public class Cat
{
    public static int catCount = 0;
    public Cat()
    {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;
    }

    public static void main(String[] args) {

    }

}
